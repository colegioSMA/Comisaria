package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;
import junit.framework.Assert;

public class Test {
	Persona vasco = null;
	Persona vasco1 = null;
	Persona vasco2 = null;
	Comisaria comisaria = null;
	Comisaria comisaria1 = null;
	Policia pasma = null;
	Policia pasma1 = null;
	Policia pasma2 = null;

	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		vasco = new Persona("Jimmy", 19, "calle Neptuno");
		vasco1 = new Persona("Pepe", 26, "calle Urano");
		vasco2 = new Persona("Mariano", 11, "Jupiter");
		pasma = new Policia("Ruben", "calle Venus");
		pasma1 = new Policia("Jose", "calle Marte");
		pasma2 = new Policia("Judas", "calle Pluton");
		Policia[] policiaSuperior = { pasma, pasma1, pasma2 };
		Policia[] policiaInferior = { pasma, pasma1 };
		Persona[] personaInferior = { vasco, vasco1 };
		Persona[] personaSyperior = { vasco, vasco1, vasco2 };
		comisaria = new Comisaria(policiaSuperior, personaInferior);
		comisaria1 = new Comisaria(policiaInferior, personaSyperior);
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}
	@org.junit.Test
	public void hayMasPersonasDetenidasQuePoliciasTest() {
		Assert.assertTrue(comisaria1.hayMasPersonasDetenidasQuePolicias());
		Assert.assertFalse(comisaria.hayMasPersonasDetenidasQuePolicias());
	}
	@org.junit.Test
	public void isMayorEdadTest() {
		Assert.assertTrue(vasco1.isMayorEdad());
		Assert.assertFalse(vasco2.isMayorEdad());
	}
	
	@org.junit.Test (expected = Exception.class)
	public void setIdentificador() throws IllegalArgumentException{
		Persona persona7 = new Persona("Pepe", 26, "calle Urano");
		persona7.setIdentificador(-1);
	}

	
	@org.junit.Test
	public void contieneCalle() {
		Assert.assertTrue(vasco.contieneCalle());
		Assert.assertFalse(vasco2.contieneCalle());
	}



}
