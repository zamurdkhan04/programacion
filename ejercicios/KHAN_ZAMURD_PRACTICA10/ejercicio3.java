/* programa que pide 10 numeros reales al usuario, los almacena en una array
 * y lo recorre para encontrar el maximo y el minimo para mostrarlos por pantalla */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;   // importamos la libreria que nos permite leer datos a traves del teclado
public class ejercicio3 {

	public static void main(String[] args) {
	 
		
		Scanner teclado = new Scanner(System.in);  // nos permite introducir datos  atraves del teclado
				
		double numeros[]= new double[10];  // creamos el array de tamaño 10
		double maximo =0;   // creamos la variable donde se almacenara el maximo despues de cada comprobacion, inicializada en 0
		double minimo=0;   // creamos la variable donde se almacenara el minimo despues de cada comprobacion, inicializada en 0
		
		for(int i = 0; i < numeros.length ; i++) {  // bucle for que pide los 10 numeros
		
		
			System.out.println("introduzca un numero: ");
			
			numeros[i]= teclado.nextDouble();  // almacena el numero introducido a traves del teclado en el array 
			
			
		}
		
		for(int i = 0; i< numeros.length; i++) {  // bucle for que recorre todo el array
			
			if(numeros[i]>maximo) {  // con if comprobamos si el numero leido es mayor al maximo anterior
				
				maximo= numeros[i];  // si es mayor al maximo anterior, el nuevo maximo será el numero de posicion i
				 
			}
			else if(numeros[i]<minimo) {  // lo mismo hacemos con el minimo pero la condicon es al revés
				
				minimo= numeros[i];
				
				
			}
		
			
			
		}
		
		System.out.println("El maximo de los numeros es : " + maximo);
		System.out.println("El minimo de los numeros es : " + minimo);
		
		
		
	
	}

}
