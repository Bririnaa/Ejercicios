package ejer_6;

/*Solicitale a un alumno que ingrese cuánto se sacó en un examen (del 1 al 10,
con decimales).
El programa deberá redondear el número, y mostrar en pantalla el resultado.*/
import java.util.Scanner;

public class Ejer_6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float num;

		System.out.println("Ingrese su nota del examen con numeros decimales: ");
		num = entrada.nextFloat();

		int numRedondeado = (int) Math.round(num);

		System.out.println("El numero redondeado es: " + numRedondeado);

	}
}
