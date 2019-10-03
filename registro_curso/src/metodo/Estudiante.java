package metodo;

public class Estudiante {
	private String nombre;
	private String direccion;
	private int edad;
	private String Genero;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) throws Excepcion {
		if (edad > 15 && edad < 90) {
			this.edad = edad;
		}
		else {
			throw new Excepcion("Edad inválida",edad);
		}
	}
	
	public String getGenero() {
		return Genero;
	}
	
	public void setGenero(String genero) {
		Genero = genero;
	}
}
