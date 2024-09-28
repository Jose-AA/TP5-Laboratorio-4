public class Pelicula {

    private final int id;
    private static int contadorId = 1;
    private String nombre;
    private Categoria categoria;

    public Pelicula(String nombre, Categoria categoria) {
        this.id = contadorId;
        this.nombre = nombre;
        this.categoria = categoria;
        contadorId++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
	public static String devuelveProximoId()
	{
		return Integer.toString(contadorId);
	}

    @Override
    public String toString() {
        return "Pelicula: " + nombre + " - Categoría: " + categoria.getNombre();
    }
}
