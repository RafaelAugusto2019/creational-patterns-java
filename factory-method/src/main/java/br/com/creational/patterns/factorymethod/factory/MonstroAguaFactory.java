package br.com.creational.patterns.factorymethod.factory;

import br.com.creational.patterns.factorymethod.controller.MonstroAgua;
import br.com.creational.patterns.factorymethod.interfaces.Monstro;
import br.com.creational.patterns.factorymethod.interfaces.MonstroFactory;

public class MonstroAguaFactory implements MonstroFactory{

	public Monstro geraMonstro() {	
		return new MonstroAgua();
	}

}
