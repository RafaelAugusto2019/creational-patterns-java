package br.com.creational.patterns.monostate.service;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
		
	private static List<Connection> listConections = new ArrayList<Connection>();
	private final static int totalConections = 2;
	
	static {	
		for (int i = 0; i < totalConections; i++) {			
			listConections.add(new Connection());
		}
		System.out.println("Runned static");
	}
	
	public ConnectionPool() {
		System.out.println("Create an object ConnectionPool");
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
