package ejer_48;
/*Pedile a un usuario que ingrese cuatro apellidos. Por pantalla, mostrá cuál es el
primer apellido alfabéticamente.
Te doy un tip: la idea es parecida a encontrar máximos y mínimos (como en el
ejercicio 35)*/

import java.util.Scanner;

public class Ejer_48 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] apellidos = new String[4];
		String apellidos_Max = "";
		String apellidos_Min = "{";

		// Ingreso de apellidos
		for (int i = 0; i < apellidos.length; i++) {

			System.out.println("Ingrese el apellido " + (i + 1) + ": ");
			apellidos[i] = entrada.next();

			System.out.println("");

		}

		// Ordenar apellidos
		for (int j = 0; j < apellidos.length; j++) {

			if (apellidos[j].compareTo(apellidos_Max) > 0) {
				apellidos_Max = apellidos[j];

			}

			if (apellidos[j].compareTo(apellidos_Min) < 0) {
				apellidos_Min = apellidos[j];
			}

		}

		// Mostrar la lista ordenada
		System.out.println("\nLA lista ordenada:");
		System.out.println("Ultimo apellido: " + apellidos_Max);
		System.out.println("Primer apellido: " + apellidos_Min);

	}

}
