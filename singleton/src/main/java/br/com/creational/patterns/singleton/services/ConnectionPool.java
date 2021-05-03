package br.com.creational.patterns.singleton.services;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
		
	private static final ConnectionPool singletonConnection = new ConnectionPool();
	private List<Connection> listConections = new ArrayList<Connection>();
	private final int totalConections = 2;
	
	private ConnectionPool() {
		
		for (int i = 0; i < totalConections; i++) {			
			listConections.add(new Connection());
		}
		
	}
	
	public static ConnectionPool getInstancia() {
		return singletonConnection;
	}
	
	public Connection getConnection() throws Exception{
		
		for (Connection connection : listConections) {
			if (connection.status) {
				connection.status = false;
				return connection;
			}
		}
		
		throw new Exception("error - don't have connections!");
		
	}
	
	
	public String leaveConnection(Connection connection) {
		connection.status = true;
		return "Connection is freedom";
	}
}
