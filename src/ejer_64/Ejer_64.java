package ejer_64;
/*Indicar a un usuario que ingrese su nombre y apellido. Vamos a pulir un poco 
su ingreso, y vamos a mostrar en pantalla su nombre y su apellido comenzando 
con mayúsculas, y luego en minúsculas. Para eso:
• Pedí nombre. Luego, solicitá apellido.
• Ambos, pasalos totalmente a minúsculas. Guardá cada uno en una 
nueva variable (ejemplo: nombreMinusculas).
• Generá una variable que almacene la primera letra del nombre, y otra 
variable para la primera letra del apellido. SUGERENCIA: usá la variable 
del paso anterior (ejemplo: nombreMinusculas), y acá tenes que usar 
dos métodos de strings 
(ejemplo: nombreMinusculas.toUpperCase().charAt(0) ).
• Ahora, genera otras dos variables que se queden con todo el nombre y 
todo el apellido cada una, pero sin la primera letra. Acá recortá las 
variables que tienen el nombre y apellido en minúsculas.
• Finalmente, mostrá en pantalla nombre y apellido, concatenado las 
variables que contienen la primera letra mayúsculas, con las variables 
que contienen el resto del nombre en minúsculas. */

import java.util.Scanner;

public class Ejer_64 {

static String Nombre, Apellido, nombre_min, apellido_min;
static int caracteres_nom, caracteres_apell;
static char letraNombre_min;
	
	public static void ingreso_datos() {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese el nombre: ");
		Nombre = entrada.next();
		
		System.out.println("Ingrese el apellido: ");
		Apellido = entrada.next();
		
	}
	
	public static void min() {
		
		System.out.println("");
		String nombre_min = Nombre.toLowerCase(); 

		String apellido_min = Apellido.toLowerCase(); 

		System.out.println(nombre_min + "\n" + apellido_min);
		System.out.println("");
		
	}
	
	public static void letra() {
		
	letraNombre_min = nombre_min.toUpperCase().charAt(0);
		
	}
	
	public static void main(String[] args) {
	
		ingreso_datos();
		min();
		letra();
		
		
		
	}
}
