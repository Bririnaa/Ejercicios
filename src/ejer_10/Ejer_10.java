package ejer_10;

import java.util.Scanner;
/*SENTENCIA CONDICIONAL: IF
Tomar el ejercicio anterior (desafío 9). Ahora, el jugador ingresará un número
entre 0 y 99 (indicarle esto mismo).
Si el número coincide con el número rándom generado por el programa, mostrar
en pantalla que ganó. Si no coincide, mostrarle que perdió.*/

public class Ejer_10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nombre, apellido;
		float num;

		System.out.println("Ingrese su nombre: ");
		nombre = entrada.next();

		System.out.println("Ingrese su apellido: ");
		apellido = entrada.next();

		System.out.println("Ingrese un numero entre 0 - 99: ");
		num = entrada.nextFloat();

		double numeroAleatorio = (Math.random() * 99);

		if (num == numeroAleatorio) {
			System.out.println("Ganaste");
		}

		else {
			System.out.println("Perdiste");
		}

	}
}
