package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import comisaria.*;

public class ComisariaTest {

	Comisaria comisaria = null;
	Policia[] policias = null;
	Persona[] personasDetenidas = null;
	Policia policia1 = null;
	

	@Before
	public void setUp() throws Exception {

		comisaria = new Comisaria(policias, personasDetenidas);
		policia1 = new Policia("Alvarez", "c/begoña");		
		policias[0] = policia1;
		

	}

	@Test
	public void addPoliciaTest() {		
		Policia policia2 = new Policia("Jesus", "c/valrria");
		Policia[] policiasAux= {policia1,policia2};
		
		comisaria.addPolicia(policia2);
		assertArrayEquals(policiasAux, comisaria.getPolicias());

	}
	
	@Test
	public void addDetenidoTest() {
		

	}
	
	


}
