package ejer_31;
/*Mostrá en pantalla 100 veces la frase “Te quiero”.*/

public class Ejer_31 {
	public static void main(String[] args) throws InterruptedException {

		for (int frase = 0; frase <= 100; frase++) {

			Thread.sleep(20);
			System.out.println("Te quiero! <3 ");

		}
	}
}
