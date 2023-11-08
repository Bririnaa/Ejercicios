package ejer_3;

import java.util.Scanner;

/*Generá un programa en el cual un usuario ingrese dos números flotantes. Luego,
se deben multiplicar, dividir, restar y sumar. Finalmente, hay que mostrar cada
resultado en pantalla.
Estos resultados, deben ser mostrados en pantalla, dejando una línea de espacio
entre ellos (un "renglón" entre datos).
Mostrar el resultado como float, y como int.*/
public class Ejer_3 {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		float num1, num2, suma, resta, multip, div, resto;

		System.out.println("\tOperaciones matematicas");

		System.out.println("\nEscriba el primer numero: ");
		num1 = entrada.nextFloat();

		System.out.println("\nEscriba el segundo numero: ");
		num2 = entrada.nextFloat();

		System.out.println("\tLos resultados, son: ");

		suma = num1 + num2;
		resta = num1 - num2;
		multip = num1 * num2;
		div = num1 / num2;
		resto = num1 % num2;

		System.out.println("\nResultado de la suma:" + suma);
		System.out.println("\nResultado de la resta:" + resta);
		System.out.println("\nResultado de la multiplicacion:" + multip);
		System.out.println("\nResultado de la division:" + div);
		System.out.println("\nEl resto de la division es: " + resto);
	}
}
