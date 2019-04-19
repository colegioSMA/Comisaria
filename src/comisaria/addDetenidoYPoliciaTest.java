package comisaria;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;

public class addDetenidoYPoliciaTest {
	
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
	public void addDetenidoTest() {
		
		Persona[] persona2 = new Persona[6];
		
		persona2[0] = null;
		persona2[1] = null;
		persona2[2] = null;
		persona2[3] = new Persona("Manuel", 19, "calle Direccion1");
		persona2[3].setIdentificador(4);
		persona2[4] = new Persona("Pedro", 18, "calle Direccion2");
		persona2[4].setIdentificador(5);
		persona2[5] = new Persona("Miguel", 35, "calle Direccion3");
		persona2[5].setIdentificador(6);
		
		comisaria.addDetenido(new Persona("Manuel", 19, "calle Direccion1"));
		comisaria.addDetenido(new Persona("Pedro", 18, "calle Direccion2"));
		comisaria.addDetenido(new Persona("Miguel", 35, "calle Direccion3"));
		
		assertArrayEquals(persona2, comisaria.getPersonasDetenidas());
		
		assertNotNull(comisaria.getPersonasDetenidas()[4]);
		
		assertNull(comisaria.getPersonasDetenidas()[2]);
		
	}
	
	@Test
	public void addPoliciaTest() {
		
		Policia[] policia2 = new Policia[6];
		
		policia2[0] = null;
		policia2[1] = null;
		policia2[2] = null;
		policia2[3] = new Policia("Manuel", "calle Direccion1");
		policia2[3].setIdentificador(4);
		policia2[4] = new Policia("Pedro", "calle Direccion2");
		policia2[4].setIdentificador(5);
		policia2[5] = new Policia("Miguel", "calle Direccion3");
		policia2[5].setIdentificador(6);

		
		comisaria.addPolicia(new Policia("Manuel", "calle Direccion1"));
		comisaria.addPolicia(new Policia("Pedro", "calle Direccion2"));
		comisaria.addPolicia(new Policia("Miguel", "calle Direccion3"));
		
		assertArrayEquals(policia2, comisaria.getPolicias());
		
		assertNotNull(comisaria.getPolicias()[4]);
		
		assertNull(comisaria.getPolicias()[2]);
		
	}

}
