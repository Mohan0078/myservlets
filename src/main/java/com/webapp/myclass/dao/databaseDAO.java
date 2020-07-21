package com.webapp.myclass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.webapp.myclass.model.fetch_from_database;

public class databaseDAO {

	public fetch_from_database getData(String city) {
		fetch_from_database data = new fetch_from_database();
//		data.setCity_id(10001);
//		data.setCity("Bilaspur");
//		data.setCountry_id("101");
		
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?autoReconnect=true&useSSL=false","mohan","system");
		   Statement stmt = con.createStatement();
		   ResultSet rs = stmt.executeQuery("select * from city where city='"+city+"'");
		   if(rs.next())
		  {
				data.setCity_id(rs.getInt("city_id"));
				data.setCity(rs.getString("city"));
				data.setCountry_id(rs.getString("country_id"));
				
		   }
		}
		catch(Exception e)
		{
			System.err.println();
		}
		
		
		return data;
	}
}
