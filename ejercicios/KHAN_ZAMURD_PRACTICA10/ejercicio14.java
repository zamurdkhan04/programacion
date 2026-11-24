/* programa que crea un array con una secuencia de enteros
 * tipo 1,2,2,3,3,3... hasta llegar hasta 10
 */

package KHAN_ZAMURD_PRACTICA10;

public class ejercicio14 {

	public static void main(String[] args) {
		
		int suma=0;  // variable que acumula la suma de los numeros del 1 al 10
		int contador;  // variable que cuenta cuantas veces se repite cada numero
		int n=0;  // variable que lleva la cuenta de las posiciones del array
		
		for(int i=1; i<=10; i++) {   // bucle for que recorre los numeros del 1 al 10

			suma= suma+i;   // acumula la suma de los numeros para calcular el tamaño del array
		}
		
		int secuencia[]= new int[suma];  // creamos un array de tamaño suma (55 posiciones)
		
		for(int i=1; n<suma; i++) {   // bucle for que recorre los numeros desde 1 mientras queden posiciones en el array

			contador=0;  // reinicia el contador a 0 para cada numero
			while(contador<i) {  // bucle while que se repite tantas veces como indica el valor de i
				
				secuencia[n]=i;  
				n++;
				contador++;    // aumenta el contador de veces que se ha almacenado el numero
			}
			
		}
		
		for(int i=0; i<suma; i++) {   // buecle que reocrre el array e imprime por pantalla
			
			System.out.println(secuencia[i]);
		
		}
		
		
		

	}

}
