package entity;

import java.sql.Connection;
import java.sql.DriverManager;

//資料庫連線
public class DBConnectiom {
	public static Connection getConnection() throws Exception {
		
		Connection conn= null;
		
		String Drivate = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/spring_client?useSSL=false&serverTimezone=Asia/Taipei";
				// sql8.0.13版本後除了資料庫位址外，接著輸入一個問號並且要加上資料庫所在的時區
				String user = "root";
				String password = "1234567890";
				Class.forName(Drivate);
				conn=  DriverManager.getConnection(url, user, password);
				return conn;
		
	}
		
			 
			
}
