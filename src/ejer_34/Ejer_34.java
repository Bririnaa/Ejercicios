package ejer_34;
/*Pedir a un usuario los ingresos del último año, mes por mes (por ende, 12
meses), de su empresa de zapatillas. Si hay algún mes en el cual el ingreso
sea menor a $100000, indicar por pantalla que, por lo menos en un mes, hubo
un ingreso menor a $100000.*/

import java.util.Scanner;

public class Ejer_34 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ingresos;

		for (int mes = 1; mes <= 13; mes++) {

			System.out.println("Escriba los ingresos del mes: ");
			ingresos = entrada.nextInt();

			if (ingresos < 100000) {

				System.out.println("En el mes: " + mes + " hubo un ingreso menor a $100000");
			}

		}

	}
}
