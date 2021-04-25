package br.com.creational.patterns.abstractfactory.controller.monstros;

import br.com.creational.patterns.abstractfactory.model.MonstroModel;

public class Aquatico implements Monstro{

	public MonstroModel nascerMonstro() {
		monstroModel.setNome("Aquatico");	
		return monstroModel;
	}

	public String monstrarNome() {
		return monstroModel.getNome();
	}

}
