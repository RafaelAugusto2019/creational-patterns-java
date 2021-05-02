package br.com.creational.patterns.abstractfactory.controller.monstros;

import br.com.creational.patterns.abstractfactory.model.MonstroModel;

public class Vulcano implements Monstro{

	public MonstroModel nascerMonstro() {
		monstroModel.setNome("Vulcano");	
		return monstroModel;
	}

	public String monstrarNome() {
		return monstroModel.getNome();
	}
	
}
