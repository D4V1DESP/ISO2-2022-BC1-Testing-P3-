package es.uclm.esi.iso2.bc01.testingP3;
import java.util.*;

public class cliente {
	private int edad;
	private boolean estudia;
	private boolean viveConPadres;
	
	public cliente(int edad, boolean estudia, boolean viveConPadres) {
		this.setEdad(edad);
		this.setEstudia(estudia);
		this.setViveConPadres(viveConPadres);
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		try {
			if (edad>=0 && edad<=130) {
				this.edad = edad;
			}
			else
				throw new Exception("La edad introducida no es valida, debe estar entre 0 y 130.");
		}
		catch (InputMismatchException e) {
			System.out.println("Por favor, introduzca un n�mero comprendido entre 0 y 130.");
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
