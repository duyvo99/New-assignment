package com.hcc.advWeb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoListServlet
 */
@WebServlet("/InfoListServlet")
public class InfoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PrintWriter out = response.getWriter();
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String connURL = "jdbc:mysql://localhost:3306/exam1?characterEncoding=utf8&serverTimezone=UTC";
		String user = "root";
		String pwd = "123456789";
		conn = DriverManager.getConnection(connURL, user, pwd);
//		stmt = conn.createStatement();
//		rs = stmt.executeQuery("Select * from student");
		
//		rs = stmt.executeQuery("Select id from student");
		
//		StringBuffer sb = new StringBuffer();
//		sb.append("<table border='1'><th>St. No.</th><th>First Name </th><th>Last Name</th><th>Address</th></tr>");
//		
//		while (rs.next()) {
//			sb.append("<tr><td>");
//			String id = rs.getString("id");
//			sb.append(id);
//			sb.append("</td><td>");
//			String firstname = rs.getString("fname");
//			sb.append(firstname);
//			sb.append("</td><td>");
//			String lastname = rs.getString("lname");
//			sb.append(lastname);
//			sb.append("</td><td>");			
//			String city = rs.getString("address");
//			sb.append(city);
//			sb.append("</td></tr>");
//		}
//		sb.append("</table>");
//		out.println(sb.toString());
		
		
		out.println("<h1>Success</h1>");
		
		
		String stFName = request.getParameter("contact_name");
		String stEmail = request.getParameter("contact_email");
		String stMess = request.getParameter("contact_message");
		if (stFName != null && !stFName.equals(null)) {
			String sql = "INSERT INTO info (FullName, Email, Message) VALUES (?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, stFName);
			st.setString(2, stEmail);
			st.setString(3, stMess);
			st.execute();
		}
		
		}
		catch(SQLException | ClassNotFoundException e) {
			out.println("Ouch !! SOME THING BAD HAPPENED !");
			e.printStackTrace(out);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
