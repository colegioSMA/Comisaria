package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;

public class Test {
	Persona persona = null;
	Persona persona1 = null;
	Persona persona2 = null;
	Policia policia = null;
	Policia policia1 = null;
	Policia policia2 = null;
	Comisaria comisaria = null;
	Comisaria comisaria1 = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		persona = new Persona("Juan", 18, "calle Aguacate");
		persona1 = new Persona("Carlos", 20, "calle Albox");
		persona2 = new Persona("David", 16, "Agua");
		policia = new Policia("Jorge", "calle Abril");
		policia1 = new Policia("Jesus", "calle Alcala");
		policia2 = new Policia("Jose", "calle Sol");
		Policia[] policiaSuperior = { policia, policia1, policia2 };
		Policia[] policiaInferior = { policia, policia1 };
		Persona[] personaInferior = { persona, persona1 };
		Persona[] personaSyperior = { persona, persona1, persona2 };
		comisaria = new Comisaria(policiaSuperior, personaInferior);
		comisaria1 = new Comisaria(policiaInferior, personaSyperior);
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void isMayorEdadTest() {
		Assert.assertTrue(persona1.isMayorEdad());
		Assert.assertFalse(persona2.isMayorEdad());
	}

	@org.junit.Test
	public void contieneCalle() {
		Assert.assertTrue(persona.contieneCalle());
		Assert.assertFalse(persona2.contieneCalle());
	}

	@org.junit.Test
	public void hayMasPersonasDetenidasQuePoliciasTest() {
		Assert.assertTrue(comisaria1.hayMasPersonasDetenidasQuePolicias());
		Assert.assertFalse(comisaria.hayMasPersonasDetenidasQuePolicias());
	}

	@org.junit.Test
	public void addPoliciaTest() {
		Policia policia5 = new Policia("Jose", "calle Sol");
		Policia[] policiaAux = { policia5, null };
		Persona[] personaInferior1 = { persona, persona1 };
		Comisaria comisaria5 = new Comisaria(policiaAux, personaInferior1);
		comisaria5.addPolicia(policia5);
		Assert.assertNotNull(comisaria5);
	}

	@org.junit.Test(expected = Exception.class)
	public void setIdentificador() throws IllegalArgumentException {
		Persona persona7 = new Persona("Carlos", 20, "calle Albox");
		persona7.setIdentificador(-1);
	}

	@org.junit.Test
	public void addDetenidoTest() {
		Persona persona5 = new Persona("Jose", 19, "calle Sol");
		Persona[] personaAux = { persona, null };
		Policia[] policiaInferior = { policia, policia1 };
		Comisaria comisaria6 = new Comisaria(policiaInferior, personaAux);
		comisaria6.addDetenido(persona5);
		Assert.assertNotNull(comisaria6);
	}
}
