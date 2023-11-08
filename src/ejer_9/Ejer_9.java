package ejer_9;
/*Una persona desea jugar al bingo.
Al querer jugar, un programa le solicita su nombre, y su apellido.
Luego, el programa le mostrará en pantalla el nombre y apellido de la persona,
y el número del bingo entre 0 y 99 (le va a indicar qué número le tocó al azar).*/

import java.util.Scanner;

public class Ejer_9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nombre, apellido;

		System.out.println("Ingrese su Nombre: ");
		nombre = entrada.next();

		System.out.println("Ingrese su Apellido: ");
		apellido = entrada.next();

		double num = (Math.random() * 99);

		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu apellido es: " + apellido);
		System.out.println("Tu numero es: " + num);

	}
}
