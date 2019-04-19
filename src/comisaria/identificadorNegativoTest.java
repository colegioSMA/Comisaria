package comisaria;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import comisaria.Persona;

public class identificadorNegativoTest {
	
	Persona persona = null;

	@Before
	public void setUp() throws Exception {
		
		persona = new Persona("Manuel", 19, "calle Direccion1");
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		
		persona.setIdentificador(-1);
		
	}

}
