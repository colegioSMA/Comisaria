package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;

public class TestEj7 {

	@Test
	public void testEj7() {
		
		Persona p = new Persona("Juan",44,"Calle dominguez");
		Persona p1 = new Persona("Raúl", 53, "Plaza de arguelles");
		Policia po = new Policia("David","Calle Lopez");
		
		Comisaria.addDetenido(p);
		Comisaria.addDetenido(p1);
		
		Comisaria.addPolicia(po);
		
		
		boolean test = Comisaria.hayMasPersonasDetenidasQuePolicias();
		
		assertEquals(true, test);
	}

}
