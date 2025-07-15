package DBConnection


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

	private static final String USER = "postgres";
	private static final String PASSWORD ="1234";
	
	private static final String URL = "jdbc://postgresql://localhost:5432/javaproject";

		
		public static Connection getConnection() {
			try {
				return DriverManager.getConnection(URL,USER, PASSWORD);
				
			}catch(SQLException e) {
				System.err.println("Database connection failed:"+e.getMessage());
				return null;
			}
		}

	}
