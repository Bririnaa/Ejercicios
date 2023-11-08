package ejer_44;
/*Hay que armar un programa que guarde cuatro números DNI. Luego de
guardar esos DNI, hay que mostrar en pantalla únicamente los números pares.
Para encontrar números pares: variable_numerica%2=0 (¿la variable_numerica
al dividirse por 2 me da como resto 0?) . Esto nos permite buscar el “resto” de
una división. Cualquier número par dividido por 2, me dará como resto 0.
Cualquier número impar, da como resto 1.
En conclusión: “sí un número es par -> mostrarse en pantalla”.*/

import java.util.Scanner;

public class Ejer_44 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] dni = new int[4];

		for (int i = 0; i <= 4; i++) {

			System.out.println("Ingrese el dni " + (i + 1) + ": ");
			dni[i] = entrada.nextInt();

			if (dni[i] % 2 == 0) {

				System.out.println("El dni " + dni[i] + " es un numero par");

			}

			else {
				continue;
			}

		}

	}
}
