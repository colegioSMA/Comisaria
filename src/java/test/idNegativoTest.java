package test;
/**
 * @author jx-m
 *
 */
import org.junit.*;

import comisaria.Persona;

public class idNegativoTest {
	
	Persona persona = null;

	@Before
	public void setUp() throws Exception {
			
	}

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		
		persona.setIdentificador(-1);
		
	}

}
