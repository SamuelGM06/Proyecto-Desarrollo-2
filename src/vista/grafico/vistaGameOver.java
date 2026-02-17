package vista.grafico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

/**
 * @author Dylan Lobo
 * @date 17 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */
public class vistaGameOver extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnCancelar;
	private JButton btnAceptar;

	public vistaGameOver() {
		initComponent();
		setVisible(true);
	}
	public void initComponent() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Game Over");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(149, 50, 151, 36);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vover a jugar?");
		lblNewLabel_1.setBounds(162, 127, 107, 14);
		contentPanel.add(lblNewLabel_1);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(46, 202, 89, 23);
		contentPanel.add(btnCancelar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(277, 202, 89, 23);
		contentPanel.add(btnAceptar);
	}
	
	public JButton getBtnCancelar() {
		return btnCancelar;
	}
	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	public void setActionListener(ActionListener listener) {
		btnAceptar.addActionListener(listener);
		btnCancelar.addActionListener(listener);
	}
}
