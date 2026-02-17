package controlador.grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Usuario;
import vista.grafico.vistaDatosUsuario;
import vista.grafico.vistaMostrar;

public class Controlador_DatosUsuario  implements ActionListener{
	private Usuario usuario;
	
	private vistaDatosUsuario vista;
	private vistaMostrar vistaM;
	
	public Controlador_DatosUsuario(vistaDatosUsuario vista,Usuario usuario) {
		this.vista = vista;
		this.usuario = usuario;
		
		vista.setActionListener(this);
		
		imprimirDatos();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnRegresar()) {
			vista.cerrar();
		}
		
	}
	
	public void imprimirDatos() {
		vista.setId(String.valueOf(usuario.getIdOficial()));
		vista.setNombre(usuario.getNombreUsuario());
		vista.setPassword(usuario.getPassword());
		vista.setPuntaje(String.valueOf(usuario.getPuntaje()));
	}

}
