package ejer_42;
/*El objetivo de este código, es armar un juego de adivinanza de un número.
Para ello:
• Creá un número aleatorio (random) entre 0 y 50. Si no te acordás como,
revisá la clase “math” en Java.
• Luego de crear el número aleatorio, pedile a una persona que ingrese
tres números.
• Si alguno de esos números coincide con el número aleatorio, indicale
que ganó. Si no, decile que perdió.*/

import java.util.Scanner;

public class Ejer_42 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] numero = new int[3];
		int numeroAleatorio = (int) (Math.random() * 50);

		for (int i = 0; i < 3; i++) {

			System.out.println("Ingrese el numero " + i + ": ");
			numero[i] = entrada.nextInt();
		}

		if (numero[0] == numeroAleatorio || numero[1] == numeroAleatorio || numero[2] == numeroAleatorio) {
			System.out.println("Ganaste");
		}

		else {
			System.out.println("Perdiste, el numero era: " + numeroAleatorio);
		}

	}
}
