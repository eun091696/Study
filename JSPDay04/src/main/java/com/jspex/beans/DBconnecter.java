package com.jspex.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnecter {
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mariadb://localhost:3307/member";
			String dbID = "ace";
			String dbPassword = "1234";
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbID, dbPassword);
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch(SQLException e) {
			System.out.println("DB 접속 실패");
		} catch(Exception e) {
			System.out.println("알 수 없는 오류" + e);
		}
		return conn;
	}
}
