
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class VentanaAgregar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNombre;
	private JLabel lblID;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JComboBox cbGenero;
	private JButton btnAceptar;


	public VentanaAgregar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblID = new JLabel("ID");
		lblID.setBounds(97, 34, 12, 16);
		contentPane.add(lblID);
		
		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setBounds(219, 31, 126, 22);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(97, 75, 45, 16);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(219, 72, 126, 22);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setBounds(97, 117, 41, 16);
		contentPane.add(lblGenero);
		
		cbGenero = new JComboBox();
		cbGenero.setBounds(219, 114, 126, 22);
		contentPane.add(cbGenero);
		
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
		contentPane.add(btnAceptar);
		setTitle("Agregar Pelicula");
		
		
	}
}
