package test;
/**
 * @author jx-m
 *
 */
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import comisaria.Persona;

public class mayorEdadTest {

	Persona persona  =  null;
	Persona persona2 = null;
	
	@Before
	public void setUp() throws Exception {
		
		persona = new Persona("Jose", 40, "calle Direccion_1_CP");
		persona2 = new Persona("Antonio", 14, "calle Direccion_2_CP");
			
	}

	@Test
	public void mayorTest() {
		
		assertTrue(comisaria.Persona.isMayorEdad());
		
	}
	
	@Test
	public void menorTest() {
			
		assertFalse(Persona.isMayorEdad());
		
	}

}
