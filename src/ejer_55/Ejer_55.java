package ejer_55;
/*FUNCIONES
Escriba una función llamada alCuadrado() que calcule el cuadrado
del valor que se le transmite y despliegue el resultado. La función deberá
ser capaz de elevar al cuadrado números flotantes.*/

import java.util.Scanner;
public class Ejer_55 {

	static int n1;

	public static void Ingresar_num() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		n1 = entrada.nextInt();
	}

	public static int cuadrado(int a) {

		int alCuadrado = a * a;
		return alCuadrado;

	}

	public static void main(String[] args) {

		Ingresar_num();
		cuadrado(n1);

		System.out.println("El resultado de la cuenta es: " + cuadrado(n1));

	}
}
