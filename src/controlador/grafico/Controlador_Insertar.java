package controlador.grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Usuario;
import modelo.dao.IDAO_Usuario;
import vista.grafico.vistaInsertar;

public class Controlador_Insertar implements ActionListener{

	private vistaInsertar vista;
	
	private IDAO_Usuario modelo;
	
	public Controlador_Insertar(vistaInsertar vista, IDAO_Usuario modelo) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
		this.modelo = modelo;
		
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == vista.getBtnAgregar()) {
			
			String nombre = vista.getTxtNombreUsuario();
			String password = vista.getContra();

			
			Usuario usuario = new Usuario(nombre, password);
			
			boolean seAgrego = modelo.insertar(usuario);
			
			 if (seAgrego) {
		            vista.mostrarMensaje("Usuario agregado correctamente.");
		        } else {
		            vista.mostrarMensaje("Usuario NO fue agregado correctamente.");
		        }
		        
		        // 5. Cerrar la ventana de la vista agregar 
		        vista.dispose();
		}else if(e.getSource() == vista.getBtnRegresar()) {
			vista.cerrar();
		}
		
		
	}
}
