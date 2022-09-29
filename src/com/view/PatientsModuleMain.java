package com.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientsModuleMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htc","root","Root");
		//create the statement

		{
			PreparedStatement ps1=con.prepareStatement("insert into Patients values(?,?,?,?,?,?,?,?)");
		    ps1.setInt(1, 18);
			ps1.setString(2, "vicky");
		    ps1.setString(3, "male");
			ps1.setString(4, "childcheckup");
			java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
			ps1.setDate(5, sqlDate);
			ps1.setString(6, "106");
			ps1.setString(7, "Dr.Nachal");
			ps1.setObject(8, "2022-09-28");
			ps1.executeUpdate();
			System.out.println("inserted succesfully");
		}
		
		{
			PreparedStatement ps1=con.prepareStatement("delete from Patients where pid=?");
			ps1.setInt(1, 12);
			ps1.executeUpdate();
			System.out.println("deleted succesfully");
		}
		{
	        PreparedStatement ps1=con.prepareStatement("update Patients set Disease=? where pid=?");
			ps1.setString(1, "TeethPain");
			ps1.setInt(2, 12);
			ps1.executeUpdate();
			System.out.println("Updated succesfully");

		}
		{
			
			PreparedStatement ps1=con.prepareStatement("select * from Patients");
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getDate(5));
				System.out.println(rs.getString(6));
				System.out.println(rs.getString(7));
				System.out.println(rs.getDate(8));
			}
			con.close();
			System.out.println("view succesfully");
			
		}
		con.close();
	}
}
