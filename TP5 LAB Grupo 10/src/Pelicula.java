import java.util.ArrayList;
import java.util.List;


public class Pelicula {

    private final int id;
    private static int contadorId = 1;
    private String nombre;
    private Categoria categoria;
    
    public static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

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
        return "Nombre: " + nombre + " - Categoría: " + categoria.getNombre();
    }
}
