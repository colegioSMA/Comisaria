package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;

public class TestPersona{
	
	Persona p = null;
	Persona p1 = null;
	Persona p2 = null;
	
	Comisaria com = null;
	Comisaria com1 = null;
	
	Policia pol = null;
	Policia pol1 = null;
	Policia pol2 = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		p = new Persona("Manuel", 21, "calle Camilo Jose Cela");
		p1 = new Persona("Ruben", 30, "calle Primo de Rivera");
		p2 = new Persona("Jose", 29, "calle Paco de Lucas");
		pol = new Policia("Jaime", "calle Santo Esteban");
		pol1 = new Policia("Raul", "calle Benito Sanchez");
		pol2 = new Policia("Alberto", "calle Jose de Juan");
		
		Policia[] policiaRangoAlto = { pol, pol1, pol2 };
		Policia[] policiaRangoBajo = { pol, pol1 };
		Persona[] personaNormal = { p, p1 };
		Persona[] personaImportante = { p, p1, p2 };
		
		com = new Comisaria(policiaRangoAlto, personaNormal);
		com1 = new Comisaria(policiaRangoBajo, personaImportante);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test (expected = Exception.class)
	public void setIdentificador() throws IllegalArgumentException{
		Persona p7 = new Persona("Ruben", 30, "calle Primo de Rivera");
		p7.setIdentificador(-1);
	}
	
	@Test
	public void addDetencionTest() {
		Persona p5 = new Persona("Alberto", 22, "calle Jose de Juan");
		Persona[] pAux = {p, null};
		Policia[] policiaRangoBajo = { pol, pol1 };
		Comisaria com6 = new Comisaria(policiaRangoBajo, pAux);
		com6.addDetenido(p5);
		Assert.assertNotNull(com6);
	}
	
	@Test
	public void addPolTest() {
		Policia policia5 = new Policia("Alberto", "calle Jose de Juan");
		Policia[] polAux = {policia5, null};
		Persona[] personaInferior1 = { p, p1 };
		Comisaria com5 = new Comisaria(polAux, personaInferior1);
		com5.addPolicia(pol5);
		Assert.assertNotNull(com5);
	}
	
	@Test
	public void comprobarEdadTest() {
		Assert.assertTrue(p1.comprobarEdad());
		Assert.assertFalse(p2.comprobarEdad());
	}

	@Test
	public void verificarCalle() {
		Assert.assertTrue(p.verificarCalle());
		Assert.assertFalse(p2.verificarCalle());
	}

	@Test
	public void detencionesVSpoliciasTest() {
		Assert.assertTrue(com1.detencionesVSpolicias());
		Assert.assertFalse(com.detencionesVSpolicias());
	}

}
