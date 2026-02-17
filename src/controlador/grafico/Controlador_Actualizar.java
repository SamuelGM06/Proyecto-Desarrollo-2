package controlador.grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.IDAO_Usuario;
import vista.grafico.vistaActualizar;
import vista.grafico.vistaCambiarContrasena;
import vista.grafico.vistaEliminacion;


public class Controlador_Actualizar implements ActionListener{
	
	vistaActualizar vista;
	vistaCambiarContrasena vistaCambiar;
	
	IDAO_Usuario modelo;
	
	Controlador_CambiarContrasena controladorCambiar;
	
	public Controlador_Actualizar(vistaActualizar vista, IDAO_Usuario modelo) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
		this.modelo = modelo;
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnSeleccionarUsuario()) {
			
			if (vista.getUsuarioSeleccionado() == null) {
		        vista.mostrarMensaje("Debe seleccionar un usuario de la lista");
		        return;
			}else {
				vistaCambiar = new vistaCambiarContrasena(vista);
				controladorCambiar = new Controlador_CambiarContrasena(vistaCambiar, modelo, vista.getUsuarioSeleccionado());
			}
		}else if(e.getSource() == vista.getBtnRegresar()) {
			vista.cerrar();
		}else if(e.getSource() == vista.getBtnBuscar()) {
			mostrar();
			
		}
		
		
	}
	
	public void mostrar() {
		String nombre = vista.getNombre();
	    String nivelTxt = vista.getNivelJuego();
	    String puntajeTxt = vista.getPuntaje();

	    

	    int nivel = -1;
	    double puntaje = -1;

	    // validar nivel (solo si no viene vacío)
	    if (!nivelTxt.trim().isEmpty()) {
	        try {
	            nivel = Integer.parseInt(nivelTxt);
	        } catch (NumberFormatException e) {
	            vista.mostrarMensaje("El nivel debe ser un número entero.");
	            return;
	        }
	    }

	    // validar puntaje (solo si no viene vacío)
	    if (!puntajeTxt.trim().isEmpty()) {
	        try {
	            puntaje = Double.parseDouble(puntajeTxt);
	        } catch (NumberFormatException e) {
	            vista.mostrarMensaje("El puntaje debe ser un número válido.");
	            return;
	        }
	    }

	    if (modelo.mostrar(nivel, nombre, puntaje).length == 0) {
			vista.mostrarMensaje("No se econtraron coincidencias");
		}else {
			vista.imprimirList(modelo.mostrar(nivel, nombre, puntaje));
		}

	    
	}

}
