package entities;

import model.services.OperacaoMatematica;

public class Divisao implements OperacaoMatematica {
	@Override
	public int calcula(int a, int b) {
		return a / b;
	}
}
