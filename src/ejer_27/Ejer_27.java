package ejer_27;
/*Resolver el mismo ejercicio del caso anterior, pero esta vez, utilizando
banderas (variables booleanas) dentro de la condición del while.*/

import java.util.Scanner;

public class Ejer_27 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int cont = 2006, intentos = 0;
		boolean cont2 = false;

		System.out.println("Ingrese la contraseña:");
		cont = datos.nextInt();

		while (cont != 2006 && cont2 == false) {
			intentos++;
			System.out.println("Contraseña incorrecta. Cantidad de intentos: " + intentos);

			System.out.println("Ingrese nuevamente la contraseña: ");
			cont = datos.nextInt();

			if (intentos == 3) {
				cont2 = true;
			}

		}

		if (cont == 2006) {
			System.out.println("Contraseña correcta");
		}

		if (intentos == 3) {
			System.out.println("El usuario esta bloqueado");

		}
	}

}
