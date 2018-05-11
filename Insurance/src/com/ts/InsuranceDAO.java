package com.ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsuranceDAO
{
	public String isUser(String uid,String pwd)
	{String role="";
		try
		{
			Class.forName("com.mysql.jdbc.driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3036/rk","root","root");
			
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select role from underwriter where user_id='"+uid+"' and password='"+pwd+"'");
			while(rs.next())
				{role=rs.getString(1);}
			rs.close();
			con.close();
			return role;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return role;
		}
		
	}
}
