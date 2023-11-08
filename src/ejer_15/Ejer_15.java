package ejer_15;
/*Hay que configurar un sistema de cajeros de un supermercado, que, si se
superan los $15000 de compra, se aplica un 10% de descuento al total de la
compra. Para realizarlo:
• Ingresar el costo total.
• Si el costo total supera los $15000, aplicar el descuento del 10%, y
mostrar en pantalla el costo total.
• Si no se superan los $15000, simplemente mostrar el costo total que se
ingresó al principio.*/

import java.util.Scanner;

public class Ejer_15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float costo_inicial, descuento, descuento2 = 0.10f, costo_final;

		System.out.println("Ingrese el costo inicial: ");
		costo_inicial = entrada.nextFloat();

		if (costo_inicial > 15000) {
			descuento = costo_inicial * descuento2;

			costo_final = costo_inicial - descuento;

			System.out.println("El costo total es: " + costo_final);
		}

		else {
			System.out.println("EL costo toal es: " + costo_inicial);
		}

	}
}
