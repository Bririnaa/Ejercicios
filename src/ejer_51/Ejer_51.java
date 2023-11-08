package ejer_51;
/*Armá un programa en el que, por programa, se defina una matriz de flotantes.
Rellenala, y mostrá en pantalla cada valor.
RECORDAR: cuando coloques el número flotante, acordate de ponerle una “f”
al final del número. Ejemplo: 3.456f (esto sirve para diferenciarlo de “double”).*/

import java.util.Scanner;

public class Ejer_51 {
	public class Ejercicio_51 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);

			float[][] numflotantes = new float[2][3];

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 3; j++) {

					System.out.println("\nIngrese el valor en la posicion: " + i + " " + j + " ");
					numflotantes[i][j] = entrada.nextFloat();
				}
			}
			System.out.println("");

			for (int m = 0; m < 2; m++) {
				for (int b = 0; b < 3; b++) {

					System.out.print(numflotantes[m][b] + " ");

				}
			}
		}
	}
}
