
public class Categoria {

	private final int id;
	private static int contadorId = 1; 	
	private String nombre;
	
	
	public Categoria(String nombre) {

		this.nombre = nombre;
		this.id = contadorId;
		
		contadorId++;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre + " -";
	}
	
	
}
