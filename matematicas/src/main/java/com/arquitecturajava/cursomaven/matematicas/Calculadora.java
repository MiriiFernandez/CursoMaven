package com.arquitecturajava.cursomaven.matematicas;

public class Calculadora {

	public static double sumar(double a, double b) {

		return a + b;
	}

	// version 0.2 de la calculadora
	public static double restar(double a, double b) {

		return a - b;
	}
	
	// ya lo hiciste en la parte financiera
	public static double sumarValores(double ...valores) {
		
		double total = 0;
		for (double valor :valores) {
			
			total+=valor;
		}
		return total;
		
	}
	

}
