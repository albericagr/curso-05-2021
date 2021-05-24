package org.gobcan.dgtpc.prueba20210519;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OperacionesTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
       
    @Test
    public void pruebaDeResta1Test()
    {
        assertEquals("La resta ha dejado de ser correcta", 0, Operaciones.resta(10, 10));
    }
    
    @Test
    public void pruebaDeResta2Test()
    {
        assertNotEquals("La resta ha dejado de ser correcta", 8, Operaciones.resta(100, 100));
        assertEquals("La resta ha dejado de ser correcta", -900, Operaciones.resta(100, 1000));
    }
    
    @Test
    public void pruebaDeMultiplicacion1Test()
    {
        assertEquals("La multiplicación ha dejado de ser correcta", 4, Operaciones.multiplicacion(2, 2));
        assertEquals("La multiplicación ha dejado de ser correcta", 100, Operaciones.multiplicacion(10, 10));
    }        

    @Test
    public void pruebaDeDivision3Test()
    {
   		assertEquals("La division ha dejado de ser correcta", 1, Operaciones.division(2, 2));
    }      
    
    @Test
    public void pruebaDeDivision4Test()
    {
   		assertEquals("La division ha dejado de ser correcta", 0, Operaciones.division(100, 0));
    }    
}