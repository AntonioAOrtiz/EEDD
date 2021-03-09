
package com.mycompany.criba;
/**
* Clase para generar todos los n�meros primos de 1 hasta
* un n�mero m�ximo especificado por el usuario. Como
* algoritmo se utiliza la criba de Erat�stenes.
* <p>
* Erat�stenes de Cirene (276 a.C., Cirene, Libia � 194
* a.C., Alejandr�a, Egipto) fue el primer hombre que
* calcul� la circunferencia de la Tierra. Tambi�n
* se le conoce por su trabajo con calendarios que ya
* inclu�an a�os bisiestos y por dirigir la m�tica
* biblioteca de Alejandr�a.
* <p>
* El algoritmo es bastante simple: Dado un vector de
* enteros empezando en 2, se tachan todos los m�ltiplos
* de 2. A continuaci�n, se encuentra el siguiente
* entero no tachado y se tachan todos sus m�ltiplos. El
* proceso se repite hasta que se pasa de la ra�z cuadrada
* del valor m�ximo. Todos los n�meros que queden sin
* tachar son n�meros primos.
*
* @author Fernando Berzal
* @version 1.0 Enero�2005 (FB)
*/
public class Criba {
	/**
	* Generar n�meros primos de 1 a max
	* @param max es el valor m�ximo
	* @return Vector de n�meros primos
	*/
	public boolean[] criba(boolean[]esPrimo) {
		for (int i=2; i<Math.sqrt(esPrimo.length)+1; i++) {
			if (esPrimo[i]) {
				// Eliminar los m�ltiplos de i
				for ( int j=2*i; j<(esPrimo.length)+1; j+=i) {
				esPrimo[j] = false;
				
			}
				}
			}
		return esPrimo;
			
		
	}
				
			// �Cu�ntos primos hay?
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
			// Tama�o del array
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
			

