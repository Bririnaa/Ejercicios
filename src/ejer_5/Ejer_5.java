package ejer_5;

/*Calculá la raíz cuadrada de un valor que ingrese un usuario (positivo,
obviamente).
Mostrá el resultado en float, y en int.*/
import java.util.Scanner;

public class Ejer_5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float num;

		System.out.println("Ingrese un numero positivo: ");
		num = entrada.nextFloat();

		float raiz_cuadrada = (float) Math.sqrt(num);

		int raiz_cuadrada2 = (int) Math.sqrt(num);

		System.out.println("El resultado de la raiz es : " + raiz_cuadrada);
		System.out.println("El resultado de la raiz es : " + raiz_cuadrada2);
	}
}
