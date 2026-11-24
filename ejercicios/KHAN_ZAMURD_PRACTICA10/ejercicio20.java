/* programa que crea un array de tamaño 1000 y lo rellena con valores aleatorios
 * entre 0 y 99, luego pedira al usuario un valor N, y se mostrara por pantalla
 * si existe en el array y cuantas veces aparece */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;
public class ejercicio20 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numeros[]= new int[1000];  // creamos un arrayb de tamaño 1000
		
		int N;  
		int contador = 0;   // variable que cuenta las veces que N aparece
		
		for(int i = 0; i < numeros.length; i++) {  // bucle for que recorre el array
			
			numeros[i]= (int)(Math.random()*100);  // a cada posicion del array le asignamos un aleatorio entre 0 y 99
			
		}
		
		System.out.println("Introduce un numero: ");  // pedimos N y almacenamos en una variable
		N= teclado.nextInt();
		
		for(int i = 0; i < numeros.length; i++) {  // bucle for que recorre el array
			
			if(numeros[i]==N) {  // este if comprueba si el numero aparece en alguna psocion del array
				
				contador++;  // si aparece lo cuenta
				
			}
			
		}
		
		if(contador>0) {  // si ha aparecido al menos 1 vez
			
			System.out.println("El numero introducido esta dentro del array\n"
					+ "Aparece " + contador + " veces");
			
		} else {  // si no ha aparecido
			
			System.out.println("El numero no exite dentro del array");
			
		}
		
		

	}

}
