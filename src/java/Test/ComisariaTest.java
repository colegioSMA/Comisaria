package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;

public class ComisariaTest {
 Policia poli=null;
 Persona ladron=null;
 Comisaria c1=null;
	
	
	@Before
	public void setUp() throws Exception {
		Policia poli= new Policia("Alfredo", "Madrid");
		Policia[] policias= {poli};
		Persona ladron=new Persona("Juan",40, "Calle Madrid");
		Persona[] personasDetenidas= {ladron};
		Comisaria c1=new Comisaria(policias, personasDetenidas);
		c1.addPolicia(poli);
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void addPoliciaTest() {
		assertNotNull(c1.getPolicias());
	}
	public void addDetenidoTest() {
		assertNotNull(c1.getPersonasDetenidas());
	}
	
	public void hayMasPersonasDetenidasQuePoliciasTest() {
		assertFalse(c1.hayMasPersonasDetenidasQuePolicias());
		
	}
}
