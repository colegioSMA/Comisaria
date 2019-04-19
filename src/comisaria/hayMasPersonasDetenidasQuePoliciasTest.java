package comisaria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;

public class hayMasPersonasDetenidasQuePoliciasTest {
	
	Policia[] policia = null;
	Persona[] persona = null;
	
	Comisaria comisaria = null;

	@Before
	public void setUp() throws Exception {
		
		policia = new Policia[3];
		persona = new Persona[3];
		
		comisaria = new Comisaria(policia, persona);
		
	}

	@Test
	public void test1() {

		comisaria.addDetenido(new Persona("Manuel", 19, "calle Direccion1"));
		comisaria.addDetenido(new Persona("Pedro", 16, "calle Direccion2"));
		comisaria.addDetenido(new Persona("Miguel", 35, "calle Direccion3"));
		
		comisaria.addPolicia(new Policia("Manuel", "calle Direccion1"));
		comisaria.addPolicia(new Policia("Pedro", "calle Direccion2"));
		//comisaria.addPolicia(new Policia("Miguel", "calle Direccion3"));
		
		assertTrue(comisaria.hayMasPersonasDetenidasQuePolicias());
		
	}
	
	//Ya estan todos y este es para producir un cambio que pueda subir al repositorio

	@Test
	public void test2() {

		comisaria.addDetenido(new Persona("Manuel", 19, "calle Direccion1"));
		comisaria.addDetenido(new Persona("Pedro", 16, "calle Direccion2"));
		//comisaria.addDetenido(new Persona("Miguel", 35, "calle Direccion3"));
		
		comisaria.addPolicia(new Policia("Manuel", "calle Direccion1"));
		comisaria.addPolicia(new Policia("Pedro", "calle Direccion2"));
		comisaria.addPolicia(new Policia("Miguel", "calle Direccion3"));
		
		assertFalse(comisaria.hayMasPersonasDetenidasQuePolicias());
		
	}
}
