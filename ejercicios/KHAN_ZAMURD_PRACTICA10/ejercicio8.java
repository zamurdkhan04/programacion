/* programa que crea un array con 100 numeros reales
 * aleatorios entre 0.0 y 1.0, y luego pide un valor real al usuario
 * por ultimo mostrara cuantos numeros dentro del array son mayores e iguales a R */ 


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;   // importamos la libreria necesaria para introducir datos a traves del teclado
public class ejercicio8 {

	public static void main(String[] args) {
	
		Scanner teclado= new Scanner(System.in);   // nos permite recoger datos a traves del teclado
		
		int contador=0;   // variable que lleva acumula la cantidad de numeros mayores
		double R;
		
		double rango[]= new double[100];   // creamos un array de tamaño 100
		
		for(int i = 0 ; i < rango.length; i++) {  // bucle for que recorre todas las posiciones del array
			
			rango[i]= Math.random();  // para la posicion i del array genera un aleatorio entre 0.0 y 1.0 y lo asigna
			
		}
		
		
		System.out.println("Introduce un numero real(entre 0.0 y 1.0): ");
		R= teclado.nextDouble(); 
		
		for(int i = 0; i < rango.length; i++) {
			
			if(rango[i]>=R) {   // el if compara si el numero aleatorio de la posicion i es mayor a R
				contador++;  
				
			}
			
		}
		
		System.out.println("La cantidad de numeros mayores e iguales a R dentro del array es: " + contador);
		

	}

}
