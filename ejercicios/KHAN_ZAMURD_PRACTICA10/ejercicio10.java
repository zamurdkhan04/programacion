/* programa que pide un valor N y luego almacenará en un array
 * N alturas introducidas a traves del teclado. luego mostrara por pantalla
 * la altura media, la altura maxima y minima asi como cuantas personas miden
 * por encima y por debajo de la media */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;  // // importamos la libreria necesaria para introducir datos a traves del teclado
public class ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);  // nos permite recoger datos a traves del teclado
		
		int N;  
		int alturaMax=0;
		int alturaMin=0;
		double media;
		int encima=0;
		int debajo=0;
		int sumaAlturas=0;
		
		System.out.print("introduce el numero de alturas a introducir: ");  
		N= teclado.nextInt();   // almacena el numero introducido a traves del teclado en el array
		int alturas[]= new int[N];  // creamos el array de teamaño N
		
		for(int i=0; i<N; i++) {  // bucle for que almacena las alturas
			
			System.out.println("Introduzca la altura(cm): ");
			
			alturas[i]= teclado.nextInt();
			sumaAlturas= sumaAlturas+ alturas[i];
			
		
					
			if (i == 0) {  // establecemos altura maxima y altura minima como altura inicial para luego poder comparar
		        alturaMax = alturas[i];
		        alturaMin = alturas[i];
		    }

		    if (alturas[i] > alturaMax) {  // compara si la altura es mayor a la altura maxima para cada posicion
		        alturaMax = alturas[i];   
		    }
 
		    if (alturas[i] < alturaMin) {  // compara si la altura es menor a la altura minima en cada posicion
		        alturaMin = alturas[i];
		    }	
			
			
		}
		
		
		media= (double)sumaAlturas/N;  // calcula la media
		
		for(int i=0 ; i<N; i++) {  // bucle for que recorre el array
			
			if(alturas[i]<media) {  // este if comprueba si la altura es menor a la media para cada posicion
				
				debajo++;
				
			}
			
			if(alturas[i]>media) {   // este if comprueba si la altura es mayor a la altura media en cada posicion
				
				encima++;  
				
			}
			
		}
		
		// imprime todo por pantalla

		System.out.println("La altura maxima es: " + alturaMax + "\r\n" +   
		"La altura minima es: " + alturaMin + "\r\n" +
		"La Media de alturas es: " + media + "\r\n" +
		"La cantidad de alturas por debajo de la media es: " + debajo + "\r\n" +
		"La cantidad de alturas por encima de la media es: " + encima + "\r\n" );
		
		
	}

}
