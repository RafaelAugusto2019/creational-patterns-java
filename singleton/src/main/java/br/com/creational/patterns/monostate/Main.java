package br.com.creational.patterns.monostate;

import br.com.creational.patterns.monostate.service.Connection;
import br.com.creational.patterns.monostate.service.ConnectionPool;

public class Main {

	public static void main(String[] args) {
		try {
			client1("Lucas");
			client2("Paulo");
			client3("Pedro");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public static void client1(String name) throws Exception{
		ConnectionPool connectionPool = new ConnectionPool();
		
		Connection connection = connectionPool.getConnection();
		String response = connection.execQuery("select * from client where name = " + name);
		System.out.println(response);
		
		connectionPool.leaveConnection(connection);
	}
	
	public static void client2(String name) throws Exception{
		ConnectionPool connectionPool = new ConnectionPool();
		
		Connection connection = connectionPool.getConnection();
		String response = connection.execQuery("select * from client where name = " + name);
		System.out.println(response);
		
//		connectionPool.leaveConnection(connection);
	}
	
	public static void client3(String name) throws Exception{
		ConnectionPool connectionPool = new ConnectionPool();
		
		Connection connection = connectionPool.getConnection();
		String response = connection.execQuery("select * from client where name = " + name);
		System.out.println(response);
		
//		connectionPool.leaveConnection(connection);
	}
	


}
