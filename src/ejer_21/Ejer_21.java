package ejer_21;
/*Se harán mediciones de temperaturas de un microprocesador.
• Mostrar en pantalla, por lo menos una vez, el valor 35°C (a modo de
inicio). Luego, esa temperatura aumentará de a 2°C (es decir, se irá
sumando de a dos, y no de a uno), y se mostrará en pantalla cada
medición hasta el valor 100°C.
• En el medio, si el valor de la temperatura es 85°C, mostrar en pantalla
“CUIDADO!, TEMPERATURA PELIGROSA”.
• Al llegar a 100°C, mostrar en pantalla “VALOR EXTREMO. APAGANDO
PC.”.
• Colocar una espera de 20ms en cada aumento de temperatura, y de
1000ms (o sea, 1 segundo) cuando la temperatura llegue a 85°C.*/

public class Ejer_21 {
	public static void main(String[] args) throws InterruptedException {

		int temperatura = 35;

		while (temperatura <= 99) {
			System.out.println(temperatura);
			temperatura += 2;
			Thread.sleep(20);

			if (temperatura == 85) {
				System.out.println("CUIDADO!, TEMPERATURA PELIGROSA");

				Thread.sleep(1000);
			}

		}

		System.out.println("VALOR EXTREMO. APAGANDO PC.");

	}
}
