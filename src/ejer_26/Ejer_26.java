package ejer_26;
/*Solicitar a un usuario que ingrese una contraseña. Deberá indicarse si la
contraseña es correcta o no, según las siguientes condiciones:
• La contraseña debe ser tu año de nacimiento.
• Mientras la contraseña no sea tu año de nacimiento, y el numero de
intento sea menor a 3, la persona podrá intentar volver a escribirla.
PENSAR MUY BIEN ESTA CONDICIÓN DEL WHILE. No resolver por
método de banderas.
• En ese proceso de colocar la contraseña de nuevo, recordá aumentar la
cantidad de intentos.
• Dentro de ese proceso, indicar por pantalla “Contraseña incorrecta”, luego
mostrar el número de intentos actuales, y luego solicitar que se ingrese
nuevamente la contraseña.
• Al finalizar el proceso de ingreso de contraseña (porque se ingresó la
contraseña correcta, o bien, porque se llegó al límite de intentos), hay que
analizar una condición, y actuar en consecuencia: si la cantidad de
intentos es igual a 3, indicar por pantalla que el usuario está bloqueado.
Si no, mostrar por pantalla que la contraseña es correcta.*/

import java.util.Scanner;

public class Ejer_26 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int cont = 2006, intentos = 0;

		System.out.println("Ingrese la contraseña: ");
		cont = datos.nextInt();

		while (cont != 2006 && intentos < 3) {
			intentos++;
			System.out.println("Contraseña incorrecta.Cant de intentos: " + intentos);
			System.out.println("\nIngrese nuevamente la contraseña: ");
			cont = datos.nextInt();

			if (cont == 2006) {
				System.out.println("Contraseña correcta!");
			}

			else if (intentos == 3) {
				System.out.println("El usuario esta bloqueado");
			}
		}

	}
}
