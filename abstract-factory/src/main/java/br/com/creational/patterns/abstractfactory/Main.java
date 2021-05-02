package br.com.creational.patterns.abstractfactory;

import br.com.creational.patterns.abstractfactory.controller.aeronaves.Aeronave;
import br.com.creational.patterns.abstractfactory.controller.monstros.Monstro;
import br.com.creational.patterns.abstractfactory.factory.DificilPersonagemFactory;

public class Main {

	public static void main(String[] args) {
		
//		Aeronave aeronave = new FacilPersonagemFactory().geraPersonagemAeronave();
		Aeronave aeronave = new DificilPersonagemFactory().geraPersonagemAeronave();
		aeronave.constroiAeronave();
		System.out.println(aeronave.monstrarNome());
		
//		Monstro monstro = new FacilPersonagemFactory().geraPersonagemMonstro();
		Monstro monstro = new DificilPersonagemFactory().geraPersonagemMonstro();
		monstro.nascerMonstro();
		System.out.println(monstro.monstrarNome());
		
	}

}
