package br.com.creational.patterns.factorymethod.simples.factory;

import br.com.creational.patterns.factorymethod.simples.controller.Monstro;
import br.com.creational.patterns.factorymethod.simples.controller.MonstroAgua;
import br.com.creational.patterns.factorymethod.simples.controller.MonstroFogo;

public class Monstrofactory {
	
	public static Monstro geraMostro(String nome) {
		
		switch(nome) {
		case "Oceanico":			
			return new MonstroAgua();
		case "Vulcano":			
			return new MonstroFogo();
		default:
			return null;						
		}
		
	}

}
