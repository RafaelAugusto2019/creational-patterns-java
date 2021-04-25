package br.com.creational.patterns.abstractfactory.factory;

import br.com.creational.patterns.abstractfactory.controller.aeronaves.Aeronave;
import br.com.creational.patterns.abstractfactory.controller.aeronaves.JatoUltra;
import br.com.creational.patterns.abstractfactory.controller.monstros.Aquatico;
import br.com.creational.patterns.abstractfactory.controller.monstros.Monstro;

public class DificilPersonagemFactory implements PersonagemFactory{

	public Aeronave geraPersonagemAeronave() {
		return new JatoUltra();
	}

	public Monstro geraPersonagemMonstro() {
		return new Aquatico();
	}

}
