package ejer_62;
/*Ingresar por usuario cinco apellidos. Indicar por pantalla cuál es el mayor
alfabéticamente (mas cercano a la Z), y el menor (mas cercano a la A).*/

import java.util.Scanner;

public class Ejer_62 {

	static String[] Apellidos = new String[5];
	static String max = "@";
	static String min = "{";

	public static void ingreso() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Ingrese el apellido " + i + ": ");
			Apellidos[i] = entrada.next();
		}
	}

	public static void comparacion() {
		

		for (int i = 0; i < 5; i++) {

			if (Apellidos[i].compareTo(Apellidos[i + 1]) > 0) {
				max = Apellidos[i];
			}

			if (Apellidos[i].compareTo(Apellidos[i + 1]) < 0) {
				min = Apellidos[i];
			}
		}
	}

	public static void main(String[] args) {
		ingreso();
		comparacion();

		System.out.println("El apellido max es: " + max);
		System.out.println("El apellido min es: " + min);
	}
}
