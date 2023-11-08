package ejer_52;
/*Realizá un programa en el cual, por programa, esté definida una matriz de 2x2,
con números enteros.
A alguno de sus elementos, agregale un entero negativo.
Luego, mostrá en pantalla los elementos de la matriz.
Si alguno de sus números es negativo, no mostrarlo en pantalla, y solicitar un
nuevo número.
Finalmente, mostrar en pantalla la matriz modificada.*/

import java.util.Scanner;

public class Ejer_52 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[][] matriz = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.println("Ingrese un numero en la posicion: " + i + " " + j + " ");
				matriz[i][j] = entrada.nextInt();

				if (matriz[i][j] < 0) {

					System.out.println("Valor invalido");
					j--;
					continue;
				}
			}
		}

		System.out.println("");

		for (int m = 0; m < 2; m++) {
			for (int b = 0; b < 2; b++) {

				System.out.print(matriz[m][b] + " ");
			}
		}

	}
}
