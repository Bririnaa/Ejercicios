package ejer_7;

/*a) Mostrar en pantalla "Qué calificación tendrás en el año en la asignatura
"Laboratorio de algoritmos y estructura de datos?"
b) Luego, generar un número entero rándom entre 1 y 10, y mostrarlo en
pantalla.
Recordar que el objeto "Math.random" nos devuelve números decimales
(double) entre 0 y 1.*/

import java.util.Scanner;

public class Ejer_7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("\t¿Que calificacion tendras en el año en la asignatura "
				+ "Laboratorio de algoritmos y estructura de datos?");

		double numeroAleatorio = (Math.random() * 10);

		System.out.println("\nLa calificacion que tendras es: " + numeroAleatorio);

	}
}
