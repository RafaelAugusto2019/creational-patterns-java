package br.com.creational.patterns.factorymethod.factory;

import br.com.creational.patterns.factorymethod.controller.Monstro;
import br.com.creational.patterns.factorymethod.controller.MonstroAgua;

public class MonstroAguaFactory implements MonstroFactory{

	public Monstro geraMonstroFactory() {	
		return new MonstroAgua();
	}

}
