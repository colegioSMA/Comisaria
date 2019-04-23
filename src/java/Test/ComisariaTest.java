package Test;

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Before;
import org.junit.Test;

import comisaria.*;

public class ComisariaTest {

	Policia[] policias=null;
	Persona[] personasDetenidas=null;
	Comisaria comisaria = null;	
	

	@Before
	public void setUp() throws Exception {
		
		Policia[] policias = {new Policia("Juan", "c/Alva")};
		Persona[] personasDetenidas = {new Persona("Candi",19,"c/vitrubio")};
		comisaria = new Comisaria(policias, personasDetenidas);	
		
		
	}

	@Test
	public void addPoliciaTest() {	
		
		Policia policia2=new Policia("Jose","c/Segovia");
		
		Policia[] policiasAux= {new Policia("Juan", "c/Alva"),new Policia("Jose","c/Segovia")};		
		
		comisaria.addPolicia(policia2);
		
		assertNotNull(comisaria.getPolicias()[comisaria.getPolicias().length-1]);
		assertArrayEquals(policiasAux,comisaria.getPolicias());

	}
	
	@Test
	public void addDetenidoTest() {
		
		Persona detenido = new Persona("Jose",22,"c/Segovia");
		
		Persona[] detenidosAux= {new Persona("Candi",19,"c/vitrubio"),new Persona("Jose",22,"c/Segovia")};	
		
		comisaria.addDetenido(detenido);
		
		assertNotNull(comisaria.getPersonasDetenidas()[comisaria.getPersonasDetenidas().length-1]);
		
		assertArrayEquals(detenidosAux, comisaria.getPersonasDetenidas());

	}
	
	


}
