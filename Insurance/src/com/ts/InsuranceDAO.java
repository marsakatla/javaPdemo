package com.ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsuranceDAO
{
	public UserBean isUser(String uid,String pwd)
	{
		UserBean details = new UserBean();
	
	{String role="";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rk","root","root");
			
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select role from underwriter where user_id='"+uid+"' and password='"+pwd+"'");
			while(rs.next())
			{
				details.setRole(rs.getString(1));
				details.setUsername(rs.getString(2));
			}
				//{role=rs.getString(1);}
			rs.close();
			con.close();
			//return role;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			return details;
		}
			//e.printStackTrace();
			//return role;
	
		}
		
	}
}
