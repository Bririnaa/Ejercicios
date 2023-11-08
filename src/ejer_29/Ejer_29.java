package ejer_29;
/*SENTENCIA BUCLE: FOR.
El ejercicio anterior (28), ahora hacelo con FOR. Compará ambos ejercicios (28
y 29), y comentá en el ejercicio 29 qué programa tiene menos cantidad de
líneas de código.*/

public class Ejer_29 {
	public static void main(String[] args) throws InterruptedException {

		for (int bateria = 100; bateria >= 0; bateria--) {
			Thread.sleep(20);
			System.out.println("bateria: " + bateria + " % ");

			if (bateria == 20) {
				Thread.sleep(1000);
				System.out.println("BATERIA BAJA!");
			}

		}

		System.out.println("BATERIA AGOTADA");

		/*
		 * el ejercicio 29 tiene 19 lineas de codigo en cambio, el ejercicio 28 tiene 29
		 */

	}
}
