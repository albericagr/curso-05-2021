package org.gobcan.dgtpc.prueba20210519;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prueba20210519 {
	
	public static final Logger logger = Logger.getLogger("org.gobcan.dgtpc.prueba20210519.Prueba20210519");

	public static int suma (int numero1, int numero2) {
		return numero1 + numero2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "Hola mundo");
		logger.log(Level.INFO, "La suma del 10 con el 35 es {0} ", suma(10,35) );
	}

}
