package ejer_36;

import java.util.Scanner;

/*Nuevamente, Cloty te pide ayuda. Ella quiere analizar en su horario de trabajo
(de 8hs a 17hs) cuánto le ingresa en total por cada hora, y finalmente, quiere
saber en qué hora obtuvo mas ingresos, y en qué hora obtuvo menos ingresos.
Mostrale en pantalla entonces a qué hora tuvo la ganancia máxima, y a qué
hora obtuvo la ganancia mínima.
Por último, mostrale en pantalla el ingreso total.*/
public class Ejer_36 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float ingresos, ingreso_total = 0, ingreso_max = 0, ingreso_min = 1000001;
		int hora, hora_max = 0, hora_min = 0;

		for (hora = 8; hora <= 17; hora++) {

			System.out.println("Escriba sus ingresos a las " + hora + "hs: ");
			ingresos = entrada.nextFloat();

			if (ingresos > ingreso_max) {
				ingreso_max = ingresos;
				hora_max = hora;
			}

			if (ingresos < ingreso_min) {
				ingreso_min = ingresos;
				hora_min = hora;
			}

			ingreso_total += ingresos;

		}

		System.out.println("A las " + hora_max + "hs obtuvo el mayor ingreso, que es: " + ingreso_min);

		System.out.println("A las " + hora_min + "hs obtuvo el meyor ingreso, que es: " + ingreso_max);

		System.out.println("El ingreso total es: " + ingreso_total);

	}
}
