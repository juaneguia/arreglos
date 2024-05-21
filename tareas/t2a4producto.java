package tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t2a4producto {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Desafío: Escribe un programa que gestione 
		 * el inventario de una tienda permitiendo 
		 * agregar, modificar y mostrar productos.
		 */

		final int MAX = 3;
		String [] nombres = {" ", " ", " "};
		int opcion = 0;
		String producto = " ";
		int pos = 0;
		int productoAModificar = 0;
		
		BufferedReader aux=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Para agregar ingrese 1");	
		System.out.println("Para mostrar ingrese 2");
		System.out.println("Para modificar ingrese 3");
		System.out.println("Para salir ingrese 4");
		opcion=Integer.valueOf(aux.readLine());

		while(opcion != 4) {
			switch (opcion) {
			case 1: 
				System.out.println("Agregue producto");
				producto=String.valueOf(aux.readLine());
				if(pos < MAX && nombres[pos] == " ") {
					nombres[pos] = producto;
					pos++;
				}
				else {
					pos++;
				}
				System.out.println("Para agregar ingrese 1");	
				System.out.println("Para mostrar ingrese 2");
				System.out.println("Para modificar ingrese 3");
				System.out.println("Para salir ingrese 4");
				opcion = Integer.valueOf(aux.readLine());
			break;
			case 2:
				for(int i = 0; i<MAX; i++) {
					System.out.print("| " + nombres[i]);
				}
				System.out.println("Para agregar ingrese 1");	
				System.out.println("Para mostrar ingrese 2");
				System.out.println("Para modificar ingrese 3");
				System.out.println("Para salir ingrese 4");
				opcion = Integer.valueOf(aux.readLine());
			break;
			case 3:
				System.out.println("¿Que producto desea modificar?");
				for(int i = 0; i<MAX; i++) {
					System.out.println("Posición " + i + " producto: " + nombres[i]);
				}
				productoAModificar = Integer.valueOf(aux.readLine());
				System.out.println("Agregue producto modificado");
				producto=String.valueOf(aux.readLine());
				nombres[productoAModificar] = producto;
				System.out.println("Para agregar ingrese 1");	
				System.out.println("Para mostrar ingrese 2");
				System.out.println("Para modificar ingrese 3");
				System.out.println("Para salir ingrese 4");
				opcion = Integer.valueOf(aux.readLine());
			break;
			default:
				System.out.println("Numero inválido");
				System.out.println("Para agregar ingrese 1");	
				System.out.println("Para mostrar ingrese 2");
				System.out.println("Para modificar ingrese 3");
				System.out.println("Para salir ingrese 4");
				opcion = Integer.valueOf(aux.readLine());
			break;
			}
			
		}
		

		System.out.println("Fin del programa");
		
	}


}
