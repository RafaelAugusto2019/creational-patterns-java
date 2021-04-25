package br.com.creational.patterns.factorymethod;

import br.com.creational.patterns.factorymethod.controller.Monstro;
import br.com.creational.patterns.factorymethod.factory.MonstroAguaFactory;
import br.com.creational.patterns.factorymethod.factory.MonstroFogoFactory;

public class Main {

	public static void main(String[] args) {
		
		Monstro monstroAgua = new MonstroAguaFactory().geraMonstroFactory();
		monstroAgua.geraMostro();
		
		System.out.println(monstroAgua.geraAtaque());
		
		Monstro monstroFogo = new MonstroFogoFactory().geraMonstroFactory();
		monstroFogo.geraMostro();
		
		System.out.println(monstroFogo.geraAtaque());


	}

}
