package testpersona;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import comisaria.Comisaria;
import comisaria.Persona;
import comisaria.Policia;

public class PersonaTest{
		
	@Test(expected=IllegalArgumentException.class)
	public void Idetificador() {
		
		Persona persona1 = new Persona("Chema", 22, "Sevilla");
				
		persona1.setIdentificador(5);
	}
	
	@Test
	public void EsmayorTest() 
	{
		Persona persona1 = new Persona("Chema", 22, "Sevilla");
		
		assertTrue(persona1.isMayorEdad());
	}
	
	@Test
	public void ContieneCalleTest() 
	{
		Persona persona1 = new Persona("Chema", 22, "Albarracin");
		
		assertNotNull(persona1.contieneCalle());
	}
	

	@Test
	public void AñadeDetenidoNotNullTest() 
	{
		Persona[] personas = new Persona[1];
		
		Persona p1 = new Persona("Chema", 22, "Albarracin");
				
		Comisaria comisaria1 = new Comisaria(null, personas);
		
		comisaria1.setPersonasDetenidas(personas);

		assertNotNull(comisaria1.getPersonasDetenidas());
	}
	
	@Test
	public void AñadePoliciaNotNullTest() 
	{
		Policia[] policias = new Policia[1];
		
		Policia po1 = new Policia("Ronaldo", "España");
		
		Comisaria comisaria1 = new Comisaria(policias, null);
		
		comisaria1.setPolicias(policias);

		assertNotNull(comisaria1.getPolicias());
	}
	
	
	@Test
	public void AñadePoliciaArrayTest() 
	{
		Policia po1 = new Policia("Ronaldo", "España");
		
		Policia[] policias = new Policia[1];
		Policia[] policiasaux = new Policia[1];
		
		policiasaux[0] = po1;
		
		
				
		Comisaria comisaria1 = new Comisaria(policias, null);
		
		policias[0] = po1;
		
			
		assertArrayEquals(policias, policiasaux);
	}
	
	@Test
	public void HayMasPersonasDetenidasQuePoliciasTest() 
	{
		Persona p1 = new Persona("Chema", 22, "Albarracin");
		Persona p2 = new Persona("Rober",25,"Madrid");
		Policia po1 = new Policia("Ronaldo", "España");
		Policia po2 = new Policia("Ronaldo", "España");
		
		
		
		Policia[] policias = new Policia[1];
		Persona[] personasDetenidas = new Persona[3];
		
		Comisaria comisaria1 = new Comisaria(policias, personasDetenidas);
		
		personasDetenidas[1] = p1;
		personasDetenidas[2] = p2;
		
		policias[0] = po1;
		
		assertTrue(comisaria1.hayMasPersonasDetenidasQuePolicias());
		
		
		
	}
	
}


