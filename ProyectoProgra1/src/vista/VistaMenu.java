package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenu extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public VistaMenu() {
		
		initComponent();
		
		setVisible(true);

	}
	
	public void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlMenuPrincipal = new JLabel("Menu Principal");
		jlMenuPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlMenuPrincipal.setBounds(274, 35, 161, 39);
		contentPane.add(jlMenuPrincipal);
		
		JButton btnInsertar = new JButton("INSERTAR");
		btnInsertar.setBackground(new Color(255, 255, 255));
		btnInsertar.setBounds(291, 205, 105, 23);
		contentPane.add(btnInsertar);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.setBounds(291, 239, 105, 23);
		contentPane.add(btnMostrar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(291, 273, 105, 23);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(291, 307, 105, 23);
		contentPane.add(btnActualizar);
		
		
		
		JButton btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.setBounds(290, 349, 106, 29);
		contentPane.add(btnConfiguracion);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(293, 417, 89, 23);
		contentPane.add(btnSalir);

	}
}
