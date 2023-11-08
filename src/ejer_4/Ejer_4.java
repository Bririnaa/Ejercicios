package ejer_4;

/*Codeá una calculadora de tiempo. La cosa es así: una persona debe ingresar
años, meses o semanas.
Según lo que se ingrese, se debe mostrar en pantalla el valor en días.*/
import java.util.Scanner;

public class Ejer_4 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		int dias, semana, mes, año;

		System.out.println("Ingrese la cantidad de años: ");
		año = entrada.nextInt();

		/*
		 * año = 365 dias; mes = 30 dias; semana = 7 dias;
		 */

		dias = año * 365;
		mes = año * 12;
		semana = año * 52;

		System.out.println("\nAños en dias: " + dias);
		System.out.println("\nMeses en dias: " + mes);
		System.out.println("\nSemanas en dias: " + semana);
	}
}