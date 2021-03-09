
package com.mycompany.criba;
/**
* Clase para generar todos los números primos de 1 hasta
* un número máximo especificado por el usuario. Como
* algoritmo se utiliza la criba de Eratóstenes.
* <p>
* Eratóstenes de Cirene (276 a.C., Cirene, Libia – 194
* a.C., Alejandría, Egipto) fue el primer hombre que
* calculó la circunferencia de la Tierra. También
* se le conoce por su trabajo con calendarios que ya
* incluían años bisiestos y por dirigir la mítica
* biblioteca de Alejandría.
* <p>
* El algoritmo es bastante simple: Dado un vector de
* enteros empezando en 2, se tachan todos los múltiplos
* de 2. A continuación, se encuentra el siguiente
* entero no tachado y se tachan todos sus múltiplos. El
* proceso se repite hasta que se pasa de la raíz cuadrada
* del valor máximo. Todos los números que queden sin
* tachar son números primos.
*
* @author Fernando Berzal
* @version 1.0 Enero’2005 (FB)
*/
public class Criba {
	/**
	* Generar números primos de 1 a max
	* @param max es el valor máximo
	* @return Vector de números primos
	*/
	public boolean[] criba(boolean[]esPrimo) {
		for (int i=2; i<Math.sqrt(esPrimo.length)+1; i++) {
			if (esPrimo[i]) {
				// Eliminar los múltiplos de i
				for ( int j=2*i; j<(esPrimo.length)+1; j+=i) {
				esPrimo[j] = false;
				
			}
				}
			}
		return esPrimo;
			
		
	}
				
			// ¿Cuántos primos hay?
	public int cuentaPrimos(boolean[] esPrimo) {
			int cuenta = 0;
			for (int i=0; i<esPrimo.length; i++) {
				if (esPrimo[i]) {
				cuenta++;
			}
			}
			return cuenta;}
			
	public int[] arrayDePrimos(int[] primos, boolean[] esPrimo) {
				int contador=0;
				for (int i=0; i<esPrimo.length; i++) {
						if (esPrimo[i]) {
							primos[contador] = i;
							contador++;
							}
					}
				return primos;
		
	}
	
	public int[] generarPrimos (int max) {
		if (max >= 2) {
			// Declaraciones
			max++; 
			// Tamaño del array
			boolean[] esPrimo = new boolean[max];
			
			// Inicializar el array
			for (int i=2; i<max; i++) {
				esPrimo[i] = true;}
			criba(esPrimo);
			int[]primos=new int[cuentaPrimos(esPrimo)];
			primos=arrayDePrimos(primos,esPrimo);
			return primos;}
			else {
				return new int [0];
			}
	}
}
			

