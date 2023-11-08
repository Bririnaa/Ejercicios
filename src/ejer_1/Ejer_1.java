package ejer_1;

/*Escribir y compilar un programa en el cual salga en pantalla tu nombre en una
primera línea, y tu apellido en una segunda línea. Anotá en el programa qué hace
cada línea de código.*/
import java.util.Scanner;

public class Ejer_1 {
	public static void main(String[] args) { /* funcion principal */
		Scanner entrada = new Scanner(System.in); /* Genera un espacio en la memoria para ingresar valores */

		String nombre; /* string se usa para cadena de caracteres y "nombre" es la variable */
		String apellido;

		System.out.println("Ingrese su nombre: "); /* se muestra en pantalla lo que esta entre parentesis y lo que se */
		nombre = entrada.next(); /* guarda en la varible (que en este caso es nombre) */

		System.out.println("Ingrese su apellido: ");
		apellido = entrada.next();

		System.out.println(""); /* las comillas solas sirve para dejar espacio */
		System.out.println(nombre); /* muestra lo que se guardo en la variable nombre */
		System.out.println(apellido);
	}
}
