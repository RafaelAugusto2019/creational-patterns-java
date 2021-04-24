package br.com.creational.patterns.factorymethod;

import br.com.creational.patterns.factorymethod.factory.MonstroAguaFactory;
import br.com.creational.patterns.factorymethod.factory.MonstroFogoFactory;
import br.com.creational.patterns.factorymethod.interfaces.Monstro;

public class Main {

	public static void main(String[] args) {
		
		Monstro monstroAgua = new MonstroAguaFactory().geraMonstro();		
		System.out.println(monstroAgua);
		
		Monstro monstroFogo = new MonstroFogoFactory().geraMonstro();
		System.out.println(monstroFogo);


	}

}
