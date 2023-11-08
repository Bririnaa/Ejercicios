package ejer_47;
/*Pedile a un usuario que ingrese las notas de un alumno, junto con su apellido.
Utilizando el método array.lenght, limitá en el ‘for’ para ingresar esa cantidad
deseada.
Luego, copia el array creado para cargar las notas.
Después, ordená la copia del array (con el método sort).
Finalmente, mostrá en pantalla el array desordenado, y el array ordenado.*/

import java.util.Arrays;
import java.util.Scanner;

public class Ejer_47 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String apellido;

		System.out.println("Ingrese el apellido del alumno: ");
		apellido = entrada.next();

		int[] nota = new int[10];

		for (int i = 0; i < nota.length; i++) {

			System.out.println("\nIngrese la nota " + (i + 1) + " del Alumno : ");
			nota[i] = entrada.nextInt();

		}

		int[] arrayCopiaNotas = nota.clone();

		// Codigo para ordenar de forma Ascendente
		Arrays.sort(arrayCopiaNotas);

		System.out.println("Array de notas ordenadas:");
		for (int numero : arrayCopiaNotas) {
			System.out.println(numero);
		}

		System.out.println("");

		System.out.println("Array de notas desordenadas:");
		for (int numero2 : nota) {
			System.out.println(numero2);
		}

		System.out.println("");

	}
}
