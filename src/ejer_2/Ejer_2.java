package ejer_2;

/*Armá un programa en el cual se defina en él mismo tu nombre, apellido, tu género
(con una sola letra) y tu edad. Luego, hay que mostrar en pantalla esos datos.
Los datos deben ser mostrador de manera centrada, y dejando un espacio de
una línea (un "renglón") entre datos.*/
import java.util.Scanner;

public class Ejer_2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombre;
		String apellido;
		int edad;
		char genero;

		System.out.println("\t\nIngrese su nombre: ");
		nombre = entrada.next();

		System.out.println("\t\nIngrese su apellido: ");
		apellido = entrada.next();

		System.out.println("\t\nIngrese su edad: ");
		edad = entrada.nextInt();

		System.out.println("\t\nIngrese su genero: ");
		genero = entrada.next().charAt(0);

		System.out.println("\nSu nombre: " + nombre);

		System.out.println("\nSu apellido: " + apellido);

		System.out.println("\nSu edad: " + edad);

		System.out.println("\nSu genero: " + genero);

	}
}
