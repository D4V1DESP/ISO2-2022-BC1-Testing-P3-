package es.uclm.esi.iso2.bc01.testingP3;

import java.util.InputMismatchException;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;


public class Problema3Test {
	final static Scanner sc = new Scanner(System.in);
	
	String cConfort = "Cuenta Confort";
	String nCuenta = "No existe cuenta para este tipo de cliente";
	String cVamos = "Cuenta Vamos que tu puedes";
	String cSalta = "Cuenta Saltando del Nido";
	String cAhorra = "Cuenta Ahorra ahora que puedes";
	String cIndep = "Cuenta Independizate que va siendo hora";
	String cAdulta = "Cuenta Bienvenido a la Vida Adulta";
	
	@Test
	public void comprobarConstructor() throws InputMismatchException{
		new Cliente(-10, false, false);
		new Cliente(140, false, false);
		//new Cliente(sc.nextInt(), false, false);
	}
	
	
	@Test
	public void comprobarCuentaTestCondiciones() {
		
		assertEquals(cConfort, Problema3_Metodos.comprobarCuenta(new Cliente(15, true, true)));
		assertEquals(cVamos, Problema3_Metodos.comprobarCuenta(new Cliente(15, true, false)));
		
		assertEquals(cVamos, Problema3_Metodos.comprobarCuenta(new Cliente(21, true, false)));
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(21, true, true)));
		
		assertEquals(cSalta, Problema3_Metodos.comprobarCuenta(new Cliente(19, false, false)));
		assertEquals(cAhorra, Problema3_Metodos.comprobarCuenta(new Cliente(19, false, true)));
		
		assertEquals(cAdulta, Problema3_Metodos.comprobarCuenta(new Cliente(30, false, false)));
		assertEquals(cIndep, Problema3_Metodos.comprobarCuenta(new Cliente(30, false, true)));
	}
	
	@Test
	public void comprobarCuentaTestCondicionesDecisiones() {
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(21, true, true)));
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(15, false, true)));
		assertEquals(cVamos, Problema3_Metodos.comprobarCuenta(new Cliente(15, true, false)));
		assertEquals(cConfort, Problema3_Metodos.comprobarCuenta(new Cliente(15, true, true)));
		
		assertEquals(cVamos, Problema3_Metodos.comprobarCuenta(new Cliente(21, true, false)));
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(28, true, false)));
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(28, true, false)));
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(28, true, true)));
		
		assertEquals(cSalta, Problema3_Metodos.comprobarCuenta(new Cliente(19, false, false)));
		assertEquals(cAhorra, Problema3_Metodos.comprobarCuenta(new Cliente(19, false, true)));
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(19, true, true)));
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(15, false, true)));
		
		assertEquals(cVamos, Problema3_Metodos.comprobarCuenta(new Cliente(19, true, false)));
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(16, false, false)));
		
		assertEquals(cAdulta, Problema3_Metodos.comprobarCuenta(new Cliente(30, false, false)));
		assertEquals(cIndep, Problema3_Metodos.comprobarCuenta(new Cliente(30, false, true)));
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(30, true, true)));
		assertEquals(cAhorra, Problema3_Metodos.comprobarCuenta(new Cliente(21, false, true)));
		
		assertEquals(nCuenta, Problema3_Metodos.comprobarCuenta(new Cliente(30, true, false)));
		assertEquals(cSalta, Problema3_Metodos.comprobarCuenta(new Cliente(21, false, false)));
	}
}







