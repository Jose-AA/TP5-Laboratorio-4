import javax.swing.JPanel;

import java.util.Collections;
import java.util.List;
import java.util.Comparator;

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
        List<Pelicula> listaPeliculas = Pelicula.listaPeliculas;
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                return pelicula1.getNombre().compareTo(pelicula2.getNombre());
            }
        });
        for (Pelicula pelicula : listaPeliculas) {
            dlModel.addElement(pelicula.toString());
        }
    }
    }
