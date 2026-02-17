package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * @author Dylan Lobo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */
public class vistaDatosUsuario extends JDialog {


	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtPassword;
	private JTextField txtNivelJuego;
	private JTextField txtPuntaje;
	private JLabel lblId;
	private JTextField txtID;
	private JButton btnRegresar;


	public void initComponent() {
		setBounds(100, 100, 623, 396);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtNombre = new JTextField();
			txtNombre.setBounds(124, 40, 214, 20);
			contentPanel.add(txtNombre);
			txtNombre.setColumns(10);
		}
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(42, 41, 95, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setBounds(42, 89, 95, 14);
		contentPanel.add(lblContrasea);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(147, 88, 191, 20);
		contentPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblNivelDeJuego = new JLabel("Nivel de Juego:");
		lblNivelDeJuego.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNivelDeJuego.setBounds(38, 130, 128, 35);
		contentPanel.add(lblNivelDeJuego);
		
		txtNivelJuego = new JTextField();
		txtNivelJuego.setBounds(162, 139, 48, 20);
		contentPanel.add(txtNivelJuego);
		txtNivelJuego.setColumns(10);
		
		JLabel lblPuntaje = new JLabel("Puntaje:");
		lblPuntaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntaje.setBounds(42, 176, 66, 35);
		contentPanel.add(lblPuntaje);
		
		txtPuntaje = new JTextField();
		txtPuntaje.setBounds(109, 185, 86, 20);
		contentPanel.add(txtPuntaje);
		txtPuntaje.setColumns(10);
		
		lblId = new JLabel("Id:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblId.setBounds(42, 222, 32, 35);
		contentPanel.add(lblId);
		
		txtID = new JTextField();
		txtID.setBounds(80, 231, 48, 20);
		contentPanel.add(txtID);
		txtID.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(399, 289, 89, 23);
		contentPanel.add(btnAgregar);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(88, 289, 89, 23);
		contentPanel.add(btnRegresar);
	}
	
	public vistaDatosUsuario() {
		initComponent();
	}
}
