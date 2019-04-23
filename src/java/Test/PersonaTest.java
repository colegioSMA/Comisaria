package Test;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import comisaria.Persona;

public class PersonaTest {
	
	Persona persona=null;

	@Before
	public void setUp() throws Exception {
		persona=new Persona("Candi",19,"calle/");
	}

	@Test
	public void setIdentificadorTest()  {
		
		boolean seHaLanzado=false;
		
		try {
			persona.setIdentificador(-4);
		} catch (IllegalArgumentException e) {
			seHaLanzado=true;
		}
		
		assertTrue(seHaLanzado);
	}	
	
	@Test
	public void isMayorEdadTest() {		
		assertTrue(persona.isMayorEdad());
	}
	
	@Test
	public void contieneCalleTest() {
		assertTrue(persona.contieneCalle());
	}
	


}
