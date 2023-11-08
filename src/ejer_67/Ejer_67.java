package ejer_67;
/*Solicitar a un usuario que ingrese un número, del tipo que quieras, para 
calcular su raíz cuadrada. Si el número es negativo, capturar este error, e 
informar por pantalla que no se puede calcular la raíz cuadrada de un número 
negativo.
Además, capturar otro error si ingresó un tipo de dato que no es un número.
Informar por pantalla cuál es el error cometido.
SUGERENCIA: usar excepciones ArithmeticException e 
InputMismatchException.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer_67 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero;

		try {
			System.out.println("Ingrese un número: ");
			numero = entrada.nextInt();

			if (numero < 0) {
				throw new ArithmeticException();
			}
		} catch (ArithmeticException e) {
			System.out.println("Error. No se puede hacer raíz de un numero negativo.");
		} catch (InputMismatchException e) {
			System.out.println("Error. No inserto un numero");
		}
	}
}
