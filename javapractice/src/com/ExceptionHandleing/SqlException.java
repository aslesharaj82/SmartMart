package com.ExceptionHandleing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class SqlException {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//Downloading Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driverloaded succesfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch68", "root", "root");
		Statement st = con.createStatement();
		String s = "select * from emp ";
		ResultSet rt = st.executeQuery(s);
		while (rt.next()) {
			System.out.print(rt.getInt(1) + " " + rt.getString(2) + " " + rt.getString(3) + " "
					+ rt.getInt(4) + " " + rt.getDate(5));
			System.out.println("********************");
		}
		con.close();
	}

}
