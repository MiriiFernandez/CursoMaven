package com.arquitecturajava.cursomaven.financiera;

import com.arquitecturajava.cursomaven.matematicas.Calculadora;

public class CalculadoraFinanciera {

	
	// dependo de la version 0.3 de la calculadora 
	// que aporte una nueva funcionalidad que a nosotros nos
	// ayuda y simplifica el codigo
	
	public static double sumarImportes(double ... importes) {
		
			return Calculadora.sumarValores(importes);
	}
	
	
}
