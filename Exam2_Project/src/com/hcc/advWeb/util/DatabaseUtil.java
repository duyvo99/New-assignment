package com.hcc.advWeb.util;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {

	public DatabaseUtil() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection()
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
	
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String connURL = "jdbc:mysql://localhost:3306/exam1?characterEncoding=utf8&serverTimezone=UTC";
		String user = "root";
		String pwd = "123456789";
		conn = DriverManager.getConnection(connURL, user, pwd);
		}
		catch (SQLException e)
		{
			e.getMessage();
		}
		catch (ClassNotFoundException e)
		{
			e.getMessage();
		}
		
		return conn;
	}
}
