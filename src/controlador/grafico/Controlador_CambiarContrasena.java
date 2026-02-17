package controlador.grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Usuario;
import modelo.dao.IDAO_Usuario;
import vista.grafico.vistaCambiarContrasena;

public class Controlador_CambiarContrasena implements ActionListener{
	private Usuario usuario;
	private IDAO_Usuario modelo;
	private vistaCambiarContrasena vista;
	
	public Controlador_CambiarContrasena(vistaCambiarContrasena vista, IDAO_Usuario modelo, Usuario usuario) {
		
		this.vista = vista;
		this.modelo = modelo;
		this.usuario = usuario;
		vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnRegresar()) {
			vista.cerrar();
		}else if(e.getSource() == vista.getBtnConfirmar()) {
			actualizar();
		}
	}
	
	public void actualizar() {
	    String contraActual = vista.getContraActual();	    
	    String contraNueva = vista.getContraNueva();
	    String contraConfirmar = vista.getContraConfirmar();
	    
	    if (contraActual.equals(usuario.getPassword())) {
			if (contraNueva.equals(contraConfirmar)) {
				Usuario u = usuario;
				u.setPassword(contraConfirmar);
				if (modelo.actualizar(u)) {
			        vista.mostrarMensaje("Usuario actualizado exitosamente");
			        vista.cerrar();
			    } else {
			        vista.mostrarMensaje("Error");
			    }
			}else {
				vista.mostrarMensaje("Asegurese de confirmar bien su nueva contraseña.");
			}
		}else {
			vista.mostrarMensaje("Contraseña Incorrecta.");
		}

	    
	    
	}

}
