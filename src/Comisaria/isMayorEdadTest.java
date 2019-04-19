package Comisaria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Comisaria.Persona;

public class isMayorEdadTest {

	Persona persona =  null;
	Persona persona2 = null;
	
	@Before
	public void setUp() throws Exception {
		
		persona = new Persona("Manuel", 19, "calle Direccion1");
		persona2 = new Persona("Manuel", 16, "calle Direccion2");
		
		
	}

	@Test
	public void mayorTest() {
		
		assertTrue(persona.isMayorEdad());
		
	}
	
	@Test
	public void menorTest() {
			
		assertFalse(persona2.isMayorEdad());
		
	}
	



}
