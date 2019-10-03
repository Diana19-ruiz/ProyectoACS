package metodo;

public class Excepcion extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int edad;
	
	public Excepcion(String mensaje, int edad) {
		super(mensaje);
		this.edad = edad;
	}
	
	public int dameEdad() {
		return this.edad;
	}
}
