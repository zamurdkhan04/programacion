/* programa que crea 2 arrays de enteros de tamaño 100
 * el primero tendra los valores del 1 al 100 y el segundo copiara los mismo valores
 * pero en orden inverso */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;   // importamos la libreria necesaria para introducir datos a traves del teclado
public class ejercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int array[]= new int[100];  // creamos el array de tamaño 100
		int arrayInverso[]= new int[100];  //  creamos el array con los numeros copiados en orden inverso de tamaño 100
		
		
		for(int i = 0; i < array.length; i++) {  // bucle for que recorre las posiciones del array y asigna los valores de 1 a 100
			
			array[i]=i+1;  // +1 para que empiece por 1
			
		}
		
		for(int i=0; i < arrayInverso.length; i++) {  // bucle for que recorre las posiciones del array inverso
			
			arrayInverso[i]=array[99-i];  // en este caso asigna los mismo valor que contiene el array, pero hemos invertido el orden usando (99-1)
			  
		}
		
		for(int i = 0; i < array.length; i++) {  // bucle for para imprimir por pantalla
			
			System.out.println("Numero[" + i + "]: " + array[i]);
			
			
		}
		
		System.out.println();
		for(int i = 0; i < arrayInverso.length; i++) {  // bucle for para imprimir por pantalla
			
			System.out.println("Numero[" + i + "]: " + arrayInverso[i]);
			
			
		}
		
	}
		
	
		

}


