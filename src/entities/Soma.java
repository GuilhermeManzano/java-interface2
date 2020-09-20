package entities;

import model.services.OperacaoMatematica;

public class Soma extends Numeros implements OperacaoMatematica {
	public Soma(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcula(int a, int b) {
		return a + b;
	}
}
