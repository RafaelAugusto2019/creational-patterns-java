package br.com.creational.patterns.abstractfactory.factory;

import br.com.creational.patterns.abstractfactory.controller.aeronaves.Aeronave;
import br.com.creational.patterns.abstractfactory.controller.monstros.Monstro;

public interface PersonagemFactory {

	Aeronave geraPersonagemAeronave();
	Monstro geraPersonagemMonstro();
	
}
