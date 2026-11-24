/* programa que crea un array de 10 enteros y se mostraran por pantalla 3 opciones
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
hasta que el usuario elija la opción ‘c’ que terminará el programa */


package KHAN_ZAMURD_PRACTICA10;

import java.util.Scanner;  // importamos la libreria necesaria para introducir datos a traves del teclado
public class ejercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);   // nos permite recoger datos a traves del teclado
		int V;
		int P;
		
		int array[]= new int[10];   // creamos un array de tamaño 10
		
		for(int i = 0; i < array.length; i++) {  // recorremos el array y asignamos 10 valores enteros
			
			array[i]= (int)(Math.random()*100)+1;  // para la posicion i del array genera un entero aleatorio entre 1 y 100 y lo asigna

			
			
		}
		
		System.out.println("Escoge una opcion:" + "\r\n"+
		"opcion(a)" + "\r\n" +
		"opcion(b)" + "\r\n" +
		"opcion(c) para terminar " + "\r\n");
		
		char opcion = teclado.next().charAt(0);  // recoge la opcion introducida por el usuario y almacena el primer caracter
		
		while(opcion!='c') {  // el bucle while se repite mientras la opcion no sea "c"
			
			if(opcion=='a') {  // el if comprueba si el usuario ha elegido la opcion a
			
				for(int i = 0; i < array.length; i++) {  // recorre todas las posiciones del array y muestra sus valores
					
					System.out.println("Numero[" + i + "]: " + array[i]);
					
				}
			}
			
			if(opcion=='b') {  // el if comprueba si el usuario ha elegido la opcion b
				
				System.out.println("Introduce un numero: ");
				V=teclado.nextInt();  // recoge el numero que se quiere introducir en el array

				
				System.out.println("Introduce posicion(0-9): ");
				P=teclado.nextInt();  // recoge la posicion del array que se quiere modificar
				
				array[P]=V;  // asigna el valor V a la posicion P del array
				
				System.out.println("El numero del array de la posicion " + P + " ahora es: " + array[P]);
			}
				
				
			
			
			System.out.println("Escoge una opcion:" + "\r\n"+
					"opcion(a)" + "\r\n" +
					"opcion(b)" + "\r\n" +
					"opcion(c) para terminar ");
			
			opcion=teclado.next().charAt(0);   // vuelve a recoger una opcion para repetir el menu o terminar el programa
			
		}
		
		
		
		System.out.println("Usted salió del menú de opciones");
		
	}	
}



