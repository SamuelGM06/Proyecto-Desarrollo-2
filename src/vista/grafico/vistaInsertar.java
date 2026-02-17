package vista.grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Dylan
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */
public class vistaInsertar extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtPassword;
	private JButton btnRegresar;
	JButton btnAgregar;

	public vistaInsertar(JFrame parent) {
		super(parent);
		initComponent();
		setTitle("Insertar Usuario");
		setSize(624, 411);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void initComponent() {
		
		setBounds(100, 100, 623, 396);
		getContentPane().setLayout(new BorderLayout());

		
		Color verdeYoda = new Color(58, 94, 60);  
		contentPanel.setBackground(verdeYoda);

		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		
		JLabel frase = new JLabel("Inserta tu nombre, aventurero... ¡y que la Fuerza te acompañe!");
		frase.setFont(new Font("Serif", Font.BOLD, 20));
		frase.setForeground(new Color(144, 255, 117)); 
		frase.setBounds(40, 5, 550, 30);
		contentPanel.add(frase);

		
		txtNombre = new JTextField();
		txtNombre.setBounds(124, 70, 214, 20);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(42, 71, 95, 14);
		contentPanel.add(lblNewLabel);

		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(42, 120, 95, 14);
		contentPanel.add(lblContrasea);

		txtPassword = new JTextField();
		txtPassword.setBounds(147, 119, 191, 20);
		contentPanel.add(txtPassword);
		txtPassword.setColumns(10);

		
		Color marronBoton = new Color(112, 78, 55);  
		Color textoBlanco = Color.WHITE;

		btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(marronBoton);
		btnAgregar.setForeground(textoBlanco);
		btnAgregar.setFocusPainted(false);
		btnAgregar.setBounds(405, 289, 120, 30);
		contentPanel.add(btnAgregar);

		btnRegresar = new JButton("Regresar");
		btnRegresar.setBackground(marronBoton);
		btnRegresar.setForeground(textoBlanco);
		btnRegresar.setFocusPainted(false);
		btnRegresar.setBounds(124, 289, 120, 30);
		contentPanel.add(btnRegresar);
	}

	// GETTERS
	public JButton getBtnAgregar() {
		return btnAgregar;
	}
	
	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtPassword() {
		return txtPassword;
	}


	//Metodos de apoyo
	
	public void setActionListener(ActionListener listener) {
		btnAgregar.addActionListener(listener);
		btnRegresar.addActionListener(listener);
		System.out.println("VISTA - GRÁFICA LISTA PARA ESCUCHAR EVENTOS");
	}

	public void mostrarMensaje(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}

	public void cerrar() {
		System.out.println("CERRAR - Vista GRÁFICA - Agregar");
		dispose();
	}
    
	public String getTxtNombreUsuario() {
		return txtNombre.getText();
	}
    
	public String getContra() {
		return txtPassword.getText();
	}
}
