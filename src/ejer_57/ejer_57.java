package ejer_57;
/*Escriba un programa en Java que devuelva la parte fraccionaria
de cualquier número introducido por el usuario. Por ejemplo, si se
introduce el número 256.879, debería desplegarse el número 0.879. Para
ello, pensá en lo siguiente: almacená un valor en una variable flotante.
Ahora, ese mismo valor, guardalo en otra variable entera. Finalmente, a
la variable flotante quitale el valor entero.*/

import java.util.Scanner;

public class ejer_57 {
	static float n1;
	static int n2;

	public static void num_flotante() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un numero flotante: ");
		n1 = entrada.nextFloat();

	}

	public static void num_entero() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese la parte entera del numero: ");
		n2 = entrada.nextInt();
	}

	public static float parte_fracc(float a, int b) {

		float fracc = a - b;

		return fracc;
	}

	public static void main(String[] args) {

		num_flotante();
		num_entero();
		parte_fracc(n1, n2);

		System.out.println("La parte fraccionaria es: " + parte_fracc(n1, n2));

	}

}
