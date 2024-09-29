import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregarPelicula extends JPanel {

		 private static final long serialVersionUID = 1L;
		 private JTextField txtNombre;
		 private JLabel lblID;
		 private JLabel lblTxtID;
		 private JLabel lblNombre;
		 private JLabel lblGenero;
		 private JComboBox<Categoria>cbGenero;
		 private JButton btnAceptar;

		    public PanelAgregarPelicula() {
		        setLayout(null); 

		        lblID = new JLabel("ID");
		        lblID.setBounds(97, 34, 12, 16);
		        add(lblID); 

		        lblNombre = new JLabel("Nombre");
		        lblNombre.setBounds(97, 75, 45, 16);
		        add(lblNombre);

		        txtNombre = new JTextField();
		        txtNombre.setBounds(219, 72, 126, 22);
		        add(txtNombre);
		        txtNombre.setColumns(10);

		        lblGenero = new JLabel("Genero");
		        lblGenero.setBounds(97, 117, 41, 16);
		        add(lblGenero);

		        cbGenero = new JComboBox<>();
		        cbGenero.setBounds(219, 114, 126, 22);
		        add(cbGenero);

		        Categoria terror = new Categoria("Terror");
		        Categoria accion = new Categoria("Accion");
		        Categoria suspenso = new Categoria("Suspenso");
		        Categoria romantica = new Categoria("Romantica");

		        cbGenero.addItem(new Categoria("Seleccione un genero"));
		        cbGenero.addItem(terror);
		        cbGenero.addItem(accion);
		        cbGenero.addItem(suspenso);
		        cbGenero.addItem(romantica);

		        btnAceptar = new JButton("ACEPTAR");
		        btnAceptar.setBounds(97, 164, 116, 25);
		        add(btnAceptar);
		        btnAceptar.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                agregarPelicula();
		            }
		        });
		        lblTxtID = new JLabel("");
		        lblTxtID.setHorizontalAlignment(SwingConstants.CENTER);
		        lblTxtID.setBounds(259, 34, 46, 14);
		        add(lblTxtID);
		        lblTxtID.setText(Pelicula.devuelveProximoId());
		     
		    }
		        private void agregarPelicula() {
		            String nombrePelicula = txtNombre.getText().trim();
		            Categoria categoriaPelicula = (Categoria)cbGenero.getSelectedItem();

		            if (nombrePelicula.isEmpty()) {
		                JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "Error", JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            if (categoriaPelicula == null || categoriaPelicula.getNombre().equals("Seleccione un genero")) {
		                JOptionPane.showMessageDialog(null, "Debe seleccionar un género", "Error", JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            
		            boolean repetida = Pelicula.listaPeliculas.stream()
		                    .anyMatch(p -> p.getNombre().equalsIgnoreCase(nombrePelicula) 
		                                && p.getCategoria().equals(categoriaPelicula));

		                if (repetida) {
		                    JOptionPane.showMessageDialog(null, "La película ya existe en el sistema.", "Error", JOptionPane.ERROR_MESSAGE);
		                    return;
		                }
        
		            Pelicula nuevaPelicula = new Pelicula(nombrePelicula, categoriaPelicula);
		            Pelicula.listaPeliculas.add(nuevaPelicula);		            
		            JOptionPane.showMessageDialog(null, "Película agregada: " + nuevaPelicula.toString());

		            lblTxtID.setText(Pelicula.devuelveProximoId());
		            txtNombre.setText("");
		            cbGenero.setSelectedIndex(0);
		        }
		    }