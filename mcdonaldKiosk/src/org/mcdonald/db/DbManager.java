//package org.mcdonald.db;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//
//public class DbManager {
//	static {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//
//	public void connection() {
//		
//		try(Connection con = 
//				DriverManager.getConnection(
//						"jdbc:oracle:thin:@localhost:9090:XE",
//						"hr",
//						"hr")){
//			System.out.println(con);
//		} catch (Exception e) {
//			System.out.println("���� ����");
//		}
//		
//	}
//}
