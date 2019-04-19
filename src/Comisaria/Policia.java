package Comisaria;

public class Policia {

	private static int contador = 0;
	private int identificador;
	private String nombre;
	private String direccionCasa;
	public Policia(String nombre, String direccionCasa) {
		super();
		this.identificador = ++contador;
		this.nombre = nombre;
		this.direccionCasa = direccionCasa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccionCasa() {
		return direccionCasa;
	}
	public void setDireccionCasa(String direccionCasa) {
		this.direccionCasa = direccionCasa;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Policia other = (Policia) obj;
		if (direccionCasa == null) {
			if (other.direccionCasa != null)
				return false;
		} else if (!direccionCasa.equals(other.direccionCasa))
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
	
	
}
