package es.unavarra.gpi2;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
    
{

	@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void palabraConsola(){
		String comprobar="hola";
		GPIA116171 clase = new GPIA116171();
		String lectura = clase.getter();
		assertTrue(lectura.equals(comprobar));
	}
}
