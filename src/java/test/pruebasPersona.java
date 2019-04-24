package test;

import static org.junit.Assert.*;

import org.junit.Test;

import comisaria.Persona;

public class pruebasPersona  {
	Persona persona = new Persona("Julio", 33, "Madrid");
	@Test
	public void pruebaidentificador(){
		
		persona.setIdentificador(-4);
	}
	
	@Test
	public void isMayorEdad(){
		assertTrue(persona.isMayorEdad());
	}
	
	@Test
	public void contineCalle() {
		assertEquals(persona.contieneCalle(), false);
	}

	
}
