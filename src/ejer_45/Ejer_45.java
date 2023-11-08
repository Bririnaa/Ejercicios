package ejer_45;
/*Por programa, guardar los siguientes números de socio de un club de fútbol en
un array: 1011, 2367, 8748, 9121, 0817, 6423, 2034. Son siete números.
Esos números, deben estar asociados a los siguientes nombres: Enrique
(1011), Liliana (2367), Lucas (8748), Juan (9121), Fiorella (0817), Ariel (6423),
y Daiana (2034).
Por pantalla, indicale a un empleado administrativo lo siguiente: “Para
encontrar a un individuo, ingresar número de socio: “.
Si el número de socio ingresado por el empleado coincide con alguno de los
que se guardaron al principio del programa, mostrar por pantalla a quién
corresponde ese número de socio, y finalizar la búsqueda.
Luego, mostrar por pantalla el nombre de la persona, y el número de socio de
esa persona.*/

import java.util.Scanner;

public class Ejer_45 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] nombres = { "Enrique", "Liliana", "Lucas", " Juan", "Fiorella", "Ariel", "Daiana" };

		int[] socios = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };

		int busqueda;

		for (int j = 0; j < 7; j++) {

			System.out.println("\nPara encontrar a un individuo, ingrese numero de socio: ");
			busqueda = entrada.nextInt();

			for (int i = 0; i < 7; i++) {

				if (socios[i] == busqueda) {

					System.out.println("El socio " + socios[i] + " es: " + nombres[i]);
				}

			}
		}
	}
}
