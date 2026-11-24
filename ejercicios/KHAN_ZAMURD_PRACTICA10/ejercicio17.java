/* programa que pide al usuario 20 valores enteros,
 * e introduzca los 10 primeros en un array y los 10 ultimos en otro
 * por ultimo comparara amobos arrays y le dira si son iguales o no */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;   // importa la librria necesaria para poder lkeer datos a traves del teclado
public class ejercicio17 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);   // nos permite introducir datos a traves del teclado
		
		int contador=0;   // cuenta las veces que 2 numeros han coincido 
		int numeros[]= new int[10];   // array para los 10 primeros
		int numeros2[]= new int[10];  // array para lso 10 ultimos
		  
		for (int i = 0; i < numeros.length; i++) {  // bucle for que recorre el array para asignar los 10 primeros valores
			
			System.out.println("Introuduce un numero:");
			
			numeros[i]= teclado.nextInt();  // almacena el numero introducido a tarves del teclado en la posicion i del array
			
		}
		
		for (int i = 0; i < numeros2.length; i++) {    // bucle for que recorre el array para asignar los 10 ultimos valores
			  
			System.out.println("Introuduce un numero:");
			
			numeros2[i]= teclado.nextInt();
			
		}
		
		for(int i = 0; i < numeros.length; i++) {   // bucle for que recorre los 2 arrays
			
			if(numeros[i]==numeros2[i]) {  // con este if comparamos si para la posicion i los 2 numeros coincidieron
				contador++;  // aumenta en 1 si coincidieron
				
				
			}
		}
		
		if(contador==10) {  // si coincidieron las 10 posiciones, los arrays son iguales
			
			System.out.println("Los dos arrays son iguales");
			
		}
		else {  // si no coincidieron
			
			System.out.println("Los dos arrays no son iguales");
			
		}
			
	}
}


