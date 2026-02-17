package vista.grafico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author Dylan Lobo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */
public class vistaCambiarContrasena extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtConActual;
	private JTextField txtConNueva;
	private JTextField txtConfirmarContrasena;
	JButton btnRegresar;
	JButton btnConfirmar;

	public vistaCambiarContrasena(vistaActualizar parent) {
		super(parent);
		initComponent();
		setTitle("Cambiar Contraseña");
		setSize(624, 411);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void initComponent() {
		setBounds(100, 100, 633, 417);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtConActual = new JTextField();
			txtConActual.setBounds(198, 73, 185, 20);
			contentPanel.add(txtConActual);
			txtConActual.setColumns(10);
		}
		{
			txtConNueva = new JTextField();
			txtConNueva.setBounds(198, 140, 185, 20);
			contentPanel.add(txtConNueva);
			txtConNueva.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("Contraseña actual:");
			lblNewLabel.setBounds(40, 76, 120, 17);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nueva contraseña:");
			lblNewLabel_1.setBounds(40, 143, 120, 17);
			contentPanel.add(lblNewLabel_1);
		}
		{
			btnRegresar = new JButton("Regresar");
			btnRegresar.setBounds(103, 304, 89, 23);
			contentPanel.add(btnRegresar);
		}
		{
			btnConfirmar = new JButton("Confirmar");
			btnConfirmar.setBounds(409, 304, 89, 23);
			contentPanel.add(btnConfirmar);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Confirmar contrasena");
			lblNewLabel_1.setBounds(40, 196, 120, 17);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtConfirmarContrasena = new JTextField();
			txtConfirmarContrasena.setColumns(10);
			txtConfirmarContrasena.setBounds(198, 194, 185, 20);
			contentPanel.add(txtConfirmarContrasena);
		}
	}
	
	
	
	public JTextField getTxtConActual() {
		return txtConActual;
	}

	public JTextField getTxtConNueva() {
		return txtConNueva;
	}

	public JTextField getTxtConfirmarContrasena() {
		return txtConfirmarContrasena;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}

	public void setTxtConActual(JTextField txtConActual) {
		this.txtConActual = txtConActual;
	}

	public void setTxtConNueva(JTextField txtConNueva) {
		this.txtConNueva = txtConNueva;
	}

	public void setTxtConfirmarContrasena(JTextField txtConfirmarContrasena) {
		this.txtConfirmarContrasena = txtConfirmarContrasena;
	}

	public void setBtnRegresar(JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}

	public void setBtnConfirmar(JButton btnConfirmar) {
		this.btnConfirmar = btnConfirmar;
	}

	public void setActionListener(ActionListener listener) {
		btnRegresar.addActionListener(listener);
		btnConfirmar.addActionListener(listener);

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
		
		
	public String getContraNueva() {
		return txtConNueva.getText();
	}
	
	public String getContraActual() {
		return txtConActual.getText();
	}
	
	public String getContraConfirmar() {
		return txtConfirmarContrasena.getText();
	}
	
	
	}