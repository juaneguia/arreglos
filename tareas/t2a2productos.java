package tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t2a2productos {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int cantidadProductos;
		
		BufferedReader aux=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese la cantidad de productos");		
		cantidadProductos=Integer.valueOf(aux.readLine());
		
		String [] productos = new String [cantidadProductos];
		double [] precios = new double [cantidadProductos];
		double total=0;
		
		for (int i = 0 ; i< cantidadProductos ; i++) {
			BufferedReader aux2=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el producto");
			productos[i]=String.valueOf(aux2.readLine());
			
			BufferedReader aux3=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el precio de: " + productos[i]);		
			precios[i]=Double.valueOf(aux3.readLine());
			
			total=total+precios[i];
		}
		for (int i = 0 ; i< cantidadProductos ; i++) {
			System.out.println(productos[i] + " | Precio: $" + precios[i]);
		}
		System.out.println("TOTAL = " + total);
		
	}

}
