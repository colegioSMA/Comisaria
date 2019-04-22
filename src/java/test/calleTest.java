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

public class calleTest {
	
	Persona persona =  null;
	Persona persona3 = null;

	@Before
	public void setUp() throws Exception {
		
		persona = new Persona("José", 40, "calle Direccion_1_CP");
		persona3 = new Persona("Paco", 40, "Calle Direccion_3_CP");
		
	}

	@Test
	public void contieneTest() {
		
		assertTrue(persona.contieneCalle());
		
	}
	
	@Test
	public void noContieneTest() {
		
		assertFalse(persona3.contieneCalle());
		
	}

}
