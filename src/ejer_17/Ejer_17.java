package ejer_17;
/*Se ingresarán tres números (enteros o flotantes, lo que quieras), y hay que
mostrar en pantalla cuál es el mayor, el segundo mayor, y el de menor valor.
Sugerencia: anótate en un papel, o en un bloc de notas, cuáles son las
posibilidades para analizar. Luego de esto, ponete a programar.*/

import java.util.Scanner;

public class Ejer_17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float num1, num2, num3;

		System.out.println("\nIngrese un primer numero: ");
		num1 = entrada.nextFloat();

		System.out.println("\nIngrese un segundo numero: ");
		num2 = entrada.nextFloat();

		System.out.println("\nIngrese un tercer numero: ");
		num3 = entrada.nextFloat();

		if (num1 > num2 && num2 > num3) {
			System.out.println("\nEl 1er numero (" + num1 + ") es mayor, el 2do (" + num2
					+ ") es el segundo mayor y el 3ro (" + num3 + ") es el menor");
		}

		if (num1 > num2 && num2 < num3 && num1 > num3) {
			System.out.println("\nEl 1er numero (" + num1 + ")es mayor, el 3ro (" + num3
					+ ") es el segundo mayor y el 2do (" + num2 + ") es el menor");
		}

		if (num2 > num1 && num1 > num3 && num2 > num3) {
			System.out.println("\nEl 2do numero (" + num2 + ") es mayor, el 1ro (" + num1
					+ ") es el segundo mayor y el 3ro (" + num3 + ") es menor");
		}

		if (num2 > num1 && num1 < num3 && num2 > num3) {
			System.out.println("\nEl 2do numero (" + num2 + ") es mayor, el 3ro (" + num3
					+ ") es el segundo mayor y el 1ro (" + num1 + ") es menor");
		}

		if (num3 > num1 && num1 > num2 && num3 > num2) {
			System.out.println("\nEl 3er numero (" + num3 + ") es mayor, el 1ro (" + num1
					+ ") es el segundo mayor y el 2do (" + num2 + ") es menor");
		}

		if (num3 > num1 && num1 < num2 && num3 > num2) {
			System.out.println("\nEl 3er numero (" + num3 + ") es mayor, el 2do (" + num2
					+ ") es el segundo mayor y el 1ro (" + num1 + ") es menor");
		}

	}
}
