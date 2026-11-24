/* programa que pide 2 valores enteros N y M, y luego crea un array de tamaño
 * N y los valores en todas las posiciones sean M y lo muestre por pantalla  */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;   // importamos la libreria necesaria para introducir datos a traves del teclado
public class ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);  // nos permite recoger datos a traves del teclado
		int N;
		int M;
		
		System.out.println("introduce un numero(N): ");
		N= teclado.nextInt();  //almacena el dato introducido a traves del teclado en una variable
		
		System.out.println("introduce un numero(M): ");
		M= teclado.nextInt();  //almacena el dato introducido a traves del teclado en una variable
		
		int array[]= new int[N];  // creamos un array de tamaño N
		
		for(int i=0; i<N ; i++) {   // bucle for que recorre el array de tamaño N
			
			array[i]= M;  // en cada posicion del array el valor sera M
			
		}
		
		System.out.println();
		
		for(int i=0; i<N ; i++) {  // bucle que muestra por pantalla los valores del array
			
			System.out.println("El numero " + "[" + i + "] es: " + array[i]);
			
		}
		
		
		
	}

}
