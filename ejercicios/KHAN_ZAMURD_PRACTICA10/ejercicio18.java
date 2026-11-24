
/* programa que crea un array de tamaño 30 y lo rellena
 * de valores aleatorios entre 0 y 9. luego ordena los valores del array y los muestra por pantalla
 */

package KHAN_ZAMURD_PRACTICA10;

public class ejercicio18 {

    public static void main(String[] args) {

        int auxiliar = 0; // variable que almacena temporalmente un numero para intercambiar posiciones

        int numeros[] = new int[30]; // creamos un array de 30 posiciones

        for (int i = 0; i < numeros.length; i++) { // bucle for que recorre todas las posiciones del array

            numeros[i] = (int)(Math.random()*10); // genera numeros aleatorios entre 0 y 9 y los almacena en el array

        }

        for (int i = 0; i < numeros.length; i++) { // bucle for que recorre las posiciones del array para ordenarlas

            for (int k = i + 1; k < numeros.length; k++) { // bucle for que compara cada posicion con las siguientes

                if (numeros[i] > numeros[k]) { // si el numero de la posicion i es mayor que el de la posicion k, intercambia sus valores

                    auxiliar = numeros[i]; // guarda temporalmente el numero mayor para no perderlo

                    numeros[i] = numeros[k]; // coloca el numero menor en la posicion i

                    numeros[k] = auxiliar; // coloca en la posicion k el numero mayor que habiamos guardado en auxiliar

                }

            }

        }

        for (int i = 0; i < numeros.length; i++) { // bucle for que recorre todas las posiciones del array ordenado

            System.out.println(numeros[i]); // muestra el numero almacenado en cada posicion del array

        }

    }
}
