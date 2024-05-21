package tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class t2a1alumnos {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int cantidadAlumnos;
	
		BufferedReader aux=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese la cantidad de alumnos");		
		cantidadAlumnos=Integer.valueOf(aux.readLine());
		
		String [] alumnos = new String [cantidadAlumnos];
		int [] notas = new int [cantidadAlumnos];
		String [] condicion = new String [cantidadAlumnos];
		
		for (int i = 0 ; i< cantidadAlumnos ; i++) {
			BufferedReader aux2=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el APELLIDO y Nombre del alumno");
			alumnos[i]=String.valueOf(aux2.readLine());
			
			BufferedReader aux3=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese la nota de: " + alumnos[i]);		
			notas[i]=Integer.valueOf(aux3.readLine());
			
			if (notas[i]>3) {
				condicion[i] = "Aprobado";
			}
			else {
				condicion[i] = "Desaprobado";
			}
		}
		for (int i = 0 ; i< cantidadAlumnos ; i++) {
			System.out.println(alumnos[i] + " | Nota: " + notas[i] + " | " + condicion[i]);
		}
	}
}
