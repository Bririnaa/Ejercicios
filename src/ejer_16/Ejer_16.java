package ejer_16;
/*Se debe debe generar un programa que nos indique si un horario ingresado por
un usuario es incorrecto. Para ello:
• La hora no debe superar el valor 24 (ya que después de 24hs, se
alcanza el día).
• El minuto no debe superar el valor 60 (ya que después de 60min, se
alcanza la hora).
• El segundo no debe superar el valor 60 (ya que después de 60seg, se
alcanza el minuto).
Si el valor ingresado es correcto, mostrar en pantalla que es un valor válido. Si
no lo es, mostrar en pantalla que es un valor incorrecto.*/

import java.util.Scanner;

public class Ejer_16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int horas, minutos, segundos;

		System.out.println("Ingrese la cantidad de horas: ");
		horas = entrada.nextInt();

		System.out.println("Ingrese la cantidad de minutos: ");
		minutos = entrada.nextInt();

		System.out.println("Ingrese la cantidad de segundos: ");
		segundos = entrada.nextInt();

		if (horas > 24) {
			System.out.println("Ingreso un valor incorrecto");
		}

		else if (minutos > 60) {
			System.out.println("Ingreso un valor incorrecto");
		}

		else if (segundos > 60) {
			System.out.println("Ingreso un valor incorrecto");
		}

		else {
			System.out.println("El valor que ingreso es correcto");
		}

	}
}
