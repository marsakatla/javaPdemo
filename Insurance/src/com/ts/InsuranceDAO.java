package com.ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsuranceDAO
{
	public String isUser(String uid,String pwd)
	{
		try
		{
			Class.forName("com.mysql.jdbc.driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3036/insurance","root","root");
			String role="";
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select role from underwriter");
			while(rs.next())
				role=rs.getString(0);
			rs.close();
			con.close();
			return role;
		}
		catch(Exception e)
		{
			
		}
		return pwd;
	}
}
