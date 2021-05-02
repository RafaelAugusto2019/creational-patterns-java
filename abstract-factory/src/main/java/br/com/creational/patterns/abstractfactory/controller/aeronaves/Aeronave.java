package br.com.creational.patterns.abstractfactory.controller.aeronaves;

import br.com.creational.patterns.abstractfactory.model.AeronaveModel;

public interface Aeronave {
	
	AeronaveModel aeronaveModel = new AeronaveModel();
	
	AeronaveModel constroiAeronave();
	String monstrarNome();
	
}
