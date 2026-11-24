/* programa que crea un array de nteros con la secuencia tipo
 * 1,2,2,3,3,3... hasta 10 ( pero esta vez usaremos arrays.fill() ) */ 


package KHAN_ZAMURD_PRACTICA10;

import java.util.Arrays;
public class ejercicio16 {

	public static void main(String[] args) {
		
		int suma= 0;
		int n=0;
		
		for(int i=1; i<=10; i++) {   // bucle for que recorre los numeros del 1 al 10

			suma= suma+i;   // acumula la suma de los numeros para calcular el tamaño del array
		}
		
		int secuencia[]= new int[suma];  // creamos el array del tamaño suma
		
		for(int i=1; i<=10; i++) {  // bucle for que recorre el array
			
			Arrays.fill(secuencia,n, n + i ,i);  // con la funcion array.fill() vamos rellenando el array con i, desde n hasta n+1
			
			n = n+i;  //avanza una posicion del array
		}
		
		for(int i = 0 ; i < suma; i++) {  // bucle for que recorre el array e imprime por pantalla
			
			System.out.println(secuencia[i]);
			
			
			
			
		}
		
		
		

	}

}
