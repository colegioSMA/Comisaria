package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;
	
public class pruebasComisaria {
	Policia[] polis= {new Policia("Juan", "Calle 12 de octubre")};
	Persona [] personas= {new Persona("Pedro", 31, "Aguacte")};
	Comisaria comisaria;
	
	@Before
	public void test() {
	 comisaria = new Comisaria(polis, personas);
	}
	@Test
	public void addDetenido() {
		Persona[] detenido = {new Persona("Adrian",21, "Calle torredolones"),new Persona("Serigo", 19,"Zarapitos"), new Persona("Victor",37, "Alonso Martinez")};
		comisaria.setPersonasDetenidas(detenido);
		comisaria.addDetenido(new Persona("Rodrigo", 41, "av. de los poblados"));
		detenido = comisaria.getPersonasDetenidas();
		assertNotNull(comisaria.getPersonasDetenidas());
		assertArrayEquals(detenido, comisaria.getPersonasDetenidas());
	}
	
	@Test
	public void addPolicia() {
		Policia[] poli = {new Policia("Adrian", "Calle torredolones"),new Policia("Serigo", "Zarapitos"), new Policia("Victor", "Alonso Martinez")};
		comisaria.setPolicias(poli);
		comisaria.addPolicia(new Policia("Manolo", "calle blason"));
		poli = comisaria.getPolicias();
		assertNotNull(comisaria.getPolicias());
		assertArrayEquals(poli, comisaria.getPolicias());
	}
	
	@Test 
	public void hayMasPersonasDetenidasQuePolicias() {
		assertFalse(comisaria.hayMasPersonasDetenidasQuePolicias());
	}
	
}
