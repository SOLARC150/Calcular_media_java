package br.com.carlos;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main (String [] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Qual a primeira nota ?");
		double num1 = scanner.nextDouble();
		
		System.out.println("Qual a segunda nota ?");
		double num2 = scanner.nextDouble();
		
		System.out.println("Qual a terceira nota ?");
		double num3 = scanner.nextDouble();
		
		System.out.println("Qual a quarta nota ?");
		double num4 = scanner.nextDouble();
		
		System.out.println("\n============================\n"
				+ "A média: "+calcularMedia(num1, num2, num3, num4)
				+ "\n============================\n");
		
		main(args);
		
	}
	
	public static double calcularMedia (double num1, double num2, double num3, double num4) {
		
		return (num1+num2+num3+num4)/4;
		
	}
	
}
