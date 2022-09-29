package com.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NaturalJoin {

	public static void main(String[] args) {
		{
			System.out.println("NaturalJoin");
			    try
			    {
			    	Class.forName("com.mysql.jdbc.Driver");
					//create the connection
					  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htc","root","Root");
					  
					
						 Statement st = con.createStatement();
						 
						 String query="select pid,pname,qualification,specilization from Doctors,Patients where Doctors.Did=Patients.Did";
						 		ResultSet res = st.executeQuery(query);
						 
						 System.out.println("Did\tDname\tQualification\tSpecilization\tpid\tpname\tGender\tDisease\tAdmitDate\tDischargeDate");
						 
						 
						 st.close();
						 
						 }
					
					 catch(Exception e)
					 {
						 System.out.println(e.getMessage());
						 e.printStackTrace();
					 }
			    
			    }
	}

}
