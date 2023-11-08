package ejer_33;
/*Vamos a armar un equipo de once jugadores de fútbol.
Para eso, vamos a armar repetitivamente un programa que nos índice “¿Cuál
es el nombre del jugador?” Se ingresa el nombre. Luego, solicitar su edad, e
ingresarla.
Cada vez que aumente en 1 la cantidad de jugadores, hay que volver a pedir el
ingreso de los datos anteriores (nombre y edad).
Al finalizar, hay que mostrar dichos datos... Pero ¿se pueden mostrar todos los
datos de cada jugador? Comentame en el programa si es que se puede, y por
qué.*/

import java.util.Scanner;

public class Ejer_33 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int jugadores, edad;
		String nombre;

		for (jugadores = 1; jugadores <= 11; jugadores++) {

			System.out.println("Ingrese el nombre del jugador: ");
			nombre = entrada.next();

			System.out.println("Ingrese la edad: ");
			edad = entrada.nextInt();

		}
		/*
		 * No se pueden mostrar todos los datos porque solo se mostraran los ultimos
		 * datos ingresados
		 */
	}
}
