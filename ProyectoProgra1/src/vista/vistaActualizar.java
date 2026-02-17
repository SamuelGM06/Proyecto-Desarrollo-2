package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JList;

/**
 * @author Dylan Lobo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */
public class vistaActualizar extends JDialog {
	public vistaActualizar() {
		initComponent();
	}
	

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtNivel;
	private JTextField txtPuntaje;

	public void initComponent() {
		setBounds(100, 100, 625, 405);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(153, 61, 86, 20);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNivel = new JTextField();
		txtNivel.setBounds(153, 128, 86, 20);
		contentPanel.add(txtNivel);
		txtNivel.setColumns(10);
		
		txtPuntaje = new JTextField();
		txtPuntaje.setBounds(153, 211, 86, 20);
		contentPanel.add(txtPuntaje);
		txtPuntaje.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(70, 52, 95, 34);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNivel = new JLabel("Nivel:");
		lblNivel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNivel.setBounds(70, 117, 95, 34);
		contentPanel.add(lblNivel);
		
		JLabel lblPuntaje = new JLabel("Puntaje:");
		lblPuntaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntaje.setBounds(70, 199, 95, 34);
		contentPanel.add(lblPuntaje);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(153, 270, 89, 23);
		contentPanel.add(btnBuscar);
		
		JLabel lblNewLabel_1 = new JLabel("Resultados");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(310, 36, 86, 23);
		contentPanel.add(lblNewLabel_1);
		
		JList list = new JList();
		list.setBounds(298, 80, 279, 151);
		contentPanel.add(list);
		
		JButton btnSeleccionarUsuario = new JButton("Seleccionar Usuario");
		btnSeleccionarUsuario.setBounds(397, 270, 148, 23);
		contentPanel.add(btnSeleccionarUsuario);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(276, 320, 89, 23);
		contentPanel.add(btnRegresar);
	}
	
}

