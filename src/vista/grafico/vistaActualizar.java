package vista.grafico;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Usuario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class vistaActualizar extends JDialog {
    private JButton btnSeleccionarUsuario;
    private JButton btnRegresar;
    private JList<Usuario> list;
    private JButton btnBuscar;
    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JTextField txtNombre;
    private JTextField txtPuntaje;
    private JTextField txtNivelJuego;
    
    public vistaActualizar(JFrame parent) {
        super(parent);
        initComponent();
        
        setTitle("Actualizar Usuario");
        setSize(624, 411);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initComponent() {
        setBounds(100, 100, 625, 405);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(Color.BLACK);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

      
        JLabel lblTituloVader = new JLabel("ACTUALÍZATE AL LADO OSCURO");
        lblTituloVader.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblTituloVader.setForeground(Color.RED);
        lblTituloVader.setBounds(110, 5, 450, 30);  
        contentPanel.add(lblTituloVader);

        
        txtNombre = new JTextField();
        txtNombre.setBounds(94, 78, 86, 20);
        txtNombre.setBackground(new Color(40, 40, 40));
        txtNombre.setForeground(Color.WHITE);
        txtNombre.setSelectionColor(Color.RED);
        contentPanel.add(txtNombre);

        JLabel lblNewLabel = new JLabel("Nombre: ");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(21, 69, 95, 34);
        contentPanel.add(lblNewLabel);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(249, 258, 89, 23);
        btnBuscar.setBackground(Color.RED);
        btnBuscar.setForeground(Color.WHITE);
        contentPanel.add(btnBuscar);

        JLabel lblNewLabel_1 = new JLabel("Resultados");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(249, 46, 86, 23);
        contentPanel.add(lblNewLabel_1);

        list = new JList<>();
        list.setBounds(249, 80, 321, 151);
        list.setBackground(new Color(30, 30, 30));
        list.setForeground(Color.WHITE);
        contentPanel.add(list);

        btnSeleccionarUsuario = new JButton("Seleccionar Usuario");
        btnSeleccionarUsuario.setBounds(422, 258, 148, 23);
        btnSeleccionarUsuario.setBackground(Color.RED);
        btnSeleccionarUsuario.setForeground(Color.WHITE);
        contentPanel.add(btnSeleccionarUsuario);

        btnRegresar = new JButton("Regresar");
        btnRegresar.setBounds(10, 338, 89, 23);
        btnRegresar.setBackground(Color.RED);
        btnRegresar.setForeground(Color.WHITE);
        contentPanel.add(btnRegresar);

        JLabel lblPuntaje = new JLabel("Puntaje:");
        lblPuntaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblPuntaje.setForeground(Color.WHITE);
        lblPuntaje.setBounds(21, 154, 68, 34);
        contentPanel.add(lblPuntaje);

        txtPuntaje = new JTextField();
        txtPuntaje.setBounds(95, 163, 86, 20);
        txtPuntaje.setBackground(new Color(40, 40, 40));
        txtPuntaje.setForeground(Color.WHITE);
        txtPuntaje.setSelectionColor(Color.RED);
        contentPanel.add(txtPuntaje);

        txtNivelJuego = new JTextField();
        txtNivelJuego.setBounds(137, 118, 86, 20);
        txtNivelJuego.setBackground(new Color(40, 40, 40));
        txtNivelJuego.setForeground(Color.WHITE);
        txtNivelJuego.setSelectionColor(Color.RED);
        contentPanel.add(txtNivelJuego);

        JLabel lblNivelDeJuego = new JLabel("Nivel de Juego:");
        lblNivelDeJuego.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNivelDeJuego.setForeground(Color.WHITE);
        lblNivelDeJuego.setBounds(21, 109, 140, 34);
        contentPanel.add(lblNivelDeJuego);
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

    public void setActionListener(ActionListener listener) {
        btnSeleccionarUsuario.addActionListener(listener);
        btnRegresar.addActionListener(listener);
        btnBuscar.addActionListener(listener);

        System.out.println("VISTA - GRÁFICA LISTA PARA ESCUCHAR EVENTOS");
    }
        
    public void mostrarMensaje(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void cerrar() {
        System.out.println("CERRAR - Vista GRÁFICA");
        this.dispose();
    }
    
    public void imprimirList(Usuario[] u) {    
        list.setListData(u);
    }
    
    public String getNombre() { return txtNombre.getText(); }
    public String getNivelJuego() { return txtNivelJuego.getText(); }
    public String getPuntaje() { return txtPuntaje.getText(); }
    public Usuario getUsuarioSeleccionado() { return list.getSelectedValue(); }
}
