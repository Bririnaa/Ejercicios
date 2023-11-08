package ejer_23;
/*Resolver ejercicio anterior pero ahora darle al usuario únicamente cinco
posibilidades, comenzando de 0. Si llega a la quinta posibilidad, indicar que
perdió. Resolver este ejercicio con flags (variables booleanas).*/

import java.util.Scanner;

public class Ejer_23 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int num, intentos = 0;
		boolean num2 = false;

		System.out.println("Ingrese un numero entre el 0 - 99: ");
		num = datos.nextInt();

		int numeroAleatorio = (int) (Math.random() * 99);

		while (num != numeroAleatorio && num2 == false) {
			intentos++;

			System.out.println("Incorrecto. Cantidad de intentos: " + intentos);

			System.out.println("Ingrese un numero entre 0 - 99: ");
			num = datos.nextInt();

			if (intentos == 5) {
				num2 = true;
			}
		}

		if (intentos == 5) {
			System.out.println("Perdiste. El numero correcto era: " + numeroAleatorio);
		}

	}
}
