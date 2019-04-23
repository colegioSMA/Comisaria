package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import comisaria.Persona;

public class TestEj3 {

	@Test(expected=IllegalArgumentException.class)
	public void testej3() {
		Persona p = new Persona("Juan", 36, "Plaza Coimbra");
			
		p.setIdentificador(-4);
		
	}

}
