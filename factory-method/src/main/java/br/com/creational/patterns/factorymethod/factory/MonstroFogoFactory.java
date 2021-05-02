package br.com.creational.patterns.factorymethod.factory;

import br.com.creational.patterns.factorymethod.controller.Monstro;
import br.com.creational.patterns.factorymethod.controller.MonstroFogo;

public class MonstroFogoFactory implements MonstroFactory{

	public Monstro geraMonstroFactory() {	
		return new MonstroFogo();
	}

}
