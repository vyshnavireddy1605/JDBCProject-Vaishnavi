package com.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorsModuleMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htc","root","Root");
		//create the statement
		{
	    PreparedStatement ps=con.prepareStatement("insert into Doctors values(?,?,?,?)");
	    ps.setInt(1, 106);
		ps.setString(2, "Dr.Nachal");
		ps.setString(3, "MBBS");
		ps.setString(4, "maternal&childhealth");
		ps.executeUpdate();
		System.out.println("inserted succesfully");

	    }

			{
				
		PreparedStatement ps1=con.prepareStatement("delete from Doctors where Did=?");
		ps1.setInt(1, 106);
		ps1.executeUpdate();
		System.out.println("deleted succesfully");
	        }
			{
		        PreparedStatement ps2=con.prepareStatement("update Doctors set Specilization=? where Did=?");
				ps2.setString(1, "General");
				ps2.setInt(2, 103);
				ps2.executeUpdate();
				System.out.println("Updated succesfully");

			}
			{
				PreparedStatement ps3=con.prepareStatement("select * from Doctors");
				ResultSet rs=ps3.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
				}
				con.close();
				System.out.println("view succesfully");
				
			}
			con.close();
	}
}