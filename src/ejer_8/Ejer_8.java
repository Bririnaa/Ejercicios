package ejer_8;
/*Un usuario debe ingresar un número (con un dígito entero, y dos decimales,
ejemplo: 3,46).
Ese número, hay que elevarlo al cuadrado, pero solo se desea obtener su
resultado entero.
A este número, hay que sumarle un valor rándom entre 0 y 1 (usar Math.random).
Multiplicar este número por 7.
Finalmente, hallar la raíz cuadrada del número.
Mostrar el resultado en pantalla.*/

import java.util.Scanner;

public class Ejer_8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float num;
		float num2;

		System.out.println("Ingrese un numero con decimales: ");
		num = entrada.nextFloat();

		double base = num, exponente = 2;
		int potencia = (int) Math.pow(base, exponente);

		float numeroAleatorio = (float) Math.random();

		num2 = potencia + numeroAleatorio;

		num2 = num2 * 7;

		double raiz_cuadrada = Math.sqrt(num2);

		System.out.println("El resultado es: " + raiz_cuadrada);

	}
}
