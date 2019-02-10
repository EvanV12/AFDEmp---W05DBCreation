package thedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	Connection connection;
	DriverManager dm;
	Statement stm;

	public Database() {
		// TODO Auto-generated constructor stub
	}

	public java.sql.Connection connect(String _DB_URL, String _username, String _password) {
		try {
			connection = DriverManager.getConnection(_DB_URL, _username, _password);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Ooops problems with the server/database!");
			return null;
		}
		
	}
	
	public int executeStatement(String sql) {
		try {
			stm = connection.createStatement();
			return stm.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("Definitely you did something wrong!");
			return -22;
		}
		
	}
}

