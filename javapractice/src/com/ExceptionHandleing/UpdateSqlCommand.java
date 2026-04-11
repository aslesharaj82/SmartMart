package com.ExceptionHandleing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateSqlCommand {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch68","root","root");
		Statement st= con.createStatement();
		String s= "update emp set sal=1800 where ename='Smith'";
		int rs=st.executeUpdate(s);
		System.out.println(rs);
		con.close();
	}

}
