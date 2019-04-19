package Comisaria;

public class Persona {
	private static int contador = 0;
	private int identificador;
	private String nombre;
	private int edad;
	private String direccion;
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
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int id) {
		if (id < 0)
			throw new IllegalArgumentException();
		else
			this.identificador = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (edad != other.edad)
			return false;
		if (identificador != other.identificador)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Persona [identificador=" + identificador + ", nombre=" + nombre + ", edad=" + edad + ", direccion="
				+ direccion + "]";
	}
	
}
