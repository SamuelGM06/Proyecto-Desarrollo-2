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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Dylan Lobo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */
public class vistaEliminar extends JDialog {
	public vistaEliminar() {
		initComponent();
	}
	
	
	

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;

	public void initComponent() {
		setBounds(100, 100, 625, 405);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(111, 89, 124, 20);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(26, 80, 95, 34);
		contentPanel.add(lblNewLabel);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(78, 157, 89, 23);
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
		btnRegresar.setBounds(78, 270, 89, 23);
		contentPanel.add(btnRegresar);
	}
	
}

