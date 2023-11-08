package ejer_24;
/*Solicitar al usuario dos números. Luego, sumarlos y mostrar en pantalla la suma.
Indicarle al usuario que debe tocar el cero (0) para salir. Entonces, mientras 0 no
sea ingresado como número, el programa volverá a pedir dos números para
sumar, y mostrar esa suma en pantalla. Esto debe ocurrir al menos una vez.*/

import java.util.Scanner;

public class Ejer_24 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1, num2, num3, suma;

		System.out.println("Ingrese un primer numero: ");
		num1 = entrada.nextInt();

		System.out.println("Ingrese un segundo numero: ");
		num2 = entrada.nextInt();

		suma = num1 + num2;

		System.out.println("El resultado de la suma es: " + suma);

		System.out.println("Si quiere salir ingrese un 0: ");
		num3 = entrada.nextInt();

		while (num3 != 0) {
			System.out.println("Ingrese un primer numero: ");
			num1 = entrada.nextInt();

			System.out.println("Ingrese un segundo numero: ");
			num2 = entrada.nextInt();

			suma = num1 + num2;

			System.out.println("El resultado de la suma es: " + suma);

			System.out.println("Si quiere salir ingrese un 0: ");
			num3 = entrada.nextInt();
		}

	}
}
