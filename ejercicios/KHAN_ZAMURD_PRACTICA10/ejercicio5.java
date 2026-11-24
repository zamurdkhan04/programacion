/* programa que pide 20 numeros reales al usuario, y luego recorre el array
 * para hacer una media y mostrarla por pantalla */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);  // nos permite introducir datos a traves del teclado
		
		double numeros[]= new double[20];  // crea un array de tamaño 20
		double suma = 0;  // variable que va almacenando la suma
		int contador =0;
		double media;
		
		for(int i = 0; i < numeros.length ; i++) {   // bucle for que pide los 20 numeros
			
			System.out.println("introduzca un numero: ");
			
			numeros[i]= teclado.nextDouble();   // almacena el numero introducido a traves del teclado en el array
			suma= suma + numeros[i];   // acumula la suma de los numeros
			contador++; // aumenta el contador en 1
		
		
			
			
		}
		
		media= suma/contador;  // calcula la media
		System.out.println();
		System.out.println("la media de todos los numeros es: " + media);
		

	}

}
