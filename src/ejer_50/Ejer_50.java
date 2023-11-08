package ejer_50;
/*Indicale a un grupo de persona que indique cuánto dinero desea apostar por un
producto determinado (no importa en este caso de qué producto se trata).
Luego, realizá lo siguiente:
• Determiná la apuesta máxima, y la apuesta mínima. Mostrar en pantalla
al terminar de ingresar las apuestas.
• Ordená numéricamente de manera ascendente las apuestas. Luego,
mostrá el array ordenado en pantalla (al salir del ‘for’).
• Cada vez que la apuesta sea menor a 500, descartar este valor.*/

import java.util.Scanner;

public class Ejer_50 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] apuesta = new int[5];
		int apuesta_max = 0, apuesta_min = 999999999;

		for (int i = 0; i < (apuesta.length); i++) {

			System.out.println("\nIngrese la cantidad de dinero a apostar: ");
			apuesta[i] = entrada.nextInt();

			if (apuesta[i] < 500) {

				System.out.println("Valor muy bajo.");
				i--;
				continue;
			}

			if (apuesta[i] > apuesta_max) {

				apuesta_max = apuesta[i];
			}

			if (apuesta[i] < apuesta_min) {

				apuesta_min = apuesta[i];
			}

		}

		// ordenamiento

		for (int b = 0; b < (apuesta.length); b++) {
			for (int m = 0; m < (apuesta.length - b - 1); m++) {

				if (apuesta[m] > apuesta[m + 1]) {
					int temporal = apuesta[m];

					apuesta[m] = apuesta[m + 1];

					apuesta[m + 1] = temporal;
				}

			}
		}

		System.out.println("\nLa apuesta maxima es: " + apuesta_max);
		System.out.println("\nLa apuesta minima es: " + apuesta_min);

		System.out.println("\nArreglo ordenado");
		for (int ordenado : apuesta) {
			System.out.println(ordenado + " ");
		}
	}
}
