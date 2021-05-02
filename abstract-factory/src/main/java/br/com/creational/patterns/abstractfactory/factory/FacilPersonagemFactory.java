package br.com.creational.patterns.abstractfactory.factory;

import br.com.creational.patterns.abstractfactory.controller.aeronaves.Aeronave;
import br.com.creational.patterns.abstractfactory.controller.aeronaves.Cargueiro;
import br.com.creational.patterns.abstractfactory.controller.monstros.Monstro;
import br.com.creational.patterns.abstractfactory.controller.monstros.Vulcano;

public class FacilPersonagemFactory implements PersonagemFactory{

	public Aeronave geraPersonagemAeronave() {
		return new Cargueiro();
	}

	public Monstro geraPersonagemMonstro() {
		return new Vulcano();
	}

}
