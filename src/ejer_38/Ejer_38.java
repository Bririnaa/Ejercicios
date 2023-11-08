package ejer_38;
/*Realizá de nuevo el ejercicio 35. Nah, chiste. Acá va la consigna en serio:
Se desea codear un programa que registre cada 2hs la cantidad máxima y
mínima de clientes de un local de ropa. El horario de trabajo es de 9hs a 19hs.*/

import java.util.Scanner;

public class Ejer_38 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float clientes, clientes_max = 0, clientes_min = 1000000;
		int hora, hora_max = 0, hora_min = 0;

		for (hora = 9; hora <= 19; hora += 2) {

			System.out.println("Ingrese la cantidad de clientes a las " + hora + "hs: ");
			clientes = entrada.nextFloat();

			if (clientes > clientes_max) {
				clientes_max = clientes;
				hora_max = hora;
			}

			if (clientes < clientes_min) {
				clientes_min = clientes;
				hora_min = hora;
			}
		}

		System.out.println("A las" + hora_max + "hs la cantidad de clientes fue de: " + clientes_max);
		System.out.println("A las" + hora_min + "hs la cantidad de clienes fue de: " + clientes_min);

	}
}
