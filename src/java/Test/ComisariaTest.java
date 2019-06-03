package Test;

import static org.junit.Assert.*;

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

		policia2 = new Policia("Antoan", "c/Rara");
		policia1 = new Policia("Josefa", "c/Simancas");
		detenido1 = new Persona("Ramiro", 28, "c/Real");
		detenido2 = new Persona("Pepe", 35, "c/Pinto");

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
