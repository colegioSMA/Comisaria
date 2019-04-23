package Test;

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Before;
import org.junit.Test;

import comisaria.*;

public class ComisariaTest {

	Policia[] policias = null;
	Persona[] personasDetenidas = null;
	Comisaria comisaria = null;
	Policia policia1 = null;
	Policia policia2 = null;
	Persona detenido1 = null;
	Persona detenido2 = null;

	@Before
	public void setUp() throws Exception {

		policia2 = new Policia("Juan", "c/Alva");
		policia1 = new Policia("Jose", "c/Segovia");
		detenido1 = new Persona("Jose", 22, "c/Segovia");
		detenido2 = new Persona("Pedro", 45, "c/Alvatroz");

		Policia[] policias = { policia1 };
		Persona[] personasDetenidas = { detenido1 };
		comisaria = new Comisaria(policias, personasDetenidas);
	}

	@Test
	public void addPoliciaTest() {

		Policia[] policiasAux = { policia1, policia2 };

		comisaria.addPolicia(policia2);

		assertNotNull(comisaria.getPolicias()[comisaria.getPolicias().length - 1]);
		assertArrayEquals(policiasAux, comisaria.getPolicias());

	}

	@Test
	public void addDetenidoTest() {

		Persona[] detenidosAux = { detenido1, detenido2 };

		comisaria.addDetenido(detenido2);

		assertNotNull(comisaria.getPersonasDetenidas()[comisaria.getPersonasDetenidas().length - 1]);
		assertArrayEquals(detenidosAux, comisaria.getPersonasDetenidas());

	}

}
