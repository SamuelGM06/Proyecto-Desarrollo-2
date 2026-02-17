package vista.grafico;

import javax.swing.*;

import modelo.Usuario;

import java.awt.*;
import java.awt.event.ActionListener;

public class VistaMenu extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JButton btnInsertar;
    private JButton btnMostrar;
    private JButton btnEliminar;
    private JButton btnActualizar;
    private JButton btnConfiguracion;
    private JButton btnSalir;
    private JButton btnIniciarJuego;

   
    private JList<Usuario> listaPuntajes;

    public VistaMenu() {

        initComponent();

        setTitle("Aplicacion de Mantenimiento");
        setSize(709, 521);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void initComponent() {

        setBounds(100, 100, 687, 490);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);


        ImageIcon icon = new ImageIcon("src/imagenes/misAssets/btn/galaxyMenu.gif");
        Image img = icon.getImage().getScaledInstance(687, 490, Image.SCALE_DEFAULT);
        
        JLabel lblPuntajes = new JLabel("Puntajes");
        lblPuntajes.setForeground(Color.YELLOW);
        lblPuntajes.setFont(new Font("Dialog", Font.PLAIN, 24));
        lblPuntajes.setBounds(28, 173, 238, 39);
        contentPane.add(lblPuntajes);
        JLabel fondo = new JLabel(new ImageIcon(img));
        fondo.setBounds(0, -2, 695, 492);
        contentPane.add(fondo);

        JLabel jlMenuPrincipal = new JLabel("Geometry StarWars");
        jlMenuPrincipal.setFont(new Font("GamePocket", Font.PLAIN, 24));
        jlMenuPrincipal.setForeground(Color.YELLOW);
        jlMenuPrincipal.setBounds(225, 99, 238, 39);
        contentPane.add(jlMenuPrincipal);
        contentPane.setComponentZOrder(jlMenuPrincipal, 0);

        Color azulOscuro = new Color(0, 0, 139);

      

        btnIniciarJuego = new JButton("Iniciar Juego");
        btnIniciarJuego.setBounds(263, 168, 144, 23);
        btnIniciarJuego.setBackground(azulOscuro);
        btnIniciarJuego.setForeground(Color.YELLOW);
        btnIniciarJuego.setFont(new Font("GamePocket", Font.PLAIN, 12));
        contentPane.add(btnIniciarJuego);
        contentPane.setComponentZOrder(btnIniciarJuego, 0);

        btnInsertar = new JButton("INSERTAR");
        btnInsertar.setBounds(263, 204, 144, 23);
        btnInsertar.setBackground(azulOscuro);
        btnInsertar.setForeground(Color.YELLOW);
        btnInsertar.setFont(new Font("GamePocket", Font.PLAIN, 12));
        contentPane.add(btnInsertar);
        contentPane.setComponentZOrder(btnInsertar, 0);

        btnMostrar = new JButton("MOSTRAR");
        btnMostrar.setBounds(263, 238, 144, 23);
        btnMostrar.setBackground(azulOscuro);
        btnMostrar.setForeground(Color.YELLOW);
        btnMostrar.setFont(new Font("GamePocket", Font.PLAIN, 12));
        contentPane.add(btnMostrar);
        contentPane.setComponentZOrder(btnMostrar, 0);

        btnEliminar = new JButton("ELIMINAR");
        btnEliminar.setBounds(263, 272, 144, 23);
        btnEliminar.setBackground(azulOscuro);
        btnEliminar.setForeground(Color.YELLOW);
        btnEliminar.setFont(new Font("GamePocket", Font.PLAIN, 12));
        contentPane.add(btnEliminar);
        contentPane.setComponentZOrder(btnEliminar, 0);

        btnActualizar = new JButton("ACTUALIZAR");
        btnActualizar.setBounds(263, 307, 144, 23);
        btnActualizar.setBackground(azulOscuro);
        btnActualizar.setForeground(Color.YELLOW);
        btnActualizar.setFont(new Font("GamePocket", Font.PLAIN, 12));
        contentPane.add(btnActualizar);
        contentPane.setComponentZOrder(btnActualizar, 0);

        btnConfiguracion = new JButton("Configuracion");
        btnConfiguracion.setBounds(564, 445, 106, 29);
        btnConfiguracion.setBackground(azulOscuro);
        btnConfiguracion.setForeground(Color.YELLOW);
        btnConfiguracion.setFont(new Font("GamePocket", Font.PLAIN, 12));
        contentPane.add(btnConfiguracion);
        contentPane.setComponentZOrder(btnConfiguracion, 0);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(29, 445, 106, 29);
        btnSalir.setBackground(azulOscuro);
        btnSalir.setForeground(Color.YELLOW);
        btnSalir.setFont(new Font("GamePocket", Font.PLAIN, 12));
        contentPane.add(btnSalir);
        contentPane.setComponentZOrder(btnSalir, 0);

        JScrollPane scrollPuntajes = new JScrollPane();
        scrollPuntajes.setBounds(0, -2, 158, 170);

        contentPane.add(scrollPuntajes);
        contentPane.setComponentZOrder(scrollPuntajes, 0);
        
          
                listaPuntajes = new JList();
                scrollPuntajes.setViewportView(listaPuntajes);
                listaPuntajes.setFont(new Font("GamePocket", Font.PLAIN, 11));
                listaPuntajes.setForeground(Color.YELLOW);
                listaPuntajes.setBackground(new Color(0, 0, 40));

        

        JLabel jlCreditos = new JLabel("Créditos:");
        jlCreditos.setFont(new Font("GamePocket", Font.BOLD, 14));
        jlCreditos.setForeground(Color.YELLOW);
        jlCreditos.setBounds(263, 340, 200, 20);
        contentPane.add(jlCreditos);
        contentPane.setComponentZOrder(jlCreditos, 0);

        JLabel jlAlejandro = new JLabel("Alejandro Salazar");
        jlAlejandro.setFont(new Font("GamePocket", Font.PLAIN, 12));
        jlAlejandro.setForeground(Color.YELLOW);
        jlAlejandro.setBounds(263, 360, 200, 20);
        contentPane.add(jlAlejandro);
        contentPane.setComponentZOrder(jlAlejandro, 0);

        JLabel jlSamuel = new JLabel("Samuel Gonzales");
        jlSamuel.setFont(new Font("GamePocket", Font.PLAIN, 12));
        jlSamuel.setForeground(Color.YELLOW);
        jlSamuel.setBounds(263, 380, 200, 20);
        contentPane.add(jlSamuel);
        contentPane.setComponentZOrder(jlSamuel, 0);

        JLabel jlDylan = new JLabel("Dylan Lobo");
        jlDylan.setFont(new Font("GamePocket", Font.PLAIN, 12));
        jlDylan.setForeground(Color.YELLOW);
        jlDylan.setBounds(263, 400, 200, 20);
        contentPane.add(jlDylan);
        contentPane.setComponentZOrder(jlDylan, 0);
    }

   

public void imprimirList(Usuario[] u) {
		listaPuntajes.setListData(u);
		
	}

    public JButton getBtnInsertar() { return btnInsertar; }
    public JButton getBtnMostrar() { return btnMostrar; }
    public JButton getBtnEliminar() { return btnEliminar; }
    public JButton getBtnActualizar() { return btnActualizar; }
    public JButton getBtnConfiguracion() { return btnConfiguracion; }
    public JButton getBtnSalir() { return btnSalir; }
    public JButton getBtnIniciarJuego() { return btnIniciarJuego; }

 

    public void setActionListener(ActionListener listener) {
        btnIniciarJuego.addActionListener(listener);
        btnInsertar.addActionListener(listener);
        btnMostrar.addActionListener(listener);
        btnActualizar.addActionListener(listener);
        btnEliminar.addActionListener(listener);
        btnConfiguracion.addActionListener(listener);
        btnSalir.addActionListener(listener);
    }

    public void mostrarMensaje(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void cerrar() {
        this.dispose();
    }
}
