package br.com.creational.patterns.singleton;

import br.com.creational.patterns.singleton.services.Connection;
import br.com.creational.patterns.singleton.services.ConnectionPool;

public class Main {

	public static void main(String[] args) {
		
		try {
			Client2("Juliana");
			Client3("Marcos");
			Client1("Rafael");

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void Client1(String name) throws Exception{
		ConnectionPool connectionPool = ConnectionPool.getInstancia();
		
		Connection connection = connectionPool.getConnection();
		String response = connection.execQuery("select * from client where name = " + name);
		System.out.println(response);
		
//		connectionPool.leaveConnection(connection);
	}
	
	public static void Client2(String name) throws Exception{
		ConnectionPool connectionPool = ConnectionPool.getInstancia();
		
		Connection connection = connectionPool.getConnection();
		String response = connection.execQuery("select * from client where name = " + name);
		System.out.println(response);
		
//		connectionPool.leaveConnection(connection);

	}
	
	public static void Client3(String name) throws Exception{
		ConnectionPool connectionPool = ConnectionPool.getInstancia();
		
		Connection connection = connectionPool.getConnection();
		String response = connection.execQuery("select * from client where name = " + name);
		System.out.println(response);
		
//		connectionPool.leaveConnection(connection);

	}

}
