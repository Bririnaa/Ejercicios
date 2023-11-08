package ejer_22;
/*Tomá el ejercicio 10 (el del bingo). Ahora, hacé que mientras el número no sea
igual a aleatorio, el jugador pueda seguir ingresando números, hasta que acierte.
Contar en el proceso cuántos intentos se realizaron. Al acertar, mostrar en
pantalla “GANASTE!”.*/

import java.util.Scanner;

public class Ejer_22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, intentos = 0;

		System.out.println("Ingrese un numero entre 0 - 99: ");
		num = entrada.nextInt();

		double numeroAleatorio = (Math.random() * 99);

		while (num != numeroAleatorio) {

			intentos++;

			System.out.println("Cant. de intentos: " + intentos);

			System.out.println("Ingrese un numero entre 0 - 99: ");
			num = entrada.nextInt();

		}

		System.out.println("GANASTE!");
	}

}
