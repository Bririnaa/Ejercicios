package ejer_53;
/*Generá un código en el cual se ingresen apellidos en una matriz. El tamaño de
la matriz, lo definís vos.
Luego, tenés que solicitar por pantalla a un usuario que ingrese un apellido a
buscar.
Si el apellido se encuentra en la matriz, indicar por pantalla “apellido
encontrado”. Si no lo encuentra, indicar que no se encontró lo buscado.
RECORDAR: Utilizar matriz[i][j].equalsIgnoreCase(datoBuscado) para encontrar
un string.*/

import java.util.Scanner;

public class Ejer_53 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[][] apellidos = { { "Martino" }, { "Gomez" } };
		String apell_buscar;
		boolean busqueda = false;

		for (int i = 0; i < apellidos.length; i++) {
			for (int j = 0; j < apellidos.length; j++) {

				System.out.println("Ingrese el Apellido a buscar: ");
				apell_buscar = entrada.next();

				if (apellidos[i][j].equalsIgnoreCase(apell_buscar)) {

					System.out.println("Apellido encontrado.");
					busqueda = true;

				}

				else {
					System.out.println("Apellido no encontrado");
				}
			}

		}

	}
}
