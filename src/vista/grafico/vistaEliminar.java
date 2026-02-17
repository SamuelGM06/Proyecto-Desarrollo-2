package vista.grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Usuario;

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
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Dylan Lobo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */
public class vistaEliminar extends JDialog {
	private JButton btnBuscar;
	private JButton btnSeleccionarUsuario;
	private JButton btnRegresar;
	private JList<Usuario> list;
	
	public vistaEliminar(JFrame parent) {
		super(parent);
		initComponent();
		
		setTitle("Eliminar Usuario");
		setSize(624, 411);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtPuntaje;
	private JLabel lblPuntaje;
	private JLabel lblNivelDeJuego;
	private JTextField txtNivelJuego;

	public void initComponent() {
	    setBounds(100, 100, 625, 405);
	    getContentPane().setLayout(new BorderLayout());
	    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

	   
	    contentPanel.setBackground(Color.BLACK);

	    getContentPane().add(contentPanel, BorderLayout.CENTER);
	    contentPanel.setLayout(null);

	    
	    JLabel frase = new JLabel("Elimina la luz de ti");
	    frase.setFont(new Font("Serif", Font.BOLD, 22));
	    frase.setForeground(new Color(178, 0, 255)); 
	    frase.setBounds(20, 5, 350, 30);
	    contentPanel.add(frase);

	    txtNombre = new JTextField();
	    txtNombre.setBounds(111, 89, 124, 20);
	    contentPanel.add(txtNombre);
	    txtNombre.setColumns(10);

	    JLabel lblNewLabel = new JLabel("Nombre: ");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNewLabel.setForeground(new Color(210, 210, 210));
	    lblNewLabel.setBounds(26, 80, 95, 34);
	    contentPanel.add(lblNewLabel);

	    btnBuscar = new JButton("Buscar");
	    btnBuscar.setBounds(298, 242, 89, 23);
	    contentPanel.add(btnBuscar);

	    JLabel lblNewLabel_1 = new JLabel("Resultados");
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNewLabel_1.setForeground(new Color(210, 210, 210));
	    lblNewLabel_1.setBounds(310, 36, 86, 23);
	    contentPanel.add(lblNewLabel_1);

	    list = new JList<>();
	    list.setBounds(298, 80, 300, 151);
	    contentPanel.add(list);

	    btnSeleccionarUsuario = new JButton("Seleccionar Usuario");
	    btnSeleccionarUsuario.setBounds(450, 242, 148, 23);
	    contentPanel.add(btnSeleccionarUsuario);

	    btnRegresar = new JButton("Regresar");
	    btnRegresar.setBounds(10, 338, 89, 23);
	    contentPanel.add(btnRegresar);

	    txtPuntaje = new JTextField();
	    txtPuntaje.setColumns(10);
	    txtPuntaje.setBounds(100, 174, 86, 20);
	    contentPanel.add(txtPuntaje);

	    lblPuntaje = new JLabel("Puntaje:");
	    lblPuntaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblPuntaje.setForeground(new Color(210, 210, 210));
	    lblPuntaje.setBounds(26, 165, 68, 34);
	    contentPanel.add(lblPuntaje);

	    lblNivelDeJuego = new JLabel("Nivel de Juego:");
	    lblNivelDeJuego.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNivelDeJuego.setForeground(new Color(210, 210, 210));
	    lblNivelDeJuego.setBounds(26, 120, 140, 34);
	    contentPanel.add(lblNivelDeJuego);

	    txtNivelJuego = new JTextField();
	    txtNivelJuego.setColumns(10);
	    txtNivelJuego.setBounds(142, 129, 86, 20);
	    contentPanel.add(txtNivelJuego);

	    
	    Color sithRed = new Color(150, 0, 0); 
	    btnBuscar.setBackground(sithRed);
	    btnBuscar.setForeground(Color.WHITE);

	    btnSeleccionarUsuario.setBackground(sithRed);
	    btnSeleccionarUsuario.setForeground(Color.WHITE);

	    btnRegresar.setBackground(sithRed);
	    btnRegresar.setForeground(Color.WHITE);
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnSeleccionarUsuario() {
		return btnSeleccionarUsuario;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtPuntaje() {
		return txtPuntaje;
	}

	public JTextField getTxtNivelJuego() {
		return txtNivelJuego;
	}

	//Metodos de apoyo
		public void setActionListener(ActionListener listener) {
			btnSeleccionarUsuario.addActionListener(listener);
			btnRegresar.addActionListener(listener);
			btnBuscar.addActionListener(listener);

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
		
		
		public void imprimirList(Usuario[] u) {	
			list.setListData(u);
		}
		
		public String getNombre() {
			return txtNombre.getText();
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

