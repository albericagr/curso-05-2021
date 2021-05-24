package org.gobcan.dgtpc.prueba20210519;

public class Operaciones {
    public static int resta(int a, int b) {
        return a-b;
    }
    
    public static int multiplicacion(int a, int b) {
        return a*b;
    }
    
    public static int division(int a, int b) {
    	try {
    		return a/b;
    	} catch (ArithmeticException e){
    		return 0;
    	}
    }   	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		System.out.println(" La suma del 10 con el 35 es" + resta(10,35));
	}

}
