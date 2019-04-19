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
	
	
}
