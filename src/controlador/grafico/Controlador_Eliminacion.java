package controlador.grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Usuario;
import modelo.dao.IDAO_Usuario;
import vista.grafico.vistaEliminacion;

public class Controlador_Eliminacion  implements ActionListener{
	
	private Usuario usuario;
	private IDAO_Usuario modelo;
	private vistaEliminacion vista;
	
	public Controlador_Eliminacion(vistaEliminacion vista, IDAO_Usuario modelo, Usuario usuario) {
		this.usuario = usuario;
		this.modelo = modelo;
		this.vista = vista;
		
		vista.setActionListener(this);
		
		imprimirDatos();
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnEliminar()) {
			if (modelo.eliminar(usuario)) {
				vista.mostrarMensaje("Usuario eliminado correctamente");
				vista.cerrar();
			}else {
				vista.mostrarMensaje("Error al eliminar el usuario");
			}
			
		}else if (e.getSource() == vista.getBtnRegresar()) {
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
