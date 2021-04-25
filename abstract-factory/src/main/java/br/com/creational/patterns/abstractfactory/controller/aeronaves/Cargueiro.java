package br.com.creational.patterns.abstractfactory.controller.aeronaves;

import br.com.creational.patterns.abstractfactory.model.AeronaveModel;

public class Cargueiro implements Aeronave{

	public AeronaveModel constroiAeronave() {
		aeronaveModel.setNome("Cargueiro");
		return aeronaveModel;
	}

	public String monstrarNome() {
		return aeronaveModel.getNome();
	}

}
