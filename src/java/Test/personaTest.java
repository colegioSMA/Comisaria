package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import comisaria.Persona;

public class personaTest{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void pruebaExcepcion() {
		Persona p1=new Persona("Sergio",24,"calle Leganes");
		boolean excepcion=false;
		try {
			p1.setIdentificador(-9);
		}catch(IllegalArgumentException e){
			excepcion=true;
		}
		assertTrue(excepcion);
	}
	@Test 
	public void puebaEdad() {
		Persona p1=new Persona("Sergio",24,"calle Leganes");
		assertTrue(p1.isMayorEdad());
	}
	
	@Test
	public void pruebaCalle() {
		Persona p1=new Persona("Sergio",24,"calle Leganes");
		assertTrue(p1.contieneCalle());
	}
	
}
