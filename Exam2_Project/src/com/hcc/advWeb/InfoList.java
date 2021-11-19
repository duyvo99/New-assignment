package com.hcc.advWeb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.hcc.advWeb.util.DatabaseUtil;


public class InfoList {
	
	private ArrayList<Info> infoList = new ArrayList<Info>(); 

	public InfoList() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Info> getInfoList() {
		
		try {
		Connection conn = DatabaseUtil.getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("select * from info");
		
		while (rs.next())
		{
			Info info = new Info();
			
			String fullName = rs.getString("FullName");
			
			String email = rs.getString("Email");
			
			String mess = rs.getString("Message");
			
			info.setFullName(fullName);
			info.setEmail(email);
			info.setMess(mess);
			infoList.add(info);
			}
		}
		catch(SQLException e)
		{
			e.getMessage();
		}
		
		return infoList;
	}

	public void setInfoList(ArrayList<Info> infoList) {
		this.infoList = infoList;
	}

	
}
