package ejer_19;
/*Te contrató Cloty porque no se acuerda en su máquina de café cuál es cada
uno (o sea, cada café) según su número. Yo lo se, y te lo voy a decir:
• 1 es café cortado,
• 2 es café Latte,
• 3 es café solo,
• 4 es café lágrima.
• La opción 5, es para salir del programa.
Ayudala a reprogramarlo, y dale el programita. Copate, no seas antifiesta.
¿Qué hay que lograr? Que cada número muestre en pantalla el tipo de café al
que corresponde.*/

import java.util.Scanner;

public class Ejer_19 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int cafe;

		System.out.println("Ingrese la opcion (1-5): ");
		cafe = datos.nextInt();

		switch (cafe) {

		case 1:
			System.out.println("Es Cafe Cortado");
			break;

		case 2:
			System.out.println("Es Cafe Latte");
			break;

		case 3:
			System.out.println("Es Cafe Solo");
			break;

		case 4:
			System.out.println("Es Cafe Lagrima");
			break;

		case 5:
			System.out.println("Saliste del programa");
			break;

		default:
			System.out.println("No hay");
		}
	}
}
