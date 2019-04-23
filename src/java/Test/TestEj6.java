package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;

public class TestEj6 {

	@Test
	public void testEj6_1() {
		
		Persona p = new Persona("Luis", 45,"Calle de la rosa");
		
		Persona[] test = new Persona[1];
		test[0]=p;
		
		Comisaria.addDetenido(p);
	
		
	//assertArrayEquals(test[0], Comisaria.personasDetenidas[0]);	
	assertNotNull(Comisaria.personasDetenidas);
	}

}
