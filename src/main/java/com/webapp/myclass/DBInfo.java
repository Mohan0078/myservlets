package com.webapp.myclass;
public class DBInfo {
	static String host = "jws-app-mysql"; // The standard name in Tomcat+ MySQL on openshift

	static String DBname = "root";
	static int port = 3306; // This is for MySQL
	static String mySQLdbURL = "jdbc:mysql://" + host + ":" + port + "/"
			+ DBname;

	static String user = "system";
	static String password = "system";
	
	static String driver = "com.mysql.jdbc.Driver";

	public DBInfo() {

	}

	static String getDBURL() {
		return mySQLdbURL;
	}

	public static String getUser() {
		return user;
	}

	public static String getPassword() {
		return password;
	}

	public static String getDriver() {
		return driver;
	}

}