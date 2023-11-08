package ejer_58;
/*Se le solicita a un usuario que ingrese un número (puede ser entero o
flotante). Armar una función para el ingreso de ese número. Luego, armar
otra función que devuelva “true” si el número es positivo, o “false” si es
negativo. Mostrar en pantalla el resultado de la función.*/

import java.util.Scanner;

public class ejer_58 {
	static int n1;

	public static void num() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un numero entero: ");
		n1 = entrada.nextInt();

	}

	public static boolean positivo(int a) {
		boolean bandera = false;

		if (n1 > 0) {
			bandera = true;
		}

		return bandera;

	}

	public static void main(String[] args) {

		num();
		System.out.println("¿Es positivo? " + positivo(n1));

	}
}
