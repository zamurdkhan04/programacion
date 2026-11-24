/* programa que pide dos valores enteros P y Q, y luego crea un array que contenga los numeros
 * desde P hasta Q, y lo muestra por pantalla */



package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;    // importamos la libreria necesaria que nos permite leer datos a traves del teclado
public class ejercicio7 {
	
	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		int P;  
		int Q;
		int posicion=0;  // variable de posicion dentro del array
		
		System.out.println("Introduce un numero(P): ");
		P= teclado.nextInt();   // almacenamos el numero introducido a traves del teclado en una variable
		
		System.out.println("Introduce un numero(Q): ");
		Q= teclado.nextInt();   // almacenamos el numero introducido a traves del teclado en una variable
		
		int tamaño= Q-P+1;   // el array tendra el tamaño limite maximo menos limite minimo y +1 para que incluya los limites
		int numeros[]= new int[tamaño];  // creamos el array
		
		for(int i=P; i<=Q ; i++) {  // bucle for que va asignando los valores desde P hasta Q a cada posicon dentro del array 
			
			numeros[posicion]=i;
			System.out.println("El numero " + "[" + posicion + "]: " + numeros[posicion]);
			posicion++;   // aumenta posicion en 1 despues de cada asignacion
		}
			
		
		
		
		
	}

}

