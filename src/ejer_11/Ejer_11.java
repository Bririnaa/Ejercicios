package ejer_11;
/*Según el número que ingrese un usuario, analizar si un número es positivo,
negativo o cero. Mostrar en pantalla el resultado de este análisis: “El número es
positivo/negativo/cero”.*/

import java.util.Scanner;

public class Ejer_11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float num;

		System.out.println("Ingrese un numero: ");
		num = entrada.nextFloat();

		if (num > 0) {
			System.out.println("El numero es positivo");
		}

		else if (num == 0) {
			System.out.println("El numero es 0");
		}

		else {
			System.out.println("El numero es negativo");
		}

	}
}
