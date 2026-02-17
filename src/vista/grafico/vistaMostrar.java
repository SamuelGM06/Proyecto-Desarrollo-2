package vista.grafico;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Usuario;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 * @author Dylan Lobo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */
public class vistaMostrar extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JButton btnBuscar;
	private JList<Usuario> list;
	private JButton btnSeleccionarUsuario;
	private JButton btnSalir;
	private JTextField txtNivelJuego;
	private JTextField txtPuntaje;
	
	public vistaMostrar(JFrame parent) {
		super(parent);
		initComponent();
		setTitle("Mostrar Usuarios");
		setSize(661, 427);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void initComponent() {
	    setBounds(100, 100, 625, 405);
	    getContentPane().setLayout(new BorderLayout());
	    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

	    
	    contentPanel.setBackground(Color.BLACK);

	    getContentPane().add(contentPanel, BorderLayout.CENTER);
	    contentPanel.setLayout(null);

	   
	    JLabel frase = new JLabel("Muéstranos la luz, joven padawan");
	    frase.setFont(new Font("Serif", Font.BOLD, 22));
	    frase.setForeground(new Color(0, 255, 127)); 
	    frase.setBounds(20, 5, 350, 30);
	    contentPanel.add(frase);

	    txtNombre = new JTextField();
	    txtNombre.setBounds(95, 61, 86, 20);
	    contentPanel.add(txtNombre);
	    txtNombre.setColumns(10);

	    JLabel lblNewLabel = new JLabel("Nombre: ");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNewLabel.setForeground(Color.WHITE);
	    lblNewLabel.setBounds(21, 52, 68, 34);
	    contentPanel.add(lblNewLabel);

	    btnBuscar = new JButton("Buscar");
	    btnBuscar.setBounds(298, 270, 89, 23);
	    contentPanel.add(btnBuscar);

	    JLabel lblNewLabel_1 = new JLabel("Resultados");
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNewLabel_1.setForeground(Color.WHITE);
	    lblNewLabel_1.setBounds(298, 36, 86, 23);
	    contentPanel.add(lblNewLabel_1);

	    list = new JList<>();
	    list.setBounds(298, 80, 324, 179);
	    contentPanel.add(list);

	    btnSeleccionarUsuario = new JButton("Seleccionar Usuario");
	    btnSeleccionarUsuario.setBounds(459, 270, 163, 23);
	    contentPanel.add(btnSeleccionarUsuario);

	    btnSalir = new JButton("Regresar");
	    btnSalir.setBounds(10, 354, 89, 23);
	    contentPanel.add(btnSalir);

	    JLabel lblNivelDeJuego = new JLabel("Nivel de Juego:");
	    lblNivelDeJuego.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNivelDeJuego.setForeground(Color.WHITE);
	    lblNivelDeJuego.setBounds(21, 97, 140, 34);
	    contentPanel.add(lblNivelDeJuego);

	    txtNivelJuego = new JTextField();
	    txtNivelJuego.setBounds(137, 106, 86, 20);
	    contentPanel.add(txtNivelJuego);
	    txtNivelJuego.setColumns(10);

	    JLabel lblPuntaje = new JLabel("Puntaje:");
	    lblPuntaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblPuntaje.setForeground(Color.WHITE);
	    lblPuntaje.setBounds(21, 142, 68, 34);
	    contentPanel.add(lblPuntaje);

	    txtPuntaje = new JTextField();
	    txtPuntaje.setBounds(95, 151, 86, 20);
	    contentPanel.add(txtPuntaje);
	    txtPuntaje.setColumns(10);

	    
	    Color lukePelo = new Color(212, 175, 55); 

	    btnBuscar.setBackground(lukePelo);
	    btnBuscar.setForeground(Color.WHITE);

	    btnSeleccionarUsuario.setBackground(lukePelo);
	    btnSeleccionarUsuario.setForeground(Color.WHITE);

	    btnSalir.setBackground(lukePelo);
	    btnSalir.setForeground(Color.WHITE);
	}

	//sets y gets
	
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JList getList() {
		return list;
	}

	public JButton getBtnSeleccionarUsuario() {
		return btnSeleccionarUsuario;
	}
	
	
	public JButton getBtnSalir() {
		return btnSalir;
	}
	
	public JTextField getTxtNivelJuego() {
		return txtNivelJuego;
	}

	public JTextField getTxtPuntaje() {
		return txtPuntaje;
	}


	//metodos de apoyo
	public void setActionListener(ActionListener listener) {
		btnBuscar.addActionListener(listener);
		btnSeleccionarUsuario.addActionListener(listener);
		btnSalir.addActionListener(listener);

		System.out.println("VISTA - GRÁFICA LISTA PARA ESCUCHAR EVENTOS");
	}
	
	// Muestra un mensaje emergente al usuario
	public void mostrarMensaje(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}

	// Cierra la ventana principal
	public void cerrar() {
		System.out.println("CERRAR - Vista GRÁFICA");
		this.dispose();
	}
	
	public String getNombre() {
		return txtNombre.getText();
	}
	
	public void imprimirList(Usuario[] u) {
		
		list.setListData(u);
		
	}
	
	public String getNivelJuego() {
		return txtNivelJuego.getText();
	}

	public String getPuntaje() {
		return txtPuntaje.getText();
	}
	
	public Usuario getUsuarioSeleccionado() {
	    return list.getSelectedValue();  
	}
}
