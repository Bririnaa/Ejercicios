package ejer_25;
/*Vamos a molestar a un papá. Para ello, vamos a generar un código para un hijo,
el cual le pregunte constantemente “¿puedo salir?”. Si la respuesta es NO (así,
en mayúsculas), el hijo le vuelve a realizar la pregunta. Si la respuesta es SI
(también en mayúsculas), entonces el hijo deja de preguntar. Utilizar flags
(variable booleana) para resolver el ejercicio.*/

import java.util.Scanner;

public class Ejer_25 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		char salir = 'N';
		boolean permiso = false;

		do {
			System.out.println("�Puedo salir? (S/N): ");
			salir = datos.next().charAt(0);

			if (salir == 'S') {
				permiso = true;
			}

			else if (salir != 'S' && salir != 'N') {
				System.out.println("Respuesta no valida");
				System.out.println("�Puedo salir? (S/N): ");
				salir = datos.next().charAt(0);

			}
		} while (salir == 'N' && permiso == false);

		if (permiso == true) {
			System.out.println("Gracias!");
		}
	}
}
