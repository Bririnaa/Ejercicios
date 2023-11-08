package ejer_40;
/*En este desafío, se propone que se ingresen cinco temperaturas. Cada una,
debe ser almacenada. La idea es mostrar en pantalla el promedio de estas
cinco temperaturas.*/

import java.util.Scanner;

public class Ejer_40 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float[] temp = new float[5];
		float prom = 0, promedio_total;

		for (int i = 0; i < 5; i++) {

			System.out.println("Ingrese la temperatura " + (i + 1) + ": ");
			temp[i] = entrada.nextFloat();

			prom += temp[i];

		}

		promedio_total = prom / 5;

		System.out.println("El promedio de las temperaturas es: " + promedio_total);

	}
}
