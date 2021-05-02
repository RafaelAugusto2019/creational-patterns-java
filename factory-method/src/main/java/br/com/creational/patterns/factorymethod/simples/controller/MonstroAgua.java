package br.com.creational.patterns.factorymethod.simples.controller;

import br.com.creational.patterns.factorymethod.model.MonstroModel;

public class MonstroAgua implements Monstro{
	
	private MonstroModel monstroModel;
	
	public MonstroModel geraMostro() {
		monstroModel = new MonstroModel();
		
		monstroModel.setNome("Oceanico");
		monstroModel.setPoder("Água");
		
		return monstroModel;
	}

	public String mostraNome() {
		return monstroModel.getNome();
	}

}
