package br.com.creational.patterns.singleton.services;

public class Connection {
	
	public boolean status = true;
	
	public String execQuery(String query) {
		
		return "Query: "+ query +" executada!";
	}
	
}
