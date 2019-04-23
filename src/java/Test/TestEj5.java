package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import comisaria.Persona;

public class TestEj5 {

	@Test
	public void testEj5() {
		Persona p = new Persona("Jose", 19, "Plaza de la Rosa");
		
		boolean test = p.contieneCalle();
		
		assertEquals(false, test);
	}

}
