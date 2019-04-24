package comisaria;

public class Persona {
	private static int contador = 0;
	private int identificador;
	private String nombre;
	private int edad;
	private String direccion;
	//Esto es un constructor
	public Persona(String nombre, int edad,
			String direccion) {
		super();
		this.identificador = ++contador;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}
	public boolean isMayorEdad() {
		return edad>=18;
	}
	public boolean contieneCalle() {
		return direccion.
				contains("calle");
	}
	public void setIdentificador(int id) {
		if (id < 0)
			throw new IllegalArgumentException();
		else 
			this.identificador = id;
	}

}
