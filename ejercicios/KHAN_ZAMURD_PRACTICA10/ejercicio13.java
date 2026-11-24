/* programa que permite al usuario almacenar una secuencia aritmetica en
 * un array y luego la mustra. pedimos V, que sera el inicio e I que seria el incremento
 * ademas pedira N, numero de valores a crear*/


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;      // importamos la libreria necesaria para introducir datos a traves del teclado
public class ejercicio13 { 

	public static void main(String[] args) {
		
			Scanner teclado = new Scanner(System.in);   // nos permite recoger datos a traves del teclado
			
			int V, N, I;   
			int n=0;   // variable que lleva la cuenta de las posiciones del array
			System.out.println("Introduce la longitud de la secuencia: ");
			N=teclado.nextInt();
			
			System.out.println("Introduce el inicio de la secuencia:");
			V= teclado.nextInt();
			
			System.out.println("Introduce el incremento de la secuencia");
			I= teclado.nextInt();
			
			
			int secuencia[]= new int[N];  // creamos un array de tamaño N
			
			
			for(int i=V; n<N ; i=i+I) {   // bucle for que comienza en V y aumenta de I en I hasta almacenar N numeros
				
				secuencia[n]=i;  // para la posicion n del array asigna el valor actual de i
				n++;


			}
			
			for(int i=0; i<N; i++ ) {   // bucle for que recorre todas las posiciones del array e imprime por pantalla la secuencia

				
				System.out.println("El numero[" + i + "] es: " + secuencia[i]);
					
				
			}
			
			
	}
	
}
