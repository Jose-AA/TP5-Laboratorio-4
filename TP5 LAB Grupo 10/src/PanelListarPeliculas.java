import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;


public class PanelListarPeliculas extends JPanel {

    private static final long serialVersionUID = 1L;
    private DefaultListModel<String> dlModel;
    private JList<String> lista;

    public PanelListarPeliculas() {
        setLayout(null);

        JLabel lblPeliculas = new JLabel("Películas");
        lblPeliculas.setBounds(66, 109, 70, 20);
        add(lblPeliculas);

        lista = new JList<>();
        lista.setBounds(183, 69, 212, 177);
        add(lista);

       
        dlModel = new DefaultListModel<>();
        cargarPeliculas();
        lista.setModel(dlModel);
    }
    
    public void cargarPeliculas() {
        dlModel.clear(); 
        for (Pelicula pelicula : Pelicula.listaPeliculas) {
            dlModel.addElement(pelicula.toString());
        }
    }
}