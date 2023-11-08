package ejer_59;
/*Armar una función que, por usuario o por programa, determine el máximo
y mínimo de tres números ingresados.
Se debe mostrar por pantalla el valor máximo, y el valor mínimo de estos
tres valores.*/

import java.util.Scanner;

public class ejer_59 {
	static int n1;
	static int num_max = 0, num_min = 999999999;

	public static void ingresar_num() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese un numero: ");
			n1 = entrada.nextInt();

			if (n1 < num_min) {

				num_min = n1;
			}

			if (n1 > num_max) {

				num_max = n1;
			}

		}
	}

	public static void main(String[] args) {

		ingresar_num();

		System.out.println("El numero maximo es: " + num_max);
		System.out.println("El numero minimo es: " + num_min);

	}
}
