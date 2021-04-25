package br.com.creational.patterns.factorymethod.interfaces;

import br.com.creational.patterns.factorymethod.model.MonstroModel;

public interface Monstro {
	
	MonstroModel geraMostro();
	String geraAtaque();

}
