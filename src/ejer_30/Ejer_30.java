package ejer_30;
/*Realizar el ejercicio 20, pero con la sentencia FOR.*/

public class Ejer_30 {
	public static void main(String[] args) throws InterruptedException {

		for (int seguidores = 1; seguidores <= 100; seguidores++) {

			Thread.sleep(20);
			System.out.println("Seguidor N: " + seguidores);

		}

		System.out.println("FELICIDADES! Llegaste a los 100 seguidores");

	}
}
