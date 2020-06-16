package creationalDesignPatterns.objectPoolDesignPattern.projectJDBCConnectionPool.Main;



import java.sql.Connection;

import creationalDesignPatterns.objectPoolDesignPattern.projectJDBCConnectionPool.ReusablePool.JDBCConnectionPool;

//Object Pool Design Pattern JDBC ConnectionPool.
//Using a JDBCConnectionPool as an ObjectPool for database connections.
public class Main {
	public static void main(String args[]) {
		System.out.println("Object Pool Design Pattern JDBC ConnectionPool.");
		System.out.println("Using a JDBCConnectionPool as an ObjectPool for database connections:\n");

		// Create the ConnectionPool:
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String databaseURL = "jdbc:mysql://localhost/mydb";
		//Database Credentials:
		String username = "Username"; 			
		String password = "Password";
		JDBCConnectionPool pool = new JDBCConnectionPool(jdbcDriver, databaseURL, username, password);

		// Get a Connection from the Pool:
		Connection connection = pool.checkOut();

		// Use the connection
		System.out.println("Using the DataBase Connection.");

		// Return/Release the Connection back to the Pool:
		pool.checkIn(connection);
	}
}
