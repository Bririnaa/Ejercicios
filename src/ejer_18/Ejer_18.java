package ejer_18;
/*SENTENCIA CONDICIONAL: SWITCH.
Resolvé el desafío número 13, pero con la sentencia Switch.*/

import java.util.Scanner;

public class Ejer_18 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		char talle;

		System.out.println("Ingrese su talle (s, m, l): ");
		talle = datos.next().charAt(0);

		switch (talle) {

		case 's':
			System.out.println("Quedan 5 remeras");
			break;

		case 'm':
			System.out.println("Quedan 2 remeras");
			break;

		case 'l':
			System.out.println("No quedan remeras");
			break;

		default:
			System.out.println("No tenemos remeras de esa talla");

		}
	}
}
