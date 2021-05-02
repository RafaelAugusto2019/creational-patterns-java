package br.com.creational.patterns.abstractfactory.controller.aeronaves;

import br.com.creational.patterns.abstractfactory.model.AeronaveModel;

public class JatoUltra implements Aeronave{

	public AeronaveModel constroiAeronave() {
		aeronaveModel.setNome("Jato");
		return aeronaveModel;
	}

	public String monstrarNome() {
		return aeronaveModel.getNome();
	}

}
