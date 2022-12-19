package es.uclm.esi.iso2.bc01.testingP3;
public class problema3 {
	//Si estudia es false, se supone que esta trabajando.
	public static String comprobarCuenta(cliente cliente) {
		if (cliente.getEdad()<18 && cliente.isEstudia() && cliente.isViveConPadres()) {
			return "Cuenta Confort";			
		}
		else if (cliente.getEdad()<25 && cliente.isEstudia() && !cliente.isViveConPadres()) {
			return "Cuenta Vamos que tu puedes";
		}
		else if (!(cliente.getEdad()<25) && !cliente.isEstudia() && cliente.isViveConPadres()) {
			return "Cuenta Independizate que va siendo hora";
		}
		else if (!(cliente.getEdad()<25) && !cliente.isEstudia() && !cliente.isViveConPadres()) {
			return "Cuenta Bienvenido a la Vida Adulta";
		}
		else if (!(cliente.getEdad()<18) && !cliente.isEstudia() && cliente.isViveConPadres()) {
			return "Cuenta Ahorra ahora que puedes";
		}
		else if (!(cliente.getEdad()<18) && !cliente.isEstudia() && !cliente.isViveConPadres()) {
			return "Cuenta Saltando del Nido";
		}
		else return "No existe cuenta para este tipo de cliente";
	} 
}

