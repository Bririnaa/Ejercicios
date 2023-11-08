package ejer_13;
/*Pedile a una persona que ingrese caracteres minúsculos entre S, M y L. Estas
tres letras, se refieren a las medidas de remeras (small, médium y large).
NO RESOLVER POR SWITCH.
Si ingresó “S”, indicarle que quedan 5 remeras.
Si ingresó “M”, indicarle que quedan 2 remeras.
Si ingresó “L”, indicarle que no quedan remeras.*/

import java.util.Scanner;

public class Ejer_13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char talle;

		System.out.println("Ingrese su talle (s, m, l): ");
		talle = entrada.next().charAt(0);

		if (talle == 's') {
			System.out.println("Quedan 5 remeras");
		}

		else if (talle == 'm') {
			System.out.println("Quedan 2 remeras");
		}

		else {
			System.out.println("No quedan remeras");
		}

	}
}
