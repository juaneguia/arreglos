package tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t2a3monedas {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Desafío: Desarrolla un programa que convierta una
//cantidad de una moneda a otra, por ejemplo, de dólares a euros o 
		//viceversa (al menos 3 tipos de monedas de cambio).
		
		double pesoadolar, pesoaeuro, dolarapeso, dolaraeuro, euroapeso, euroadolar;
		
		int cantidad;
		BufferedReader aux=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese la cantidad de dinero que tiene");
		cantidad=Integer.valueOf(aux.readLine());
		
		int moneda;
		BufferedReader aux1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese en que moneda tiene su dinero: 1 Peso, 2 dolar 3 euro");
		moneda=Integer.valueOf(aux1.readLine());
		
		switch (moneda) {
		case 1: 
			pesoadolar = cantidad*0.001;
			pesoaeuro = cantidad*0.0011;
			System.out.println("Sus " + cantidad + " pesos a dolares seria: " + pesoadolar + " y a euros seria " + pesoaeuro);
			break;
		case 2: 
			dolarapeso = cantidad*1000;
			dolaraeuro = cantidad*0.9;
			System.out.println("Sus " + cantidad + " dolares a pesos seria: " + dolarapeso + " y a euros seria " + dolaraeuro);
			
			break;
		case 3: 
			euroapeso = cantidad*1100;
			euroadolar = cantidad*1.1;
			System.out.println("Sus " + cantidad + " euros a pesos seria: " + euroapeso + " y a dolares seria " + euroadolar);
			break;
			
			
		}

	}

}
