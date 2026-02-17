package vista.grafico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;

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
	private JTextField txtPuntaje;
	private JLabel lblId;
	private JTextField txtID;
	private JButton btnRegresar;
	
	public vistaDatosUsuario(vistaMostrar parent) {
		super(parent);
		initComponent();
		setTitle("Datos de Usuario");
		setVisible(true);
	}


	public void initComponent() {
		setBounds(100, 100, 623, 396);
		getContentPane().setLayout(new BorderLayout());

		
		contentPanel.setBackground(Color.BLACK);
		getContentPane().setBackground(Color.BLACK);

		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		{
			txtNombre = new JTextField();
			txtNombre.setBounds(124, 40, 214, 20);
			txtNombre.setBackground(Color.BLACK);
			txtNombre.setForeground(Color.WHITE);
			contentPanel.add(txtNombre);
			txtNombre.setColumns(10);
		}
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(0, 255, 102)); 
		lblNewLabel.setBounds(42, 41, 95, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setForeground(new Color(0, 255, 102));
		lblContrasea.setBounds(42, 89, 95, 14);
		contentPanel.add(lblContrasea);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(147, 88, 191, 20);
		txtPassword.setBackground(Color.BLACK);
		txtPassword.setForeground(Color.WHITE);
		contentPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblPuntaje = new JLabel("Puntaje:");
		lblPuntaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntaje.setForeground(new Color(0, 255, 102));
		lblPuntaje.setBounds(41, 142, 66, 35);
		contentPanel.add(lblPuntaje);
		
		txtPuntaje = new JTextField();
		txtPuntaje.setBounds(133, 151, 86, 20);
		txtPuntaje.setBackground(Color.BLACK);
		txtPuntaje.setForeground(Color.WHITE);
		contentPanel.add(txtPuntaje);
		txtPuntaje.setColumns(10);
		
		lblId = new JLabel("Id:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblId.setForeground(new Color(0, 255, 102));
		lblId.setBounds(42, 186, 32, 35);
		contentPanel.add(lblId);
		
		txtID = new JTextField();
		txtID.setBounds(101, 195, 48, 20);
		txtID.setBackground(Color.BLACK);
		txtID.setForeground(Color.WHITE);
		contentPanel.add(txtID);
		txtID.setColumns(10);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(297, 296, 89, 23);
		btnRegresar.setBackground(new Color(0, 255, 102)); 
		btnRegresar.setForeground(Color.BLACK);
		contentPanel.add(btnRegresar);
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public JTextField getTxtPassword() {
		return txtPassword;
	}


	public JTextField getTxtPuntaje() {
		return txtPuntaje;
	}


	public JTextField getTxtID() {
		return txtID;
	}


	public JButton getBtnRegresar() {
		return btnRegresar;
	}


	public void setBtnRegresar(JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}
	
	//Metodos de apoyo
	public void setActionListener(ActionListener listener) {
		btnRegresar.addActionListener(listener);

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
	
	public void setId(String id) {
		txtID.setText(id);
	}
	
	public void setNombre(String nombre) {
		txtNombre.setText(nombre);
	}
	
	public void setPassword(String pass) {
		txtPassword.setText(pass);
	}
	
	
	public void setPuntaje(String punatje) {
		txtPuntaje.setText(punatje);
	}
	
	
}
