package ejer_43;
/*Generar un programa el cual almacene cinco números enteros. Si alguno de
esos números es negativo, no debe mostrarse en pantalla.*/

import java.util.Scanner;

public class Ejer_43 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int [] num = new int[5];

		for (int i = 0; i <= 5; i++) {

			System.out.println("Ingrese un numero: ");
			num[i] = entrada.nextInt();

			if (num[i]< 0) {
				continue;
			}

			if (num[i] > 0) {
				System.out.println("El numero es: " + num[i]);
			}

		}
		
	}
}
