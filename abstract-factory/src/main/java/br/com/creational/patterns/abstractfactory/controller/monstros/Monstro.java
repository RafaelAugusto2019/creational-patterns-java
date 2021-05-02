package br.com.creational.patterns.abstractfactory.controller.monstros;

import br.com.creational.patterns.abstractfactory.model.MonstroModel;

public interface Monstro {
	
	MonstroModel monstroModel = new MonstroModel();
	
	MonstroModel nascerMonstro();
	String monstrarNome();
}
