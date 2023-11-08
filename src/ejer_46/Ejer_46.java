package ejer_46;
/*Resolvé el ejercicio anterior, pero descartando ahora los números de socio
pares. Para ello, te sugiero que uses la palabra reservada “continue” en el “for”.*/

import java.util.Scanner;

public class Ejer_46 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] nombres = { "Enrique", "Liliana", "Lucas", " Juan", "Fiorella", "Ariel", "Daiana" };

		int[] socios = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };

		int busqueda;

		for (int j = 0; j < 7; j++) {

			System.out.println("\nPara encontrar a un individuo, ingrese numero de socio: ");
			busqueda = entrada.nextInt();

			for (int i = 0; i < 7; i++) {

				if (socios[i] % 2 == 0) {
					continue;
				}

				if (socios[i] == busqueda) {

					System.out.println("El socio " + socios[i] + " es: " + nombres[i]);
				}

			}
		}
	}
}
