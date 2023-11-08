package ejer_20;
/*SENTENCIA BUCLE: WHILE (Y DO WHILE).
Escribí un programa en el cual un streamer desea recibir una alerta por pantalla
en la cual le indique que llegó a 100 seguidores. Dejar 20ms al incremento de
seguidores para que se vea de a poco el incremento. Al finalizar y llegar a 100,
mostrar por pantalla la alerta de que logró su objetivo.*/

import java.util.Scanner;

public class Ejer_20 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);

		int seguidores = 0;

		while (seguidores <= 100) {
			System.out.println(" Seguidor N " + seguidores);
			Thread.sleep(20);
			seguidores++;

		}

		System.out.println("Felicidades!! Llegaste a los 100 seguidores!!");
	}
}
