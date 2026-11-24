/* programa que muestra el ranking de puntuaciones de 8 jugadores
 * de ajedrez. se le pedira al usuario que introduzca las puntuaciones,
 * y luego se mostrara por pantalla en orden descendente */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;
public class ejercicio19 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		int auxiliar;   // variable que almacena temporalmente un numero para intercambiar posiciones
		int puntuaciones[]= new int[8];  // creamos un array de tamaño 8
		
		for(int i = 0; i < 8; i++) {   // bucle for que recorre todas las posiciones del array
			
			System.out.println("introuduce la puntacion del jugador: ");
			puntuaciones[i]=teclado.nextInt();   //almacena las puntuaciones en una variable
			
		}
			
		for(int i = 0; i < puntuaciones.length; i++) {    // bucle for que recorre las posiciones del array para ordenarlas
			
			for (int k = i + 1; k < puntuaciones.length; k++) {   // bucle for que compara cada posicion con las siguientes
				
				if(puntuaciones[i]<puntuaciones[k]) {   // si el numero de la posicion i es menor que el de la posicion k, intercambia sus valores
					
					auxiliar= puntuaciones[i];  // guarda temporalmente el numero mayor para no perderlo
					puntuaciones[i]= puntuaciones[k];  // coloca el numero menor en la posicion i  
					puntuaciones[k]= auxiliar;   // coloca en la posicion k el numero mayor que habiamos guardado en auxiliar
					
					
				}
		
			}
			
		}
		
		System.out.println();  // salto de linea
		for(int i=0; i<8; i++) {  // bucle for que recorre el arrau y que muestra el ranking por pantalla
			
			System.out.println("TOP "+ (i+1) + ": "  +puntuaciones[i]);
			
			
		}
		
		

	}

}
