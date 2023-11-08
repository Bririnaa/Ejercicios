package ejer_12;
/*Solicitá a un usuario que ingrese calificaciones del colegio. Indicarle que
ingrese calificaciones entre 1 y 10.
Si la persona ingresa un valor por fuera de este rango (1-10), se debe indicar
que ingresó un valor incorrecto.
Según la nota que se ingrese, deberá salir en pantalla un mensaje que indique
qué tipo de calificación es. Las calificaciones y su tipo son:
• 1 (incluido) a 3 (incluido): insuficiente.
• 3 a 6 (sin incluir ambos): no logrado.
• 6 (incluido) a 7 (incluido): suficiente.
• 8 a 9 (ambos incluidos): notable.
• 10: sobresaliente.*/

import java.util.Scanner;

public class Ejer_12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int calificacion;

		System.out.println("Ingrese su calificacion del 1-10: ");
		calificacion = entrada.nextInt();

		if (calificacion < 1 || calificacion > 10) {
			System.out.println("Ingreso un valor incorrecto");
		}

		else if (calificacion >= 1 && calificacion <= 3) {
			System.out.println("Insuficiente");
		}

		else if (calificacion > 3 && calificacion < 6) {
			System.out.println("No logrado");
		}

		else if (calificacion >= 6 && calificacion <= 7) {
			System.out.println("Suficiente");
		}

		else if (calificacion >= 8 && calificacion <= 9) {
			System.out.println("Notable");
		}

		else {
			System.out.println("Sobresaliente");
		}

	}
}
