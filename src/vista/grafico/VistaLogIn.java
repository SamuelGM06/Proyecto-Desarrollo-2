package vista.grafico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class VistaLogIn extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNickname;
	private JTextField txtPassword;
	private JButton btnIniciarSesion;
	private JButton btnRegresar;

	public VistaLogIn(JFrame parent) {
		super(parent);
		iniComponent();
		setTitle("Iniciar Sesión");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void iniComponent() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesión");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(171, 11, 94, 24);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombreDeUsuario.setBounds(22, 73, 131, 24);
		contentPanel.add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContrasea.setBounds(60, 108, 82, 24);
		contentPanel.add(lblContrasea);
		
		txtNickname = new JTextField();
		txtNickname.setBounds(136, 76, 129, 20);
		contentPanel.add(txtNickname);
		txtNickname.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(134, 111, 131, 20);
		contentPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		btnIniciarSesion = new JButton("Iniciar Sesión");
		btnIniciarSesion.setBounds(261, 227, 163, 23);
		contentPanel.add(btnIniciarSesion);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(10, 227, 89, 23);
		contentPanel.add(btnRegresar);

	}

	public JTextField getTxtNickname() {
		return txtNickname;
	}

	public JTextField getTxtPassword() {
		return txtPassword;
	}

	public JButton getBtnIniciarSesion() {
		return btnIniciarSesion;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public void setTxtNickname(JTextField txtNickname) {
		this.txtNickname = txtNickname;
	}

	public void setTxtPassword(JTextField txtPassword) {
		this.txtPassword = txtPassword;
	}
	
	public void setActionListener(ActionListener listener) {
		btnIniciarSesion.addActionListener(listener);
		btnRegresar.addActionListener(listener);

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
	
	public String getNickname() {
		return txtNickname.getText();
	}
	
	public String getPassword() {
		return txtPassword.getText();
	}
	


	
}
