package ejer_56;
/*Vas a hacer un programa ordenado, con funciones, para calcular el
porcentaje de asistencias de un estudiante. Primero que nada, solicitá el
nombre y apellido del alumno.
Luego, los pasos que te voy a indicar, hacelos dentro de una función
porcentajeAsistencias ():

• Pedir la cantidad de asistencias del alumno.
• También solicitar la cantidad de clases totales.
• Dividir la cantidad de asistencias sobre las clases totales.
• Retornar en la función porcentajeAsistencias () el porcentaje de
asistencias.
//• Ahora, mostrá en pantalla el porcentaje de asistencias.*/

import java.util.Scanner;

public class ejer_56 {

	static String nombre, apellido;
	static float asistencias, clases_totales;

	public static void alumno() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el nombre del estudiante: ");
		nombre = entrada.next();

		System.out.println("Ingrese el apellido del estudiante: ");
		apellido = entrada.next();

	}

	public static float porcentajeAsistencias(float a, float b) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de asistencias del alumno: ");
		a = entrada.nextInt();

		System.out.println("Ingrese la cantidad de clases totales: ");
		b = entrada.nextInt();

		float porcentaje = (a / b) * 100;

		return porcentaje;
	}

	public static void main(String[] args) {

		alumno();

		System.out.println("El porcentaje de asistencias del alumno es: "
				+ porcentajeAsistencias(asistencias, clases_totales) + "%");

	}
}
