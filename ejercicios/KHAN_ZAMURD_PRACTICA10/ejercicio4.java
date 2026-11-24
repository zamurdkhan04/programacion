/* programa que pide al usuario 20 numeros enteros, los almacena en un array
 * y muestra la suma de positivos y la suma de negativos por separado  */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;    // importamos la libreria necesaria para introducir datos a traves del teclado
public class ejercicio4 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);  // nos permite recoger datos a traves del teclado
		
		int sumaPos=0;  // varibale que acumula la suma de positivos
		int sumaNeg=0;  // variable que acumula la suma de negativos
		int numeros[]= new int[20];   // creamos un array de tamaño 20
		
		for(int i = 0; i < numeros.length ; i++) {  // bucle for que pide los 20 numeros
			
			
			System.out.println("introduzca un numero: ");
			
			numeros[i]= teclado.nextInt();  // almacena el numero introducido a traves del teclado en el array 
		

		}
		
		for(int i = 0; i < numeros.length ; i++) {   // bucle for que recorre todo el array
			
			if(numeros[i]>=0) {  // comprueba si el numero del array de posicion i es positivo
				
				sumaPos= sumaPos + numeros[i];  // si es positivo se suma al anterior
			
			}
			
			else {   // si es negativo
				
				sumaNeg= sumaNeg + numeros[i]; // si es negativo se suma al anterior
		
			}
		
		}
		
		System.out.println("La suma de numeros positivos es: " + sumaPos);
		System.out.println("La suma de numeros negativos es: " + sumaNeg);
		
	}
}