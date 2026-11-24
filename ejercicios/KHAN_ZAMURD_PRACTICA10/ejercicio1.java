/* este es un programa QUE PIDE 10 NUMEROS REALES AL USUARIO Y LOS ALMACENA EN UN ARRAY
PARA LUEGO MOSTRARLOS POR PANTALLA */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;    // importamos la libreria necesaria para introducir datos a traves del teclado
public class ejercicio1 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);  // nos permite recoger datos a traves del teclado
		double numeros[]= new double[10];   // creamos un array de tamaño 10
		
			
		for(int i = 0 ; i < numeros.length ; i++) {    // este bucle for nos permite recoger 10 numeros para las 10 posiciones del array
			
			System.out.println("Introduce un numero: ");
			
			numeros[i]= teclado.nextDouble();  // almacena el numero introducido a traves del teclado en el array
			
			
			
		}
		
		
		for(int i = 0 ; i < numeros.length; i++) {
			
			System.out.println(numeros[i]);  // muestra los numeros del array 
			
			
		}
		
	
	
	}

}
