package application;

import java.util.Scanner;

import entities.Soma;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		int a = sc.nextInt();
		System.out.print("Digite o número B: ");
		int b = sc.nextInt();
		
		Soma n1 = new Soma(a, b);
		
		System.out.println("Soma: " + n1.calcula(a, b));
		
		sc.close();
	}
}
