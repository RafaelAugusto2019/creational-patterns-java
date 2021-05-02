package br.com.creational.patterns.factorymethod.simples;

import br.com.creational.patterns.factorymethod.simples.controller.Monstro;
import br.com.creational.patterns.factorymethod.simples.factory.Monstrofactory;

public class Main {

	public static void main(String[] args) {
		Monstro monstroAgua = Monstrofactory.geraMostro("Oceanico");
		monstroAgua.geraMostro();
		System.out.println(monstroAgua.mostraNome());
		
		Monstro monstroFogo = Monstrofactory.geraMostro("Vulcano");
		monstroFogo.geraMostro();
		System.out.println(monstroFogo.mostraNome());
	}

}
