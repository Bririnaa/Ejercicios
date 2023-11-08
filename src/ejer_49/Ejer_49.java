package ejer_49;
/*• Solicita al usuario que ingrese una lista de números de DNI.
• Utiliza el algoritmo de ordenamiento burbuja para ordenar la lista en
orden ascendente.
• Mostrá la lista ordenada en la consola.
• Ahora, utiliza el algoritmo de ordenamiento burbuja para ordenar la lista
en orden descendente.
• Mostrá la nueva lista ordenada en la consola.*/

import java.util.Scanner;

public class Ejer_49 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] dni = new int[4];

		for (int i = 0; i < dni.length; i++) {

			System.out.println("Ingrese el dni " + (i + 1) + ": ");
			dni[i] = entrada.nextInt();

			System.out.println("");
		}

		// Ordenar de forma ascendente

		for (int j = 0; j < (dni.length - 1); j++) {

			for (int m = 0; m < (dni.length - j - 1); m++) {

				if (dni[m] > dni[m + 1]) {
					int num = dni[m];
					dni[m] = dni[m + 1];
					dni[m + 1] = num;
				}

			}
		}

		System.out.println("Dni de forma ascendente: ");
		for (int num2 : dni) {
			System.out.println(num2 + "");
		}

// Ordenar de forma descendente

		for (int p = 0; p < (dni.length - 1); p++) {

			for (int e = 0; e < (dni.length - p - 1); e++) {

				if (dni[e] < dni[e + 1]) {
					int num = dni[e];
					dni[e] = dni[e + 1];
					dni[e + 1] = num;
				}
			}
		}

		System.out.println("Dni de forma descendente: ");
		for (int num2 : dni) {
			System.out.println(num2 + "");
		}

	}
}
