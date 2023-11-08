package ejer_28;
/*Elaborar un programa, el cuál indicará cuándo la batería de un celular se está
agotando (en %). Para ello:
• Recordar que la batería de un celular se mide en porcentaje (por
ejemplo: 70% de batería).
• Ingresar en el programa, NO por consola, que la batería comienza
teniendo 100% (¡no colocar el símbolo de “%” dentro de un int! Colocá
únicamente el número entero).
• Mientras la batería sea tenga mas del 0%, y menos del 100%, el celular
podrá funcionar.
• Hacé que la batería disminuya de a 1%. Para esto, usá un contador.
Recordar: para achicar de a 1 -> “variable – –” en vez de “variable + +”.
• Mostrar en pantalla el valor de la batería, con una espera de 20ms (mili
segundos) cada vez que disminuya 1%.
• Al llegar al 20%, indicar por pantalla “Batería baja”. Esperar 1 segundo
(1000 mili segundos) para indicar este mensaje.
• Al acabarse la batería, indicar por pantalla “Batería agotada”.*/

public class Ejer_28 {
	public static void main(String[] args) throws InterruptedException {

		int bateria = 100;

		while (bateria > 0 && bateria <= 100) {

			bateria--;
			Thread.sleep(20);
			System.out.println("Porcentaje de bateria: " + bateria);

			if (bateria == 20) {
				Thread.sleep(1000);

				System.out.println("Bateria baja");

			}

			if (bateria == 0) {
				System.out.println("Bateria agotada");
			}

		}

	}
}
