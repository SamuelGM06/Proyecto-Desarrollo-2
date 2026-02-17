package vista.grafico;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

public class vistaConfiguracion extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JComboBox CB_VelocidadNave;
    private JComboBox comboBox;
    private JSpinner SpinnerVidas;
    private JButton btnRegresar;
    private JButton btnGuardar;
    private JTextField txtDummy; // Para el ejemplo de campos de texto

    // Color Azul R2-D2
    private final Color AZUL_R2 = new Color(30, 144, 255);

    public vistaConfiguracion(JFrame parent) {
        super(parent);
        initComponent();

        setTitle("Configuracion del juego");
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initComponent() {
        setBounds(100, 100, 645, 411);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        contentPanel.setBackground(Color.WHITE); 
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        
     
        JLabel lblFrase = new JLabel("Configúrate como R2-D2");
        lblFrase.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblFrase.setForeground(AZUL_R2);
        lblFrase.setBounds(180, 10, 300, 25);
        contentPanel.add(lblFrase);

        JLabel lblNewLabel = new JLabel("Vidas: ");
        lblNewLabel.setBounds(46, 49, 46, 14);
        lblNewLabel.setForeground(AZUL_R2);
        contentPanel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Velocidad de la nave");
        lblNewLabel_1.setBounds(47, 93, 136, 35);
        lblNewLabel_1.setForeground(AZUL_R2);
        contentPanel.add(lblNewLabel_1);

        JLabel lblNewLabel_3 = new JLabel("Dificultad");
        lblNewLabel_3.setBounds(46, 175, 46, 14);
        lblNewLabel_3.setForeground(AZUL_R2);
        contentPanel.add(lblNewLabel_3);

        SpinnerVidas = new JSpinner();
        SpinnerVidas.setBounds(211, 46, 120, 20);
        SpinnerVidas.getEditor().getComponent(0).setForeground(AZUL_R2); 
        SpinnerVidas.setBackground(Color.WHITE);
        contentPanel.add(SpinnerVidas);

        btnRegresar = new JButton("Regresar");
        btnRegresar.setBounds(119, 301, 89, 23);
        btnRegresar.setBackground(new Color(0, 102, 204));
        btnRegresar.setForeground(Color.WHITE);
        contentPanel.add(btnRegresar);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(446, 301, 89, 23);
        btnGuardar.setBackground(new Color(0, 102, 204));
        btnGuardar.setForeground(Color.WHITE);
        contentPanel.add(btnGuardar);

        CB_VelocidadNave = new JComboBox();
        CB_VelocidadNave.setModel(new DefaultComboBoxModel(new String[] {"Rapida", "Moderada", "Lenta"}));
        CB_VelocidadNave.setBounds(211, 99, 115, 22);
        CB_VelocidadNave.setForeground(AZUL_R2);
        CB_VelocidadNave.setBackground(Color.WHITE);
        contentPanel.add(CB_VelocidadNave);

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Facil", "Normal", "Dificil"}));
        comboBox.setBounds(211, 171, 115, 22);
        comboBox.setForeground(AZUL_R2);
        comboBox.setBackground(Color.WHITE);
        contentPanel.add(comboBox);
    }

    public JComboBox getCB_VelocidadNave() {
        return CB_VelocidadNave;
    }


    public JComboBox getComboBox() {
        return comboBox;
    }

    public JSpinner getSpinnerVidas() {
        return SpinnerVidas;
    }

    public JButton getBtnRegresar() {
        return btnRegresar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }
    public void setActionListener(ActionListener listener) {
        btnGuardar.addActionListener(listener);
        btnRegresar.addActionListener(listener);
    }

    public void mostrarMensaje(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void cerrar() {
        System.out.println("CERRAR - Vista GRÁFICA");
        this.dispose();
    }
}
