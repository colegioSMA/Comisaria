package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import comisaria.Persona;

public class TestEj4 {

	@Test
	public void testEj4() {
		Persona p = new Persona("Juan", 8, "L�pez");
		
		boolean test = p.isMayorEdad();
		
		assertEquals(false, test);
	}

}
