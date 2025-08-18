package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Employee {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
		PreparedStatement ps = c.prepareStatement("update company set cid=?,cname=? where cid=4");
		ps.setInt(1, 4);
		ps.setString(2, "IBM");
		ps.executeUpdate();
		System.out.println("Data is inserted...");
		c.close();
	}

}
