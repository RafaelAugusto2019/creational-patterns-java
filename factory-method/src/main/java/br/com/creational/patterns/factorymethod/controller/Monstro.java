package br.com.creational.patterns.factorymethod.controller;

import br.com.creational.patterns.factorymethod.model.MonstroModel;

public interface Monstro {
	
	MonstroModel geraMostro();
	String geraAtaque();

}
