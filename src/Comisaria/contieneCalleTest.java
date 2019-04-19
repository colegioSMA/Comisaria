package Comisaria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Comisaria.Persona;

public class contieneCalleTest {
	
	Persona persona =  null;
	Persona persona3 = null;

	@Before
	public void setUp() throws Exception {
		
		persona = new Persona("Manuel", 19, "calle Direccion1");
		persona3 = new Persona("Manuel", 19, "Calle Direccion3");
		
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
