/* programa que crea un array con enteros de tamaño 100,
 * y lo rellena con valores enteros aleatorios entre 1 y 10,
 * luego pedira un valor N y mostrará en que posiciones del array aparece N  */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;
public class ejercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		int apariciones;
		int N;
		int rango[]= new int[100];
		
		
		for(int i = 0 ; i < rango.length; i++) {  // bucle for que recorre todas las posiciones del array
			
			rango[i]= (int) (Math.random()*10) +1; // para la posicion i del array genera un aleatorio entero entre 1 y 10 y lo asigna
		
		
		}

		System.out.println("Introduce un numero entero(entre 1 y 10): ");
		N= teclado.nextInt(); // almacena el numero en una variable
		
		for(int i = 0 ; i < rango.length; i++) {  // bucle for que recorre el array
			
			if(rango[i]==N) {  // este if comprueba si coincide 
				
				System.out.println("El numero N ha sido encontrado en la posicion " + i  );  // muestra por pantalla en que posicion coincidieron 
				
			}
			
		}
		
		
		
		
		
	}
}
