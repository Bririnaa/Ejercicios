package ejer_32;

/*Realizar tabla de multiplicar hasta el número 20 como límite, comenzando del
número 1. El número a multiplicar lo eligirá una persona. Mostrar en pantalla
cada resultado.*/
import java.util.Scanner;

public class Ejer_32 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);

		int numero, limite, resultado;

		System.out.println("Ingrese el numero del cual desea saber la tabla de muliplicar: ");
		numero = entrada.nextInt();

		if (numero > 20) {
			System.out.println("Alcanzo el límite. Ingrese otro numero");

			System.out.println("\nIngrese el numero del cual desea saber la tabla de muliplicar: ");
			numero = entrada.nextInt();
		}

		System.out.println("\nIngrese hasta que valor desea la tabla: ");
		limite = entrada.nextInt();

		for (int i = 1; i <= limite; i++) {

			resultado = numero * i;
			Thread.sleep(20);
			System.out.println(numero + "*" + i + "=" + resultado);

		}

	}
}
