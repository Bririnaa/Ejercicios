package ejer_39;
/*ARREGLOS/ARRAYS:
Ahora sí vas a poder completar el ejercicio 33 (el de los jugadores de fútbol).
Para eso, arma un array del 1 al 11 para que almacene los nombres de los
jugadores, y otro array del 1 al 11 para almacenar la edad de cada uno.
//Finalmente, hay que mostrar en pantalla los datos de cada jugador.*/

import java.util.Scanner;

public class Ejer_39 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] nombre = new String[11];

		int[] edad = new int[11];

		for (int i = 0; i < 11; i++) {

			System.out.println("\nIngrese el nombre del jugador " + (i + 1) + ": ");
			nombre[i] = entrada.next();

			System.out.println("\nIngrese la edad del jugador " + (i + 1) + ": ");
			edad[i] = entrada.nextInt();

		}

		System.out.println("\n");

		for (int i = 0; i < 11; i++) {

			System.out.println("\nEl nombre del jugador " + (i + 1) + " es: ");
			System.out.println(nombre[i]);

			System.out.println("\nLa edad del jugador " + (i + 1) + " es: ");
			System.out.println(edad[i]);

		}

	}
}