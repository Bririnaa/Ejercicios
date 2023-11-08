package ejer_35;
/*Indicar a un profesor que cargue 5 calificaciones de un alumno. Hay que
identificar: la nota mas baja, y la nota mas alta.
Mostrar en pantalla ambas notas.
Por último, hay que almacenar las notas cargadas por el profesor. Finalmente,
a esta suma de notas hay que dividirla por 5, para obtener el promedio del
alumno. Mostrar el promedio en pantalla. NO USAR ARREGLOS/ARRAYS.*/

import java.util.Scanner;

public class Ejer_35 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float nota, nota_max = 0, nota_min = 11, promedio = 0;

		for (int i = 0; i < 4; i++) {

			System.out.println("Ingrese la nota del alumno: ");
			nota = entrada.nextFloat();

			if (nota > nota_max) {
				nota_max = nota;
			}
			
			if (nota < nota_min) {
				nota_min = nota;
			}

			
			promedio += nota;

		}
		System.out.println("La nota mas alta es: " + nota_max);
		
		System.out.println("La nota mas baja es: "+nota_min);
		
		promedio = promedio / 5;
		
		System.out.println("El promedio es: " +promedio);
	}
}

