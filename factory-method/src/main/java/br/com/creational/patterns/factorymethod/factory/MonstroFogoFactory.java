package br.com.creational.patterns.factorymethod.factory;

import br.com.creational.patterns.factorymethod.controller.MonstroFogo;
import br.com.creational.patterns.factorymethod.interfaces.Monstro;
import br.com.creational.patterns.factorymethod.interfaces.MonstroFactory;

public class MonstroFogoFactory implements MonstroFactory{

	public Monstro geraMonstroFactory() {	
		return new MonstroFogo();
	}

}
