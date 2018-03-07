package com.ssbaez.ejercicio437B;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int fac;
		double result = 1;
		
		System.out.println("Aplicacion que estima el valor de la constante matematica 'e'");
		System.out.print("que utiliza la siguiente formula: ");
		System.out.println("e = 1 + 1/1! + 1/2! + 1/3! + ...\n");
		System.out.println("Introduzca el numero de terminos a calcular");
		System.out.print("----> ");
		int n = input.nextInt();
		
		while(n != 0) {
			
			int i = 0;
			int j = 1;
			fac = n;
			
			while(i != n-1) {
				
				fac *= n - j;
				j++;
				i++;
				
			}
			
			result += (double) 1 / (double) fac;
			n--;
			
		}
		
		System.out.printf("El resultado es: %.9f",result);
	}

}
