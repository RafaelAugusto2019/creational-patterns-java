package br.com.creational.patterns.monostate.service;

public class Connection {
	
	public boolean status = true;
	
	public String execQuery(String query) {
		
		return "Query: "+ query +" executada!";
	}
	
}
