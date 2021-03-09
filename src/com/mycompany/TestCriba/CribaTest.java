package com.mycompany.TestCriba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.mycompany.criba.Criba;

public class CribaTest {
	/**
	 * Test para el método cuentaPrimos de la clase Criba.
	 */
	@Test
	public void testCuentaPrimos() {
		Criba testCriba=new Criba();
		boolean[] caso={false,true,false,true,false,true,false,false};
		int resultado=testCriba.cuentaPrimos(caso);
	    int expResult=3;
		assertEquals(resultado,expResult);
	}
	/**
	 * Test para el método arrayDePrimos de la clase Criba.
	 */
	@Test
	public void testArrayDePrimos() {
		Criba testCriba=new Criba();
		boolean[] caso={false,false,true,true,false,true,false,true,false,false,false};
		int [] resultado= new int[4];
		resultado=testCriba.arrayDePrimos(resultado,caso);
	    int [] expResult={2,3,5,7};
		assertArrayEquals(resultado,expResult);
	}
	/**
	 * Test para el método criba de la clase Criba.
	 */
	@ParameterizedTest
	@CsvSource({"5,11","19,21"
		,"11,31","29,41","47,51","53,61"})
	public void testCriba(int posicionPrimo,int numMaximo) {
		Criba testCriba=new Criba();
		boolean[] caso=new boolean[numMaximo];
		for (int i=2; i<numMaximo; i++) {
			caso[i] = true;}
		testCriba.criba(caso);
	    boolean expResult=caso[posicionPrimo];
		assertEquals(true,expResult);
	}

/**
 * Test para el metodo GenerarPrimos de la clase Criba.
 * @param primoFinal
 * @param numeroMax
 */
	@ParameterizedTest
	@CsvSource({"0,1","5,10","17,20"
		,"23,30","31,40","43,50","53,60"})
	public void testGenerarPrimos(int primoFinal, int numeroMax) {
		Criba testCriba=new Criba();
		int[] programa=testCriba.generarPrimos(numeroMax);
		int expResult= primoFinal;
		if(expResult==0) {
			int[] expRe=new int[0];
			assertArrayEquals(expRe,programa);}
		else {
		int resultado=programa[(programa.length-2)];
		assertEquals(expResult,resultado);
		}
		}
	

}
