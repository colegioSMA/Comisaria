package comisaria;

public class Comisaria {
	private static Policia[] policias;
	public static Persona[] personasDetenidas;
	
	

	public Comisaria(Policia[] policias, Persona[] personasDetenidas) {
		super();
		this.policias = policias;
		this.personasDetenidas = personasDetenidas;
	}
	
	public static void addPolicia(Policia policia) {
		
		Policia [] policiasAux = new Policia[policias.length];
		
		System.arraycopy(policias, 0, policiasAux, 
				0, policias.length);
		
		policias = new Policia[policiasAux.length+1];
		
		System.arraycopy(policiasAux, 0, policias, 
				0, policiasAux.length);
		policias[policias.length-1] = policia;
		
	}
	
	public static void addDetenido(Persona persona) {
		
		Persona [] detenidosAux = new Persona[personasDetenidas.length];
		
		System.arraycopy(personasDetenidas, 0, detenidosAux, 
				0, personasDetenidas.length);
		
		personasDetenidas = 
				new Persona[detenidosAux.length+1];
		
		System.arraycopy(detenidosAux, 0, personasDetenidas, 
				0, detenidosAux.length);
		personasDetenidas[personasDetenidas.length-1] = persona;	
	}
	
	public static boolean hayMasPersonasDetenidasQuePolicias() {
		return personasDetenidas.length > policias.length;
	}
	public Persona[] getPersonasDetenidas() {
		return personasDetenidas;
	}

	public void setPersonasDetenidas(Persona[] personasDetenidas) {
		this.personasDetenidas = personasDetenidas;
	}

	public Policia[] getPolicias() {
		return policias;
	}

	public void setPolicias(Policia[] policias) {
		this.policias = policias;
	}
	
}
