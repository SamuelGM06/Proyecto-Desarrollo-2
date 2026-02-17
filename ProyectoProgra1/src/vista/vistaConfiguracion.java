package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JLabel;

/**
 * @author Dylan Lobo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */
public class vistaConfiguracion extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	
	public vistaConfiguracion() {
		initComponent();
	}
	public void initComponent() {
		setBounds(100, 100, 645, 411);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vidas: ");
		lblNewLabel.setBounds(46, 49, 46, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Velocidad de la nave");
		lblNewLabel_1.setBounds(47, 93, 136, 35);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de arma");
		lblNewLabel_2.setBounds(46, 168, 89, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dificultad");
		lblNewLabel_3.setBounds(46, 227, 46, 14);
		contentPanel.add(lblNewLabel_3);
		
		JSpinner SpinnerVidas = new JSpinner();
		SpinnerVidas.setBounds(211, 46, 120, 20);
		contentPanel.add(SpinnerVidas);
		
		JButton btnVelLow = new JButton("Lenta");
		btnVelLow.setBounds(211, 99, 89, 23);
		contentPanel.add(btnVelLow);
		
		JButton btnVelNormal = new JButton("Normal");
		btnVelNormal.setBounds(356, 99, 89, 23);
		contentPanel.add(btnVelNormal);
		
		JButton btnVelHigh = new JButton("Rapida");
		btnVelHigh.setBounds(498, 99, 89, 23);
		contentPanel.add(btnVelHigh);
		
		JButton btnNewButton = new JButton("Balas");
		btnNewButton.setBounds(250, 164, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Bombas");
		btnNewButton_1.setBounds(446, 164, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JButton btnDiffEasy = new JButton("Facil");
		btnDiffEasy.setBounds(211, 223, 89, 23);
		contentPanel.add(btnDiffEasy);
		
		JButton btnDiffNormal = new JButton("Normal");
		btnDiffNormal.setBounds(356, 223, 89, 23);
		contentPanel.add(btnDiffNormal);
		
		JButton btnDiffHard = new JButton("Dificil");
		btnDiffHard.setBounds(498, 223, 89, 23);
		contentPanel.add(btnDiffHard);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(119, 301, 89, 23);
		contentPanel.add(btnRegresar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(446, 301, 89, 23);
		contentPanel.add(btnGuardar);
	}
}
