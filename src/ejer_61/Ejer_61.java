package ejer_61;

import java.util.Scanner;

/*MÉTODOS DE STRINGS
Armar un programa que solicite a un usuario su nombre y apellido. Luego, en
pantalla debe verse el nombre en minúsculas, el apellido en mayúsculas, y la
longitud de cada uno.*/

public class Ejer_61 {
	
	static String Nombre, Apellido, nombre_min, apellido_max;
	
	public static void ingreso_datos() {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese el nombre: ");
		Nombre = entrada.next();
		
		System.out.println("Ingrese el apellido: ");
		Apellido = entrada.next();
		
	}
	
	public static void max_min() {
		
		System.out.println("");
		String nombre_min = Nombre.toLowerCase(); // pasa las letras a minuscula

		String apellido_max = Apellido.toUpperCase(); // pasa las letras a mayuscula

		System.out.println(nombre_min + "\n" + apellido_max);
	}
		
	public static void longitud() {
		System.out.println("\nEl nombre " +Nombre+ " tiene: " + Nombre.length() + " caracteres");
		// Longitud de una cadena
		System.out.println("El apellido " +Apellido+ " tiene: " + Apellido.length() + " caracteres");
	}
		
	
	
public static void main(String[] args) {
	ingreso_datos();
	max_min();
	longitud();
	
	
	

	
}
	
	
	
}
