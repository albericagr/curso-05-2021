package org.gobcan.dgtpc.prueba20210519;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.Test;

public class Prueba20210519Test {
	
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
		
    @Test
    public void pruebaDeSuma1Test()
    {
        assertEquals("La suma ha dejado de ser correcta", 20, Prueba20210519.suma(10, 10));
    }
    
    @Test
    public void pruebaDeSuma2Test()
    {
        assertNotEquals("La suma ha dejado de ser correcta", 10000, Prueba20210519.suma(100, 100));
        assertEquals("La suma ha dejado de ser correcta", 1100, Prueba20210519.suma(100, 1000));
    }	     
    @Test
    public void pruebaDeSuma3Test()
    {
        assertEquals("La suma ha dejado de ser correcta", 4, Prueba20210519.suma(2, 2));
    }  
}
