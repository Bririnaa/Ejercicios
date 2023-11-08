package ejer_41;
/*Completar por programa un arreglo del 0 al 9, que contenga los siguientes
nombres o apellidos: Messi, Maradona, Aymar, Gallardo, Palermo, Riquelme,
Vagoneta, Eito, Leybovich y Raffo.
Luego, con la ayuda de un bucle “for each”, deben mostrar en pantalla cada
uno de estos nombres.*/

public class Ejer_41 {
	public static void main(String[] args) {

		String[] nombres = { "Messi", "Maradona", "Aymar", "Gallardo", "Palermo", "Riquelme", "Vagoneta", "Eito",
				"Leybovich", "Raffo" };

		for (String nombres2 : nombres) {

			System.out.println(nombres2);

		}

	}
}
