package test;
/**
 * @author jx-m
 *
 */
import org.junit.Before;
import org.junit.Test;
import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;
import static org.junit.Assert.*;
	
	Policia[] policia = null;
	Persona[] persona = null;
	
	Comisaria comisaria = null;

	@Before
	public void setUp() throws Exception{
		
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
		persona2[3] = new Persona("José", 40, "calle Direccion_1_CP");
		persona2[3].setIdentificador(4);
		persona2[4] = new Persona("Antonio", 14, "calle Direccion_2_CP");
		persona2[4].setIdentificador(5);
		persona2[5] = new Persona("Paco", 40, "calle Direccion_3_CP");
		persona2[5].setIdentificador(6);
		
		comisaria.addDetenido(new Persona("José", 40, "calle Direccion_1_CP"));
		comisaria.addDetenido(new Persona("Antonio", 14, "calle Direccion_2_CP"));
		comisaria.addDetenido(new Persona("Paco", 40, "calle Direccion_3_CP"));
		
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
		policia2[3] = new Policia("José", "calle Direccion_1_CP");
		policia2[3].setIdentificador(4);
		policia2[4] = new Policia("Antonio", "calle Direccion_2_CP");
		policia2[4].setIdentificador(5);
		policia2[5] = new Policia("Paco", "calle Direccion_3_CP");
		policia2[5].setIdentificador(6);

		
		comisaria.addPolicia(new Policia("Manuel", "calle Direccion_1_CP"));
		comisaria.addPolicia(new Policia("Antonio", "calle Direccion_2_CP"));
		comisaria.addPolicia(new Policia("Paco", "calle Direccion_3_CP"));
		
		assertArrayEquals(policia2, comisaria.getPolicias());	
		assertNotNull(comisaria.getPolicias()[4]);	
		assertNull(comisaria.getPolicias()[2]);
		
	}

}
