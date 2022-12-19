package es.uclm.esi.iso2.bc01.testingP3;
import java.util.*;

public class Cliente {
	private int Edad;
	private boolean estudia;
	private boolean viveConPadres;
	
	public Cliente(int edad, boolean estudia, boolean viveConPadres){
		try {
			this.setEdad(edad);
		}catch(digitoException e) {
		
		}
		
		this.setEstudia(estudia);
		this.setViveConPadres(viveConPadres);	
	}
	
	public int getEdad() {
		return this.Edad;
	}
	public void setEdad(int edad) throws digitoException, InputMismatchException{
		try {
			if (edad>=0 && edad<=130) {
				this.Edad = edad;
			}
			else
				throw new digitoException("La edad introducida no es valida, debe estar entre 0 y 130.");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean isEstudia() {
		return estudia;
	}
	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}
	public boolean isViveConPadres() {
		return viveConPadres;
	}
	public void setViveConPadres(boolean viveConPadres) {
		this.viveConPadres = viveConPadres;
	}
	
	

}
