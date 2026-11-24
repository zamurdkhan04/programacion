/* programa que pide 10 numeros reales al usuario, los almacena en un array
y muestra la suma de todos */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;   // importamos la libreria necesaria que nos permite leer datos a traves del teclado
public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);  // nos permite introducir datos a traves del teclado
		
		double numeros[]= new double[10];  // crea un array de tamaño 10
		double suma = 0;                // variable que va almacenando la suma
		for(int i = 0; i < numeros.length ; i++) {   // bucle for que pide los 10 numeros
			
			System.out.println("introduzca un numero: ");
			
			numeros[i]= teclado.nextDouble();   // almacena el numero introducido a traves del teclado en el array
			suma= suma + numeros[i];   // acumula la suma de los numeros
		
		
		
			
			
		}
		
		System.out.println();
		System.out.println("la suma de todos los numeros es: " + suma);
		
		
		
		
		

	}

}
