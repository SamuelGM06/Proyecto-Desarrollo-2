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
import java.awt.event.ActionEvent;

/**
 * @author Dylan Lobo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */
public class vistaEliminacion extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtPassword;
	private JTextField txtPuntaje;
	private JLabel lblId;
	private JTextField txtID;
	private JButton btnRegresar;
	private JButton btnEliminar;
	
	public vistaEliminacion(vistaEliminar parent) {
		super(parent);
		initComponent();
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
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(42, 41, 95, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setForeground(Color.WHITE);
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
		lblPuntaje.setForeground(Color.WHITE);
		lblPuntaje.setBounds(42, 134, 66, 35);
		contentPanel.add(lblPuntaje);
		
		txtPuntaje = new JTextField();
		txtPuntaje.setBounds(109, 143, 86, 20);
		txtPuntaje.setBackground(Color.BLACK);
		txtPuntaje.setForeground(Color.WHITE);
		contentPanel.add(txtPuntaje);
		txtPuntaje.setColumns(10);
		
		lblId = new JLabel("Id:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(42, 180, 32, 35);
		contentPanel.add(lblId);
		
		txtID = new JTextField();
		txtID.setBounds(80, 189, 48, 20);
		txtID.setBackground(Color.BLACK);
		txtID.setForeground(Color.WHITE);
		contentPanel.add(txtID);
		txtID.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(405, 289, 106, 23);
		btnEliminar.setBackground(Color.RED);
		btnEliminar.setForeground(Color.WHITE);
		contentPanel.add(btnEliminar);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(124, 289, 89, 23);
		btnRegresar.setBackground(Color.RED);
		btnRegresar.setForeground(Color.WHITE);
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

	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	//Metodos de apoyo
	public void setActionListener(ActionListener listener) {
		btnEliminar.addActionListener(listener);
		btnRegresar.addActionListener(listener);
	}
				
	public void mostrarMensaje(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}

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
