package ejer_14;
/*Como bien sabés, en matemática, no se puede dividir por 0 (cero). Vamos a
pedirle a un usuario que ingrese un número. Si el número es distinto de 0,
indicar que se puede realizar la división. Si no lo es, indicar que no se puede.
En este ejercicio, no se puede usar el operador “==”. */

import java.util.Scanner;

public class Ejer_14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.println("Ingrese un numero: ");
		num = entrada.nextInt();

		if (num != 0) {
			System.out.println("Se puede realizar la division");
		}

		else {
			System.out.println("No se puede realizar la division");
		}

	}
}
