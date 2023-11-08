package ejer_65;
/*TRATAMIENTO DE EXCEPCIONES
Crea un programa que solicite al usuario su edad. Agrega un manejo de 
excepciones para garantizar que el usuario ingrese un valor numérico válido y 
que la edad sea un número positivo.
SUGERENCIA: usar excepciones ArithmeticException e 
InputMismatchException.*/

import java.util.InputMismatchException; // Para las excepciones
import java.util.Scanner;

public class Ejer_65 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int edad;

		try {
			System.out.println("Ingrese su edad: ");
			edad = entrada.nextInt();

			if (edad < 0) {
				throw new ArithmeticException();
			}

		}

		catch (ArithmeticException e) {
			System.out.println("Error. Número negativo.");
		} catch (InputMismatchException e) {
			System.out.println("Error. Cáracter ingresado no válido.");
		}
	}

}
