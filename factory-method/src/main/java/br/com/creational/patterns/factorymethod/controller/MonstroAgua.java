package br.com.creational.patterns.factorymethod.controller;

import br.com.creational.patterns.factorymethod.interfaces.Monstro;
import br.com.creational.patterns.factorymethod.model.MonstroModel;

public class MonstroAgua implements Monstro{
	
	private MonstroModel monstroModel;
	
	public MonstroModel geraMostro() {
		monstroModel = new MonstroModel();
		
		monstroModel.setNome("Oceanico");
		monstroModel.setPoder("Água");
		
		return monstroModel;
	}

	public String geraAtaque() {
		return monstroModel.getPoder();
	}

}
