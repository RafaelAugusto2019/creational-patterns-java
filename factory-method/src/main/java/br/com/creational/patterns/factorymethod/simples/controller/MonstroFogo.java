package br.com.creational.patterns.factorymethod.simples.controller;

import br.com.creational.patterns.factorymethod.model.MonstroModel;

public class MonstroFogo implements Monstro{
	
	private MonstroModel monstroModel;
	
	public MonstroModel geraMostro() {		
		monstroModel = new MonstroModel();
		
		monstroModel.setNome("Vulcano");
		monstroModel.setPoder("Fogo");
				
		return monstroModel;
	}

	public String mostraNome() {
		return monstroModel.getNome();
	}

}
