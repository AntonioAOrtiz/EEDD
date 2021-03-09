
package com.mycompany.criba;
/**
* Clase para generar todos los n�meros primos de 1 hasta
* un n�mero m�ximo especificado por el usuario. Como
* algoritmo se utiliza la criba de Erat�stenes.
* <p>
* 
* <p>
* El algoritmo es bastante simple: Dado un vector de
* enteros empezando en 2, se tachan todos los m�ltiplos
* de 2. A continuaci�n, se encuentra el siguiente
* entero no tachado y se tachan todos sus m�ltiplos. El
* proceso se repite hasta que se pasa de la ra�z cuadrada
* del valor m�ximo. Todos los n�meros que queden sin
* tachar son n�meros primos.
*
* @author Antonio Ortiz
* @version 1.0 Marzo 2021 (FB)
*/
public class Criba {
	/**
	 * M�todo que convierte todas las posiciones no primas en false
	 * @param esPrimo array de booleanos con todos sus elementos en true excepto los dos primeros
	 * @return esPrimo devuelve el array dado
	 */
	public boolean[] criba(boolean[]esPrimo) {
		//Inicializar bucle de criba de Erat�stenes
		for (int i=2; i<Math.sqrt(esPrimo.length); i++) {
			if (esPrimo[i]) {
				// Eliminar los m�ltiplos de i
				for ( int j=2*i; j<(esPrimo.length); j+=i) {
				esPrimo[j] = false;
				
			}
				}
			}
		return esPrimo;
			
		
	}
				
	/**
	 * M�todo que devuelve el total de true en un array de booleanos
	 * @param esPrimo es un array de boolean donde los primos son true
	 * @return un entero con el numero de primos que hay en el array
	 */
	public int cuentaPrimos(boolean[] esPrimo) {
			//Variable cuenta para contar el total de true 
			int cuenta = 0;
			//Bucle que recorre el array de booleanos y cuenta el n�mero de true
			for (int i=0; i<esPrimo.length; i++) {
				if (esPrimo[i]) {
				cuenta++;
			}
			}
			return cuenta;}
	
	/**
	 * M�todo que convierte el array de booleanos de numeros primos en un array de numeros enteros
	 * @param primos es un array de enteros igual al tama�o del n�mero de true en esPrimo
	 * @param esPrimo es un array de boolean donde los primos son true
	 * @return primos con todas sus posiciones convertidas en primos ordenados num�ricamente
	 */
	public int[] arrayDePrimos(int[] primos, boolean[] esPrimo) {
				//Variable contador para contar la cantidad de true
				int contador=0;
				//Bucle que recorre el array de booleanos de primos y lo convierte en un array de enteros
				for (int i=0; i<esPrimo.length; i++) {
						if (esPrimo[i]) {
							primos[contador] = i;
							contador++;
							}
					}
				return primos;
		
	}
	/**
	* M�todo para generar n�meros primos de 1 a max
	* @param max es el valor m�ximo
	* @return Vector de n�meros primos
	*/
	public int[] generarPrimos (int max) {
		if (max >= 2) {
			// Declaraciones
			max++;
			// Generar array de booleanos
			boolean[] esPrimo = new boolean[max];
			
			// Inicializar el array de primos
			for (int i=2; i<max; i++) {
				esPrimo[i] = true;}
			criba(esPrimo);
			// Generar array de enteros con los n�meros primos
			int[]primos=new int[cuentaPrimos(esPrimo)];
			primos=arrayDePrimos(primos,esPrimo);
			return primos;}
			else {
				return new int [0];
			}
	}
}
			

