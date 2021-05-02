package br.com.creational.patterns.factorymethod.simples.controller;

import br.com.creational.patterns.factorymethod.model.MonstroModel;

public interface Monstro {
	
	MonstroModel geraMostro();
	String mostraNome();

}
