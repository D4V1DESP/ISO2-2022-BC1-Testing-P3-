package es.uclm.esi.iso2.bc01.testingP3;

import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.InputMismatchException;


public class Problema3Test {
	final static Scanner sc = new Scanner(System.in);
	
	String cConfort = "Cuenta Confort";
	String nCuenta = "No existe cuenta para este tipo de cliente";
	String cVamos = "Cuenta Vamos que tu puedes";
	String cSalta = "Cuenta Saltando del Nido";
	String cAhorra = "Cuenta Ahorra ahora que puedes";
	String cIndep = "Cuenta Independizate que va siendo hora";
	String cAdulta = "Cuenta Bien"
			+ "venido a la Vida Adulta";
	
	@Test(expected = Exception.class)
	public void comprobarConstructor() {
		try {
			cliente c1 = new cliente(-10, false, false);
			cliente c2 = new cliente(140, false, false);
			//cliente c3 = new cliente(sc.nextInt(), false, false);
			
			
		}catch(InputMismatchException e) {
			
		}
	}
	
	
	@Test
	public void comprobarCuentaTest(){
		
		assertEquals("Cuenta Confort", problema3.comprobarCuenta(new cliente(12, true, true)));
		assertEquals(cVamos, problema3.comprobarCuenta(new cliente(12, true, false)));
		assertEquals(nCuenta, problema3.comprobarCuenta(new cliente(12, false, true)));
		assertEquals(nCuenta, problema3.comprobarCuenta(new cliente(12, false, false)));
		
		assertEquals(nCuenta, problema3.comprobarCuenta(new cliente(18, true, true)));
		assertEquals(cVamos, problema3.comprobarCuenta(new cliente(18, true, false)));
		assertEquals(cAhorra, problema3.comprobarCuenta(new cliente(18, false, true)));
		assertEquals(cSalta, problema3.comprobarCuenta(new cliente(18, false, false)));
		
		assertEquals(nCuenta, problema3.comprobarCuenta(new cliente(30, true, false)));
		assertEquals(nCuenta, problema3.comprobarCuenta(new cliente(30, true, false)));
		assertEquals(cIndep, problema3.comprobarCuenta(new cliente(30, false, true)));
		assertEquals(cAdulta, problema3.comprobarCuenta(new cliente(30, false, false)));
	} 
}







