package controlador.grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.IDAO_Usuario;
import vista.grafico.vistaDatosUsuario;
import vista.grafico.vistaMostrar;

public class Controlador_Mostrar implements ActionListener{
	
	private IDAO_Usuario modelo;

	private vistaMostrar vista;
	private vistaDatosUsuario vistaDatos;
	
	private Controlador_DatosUsuario controladorDatos;
	
	
	
	public Controlador_Mostrar(vistaMostrar vista, IDAO_Usuario modelo) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
		this.modelo = modelo;
		
		vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnSalir()) {
			vista.cerrar();
		}else if(e.getSource() == vista.getBtnBuscar()) {
			mostrar();
		}else if(e.getSource() == vista.getBtnSeleccionarUsuario()) {
			 if (vista.getUsuarioSeleccionado() == null) {
			        vista.mostrarMensaje("Debe seleccionar un usuario de la lista");
			        return;
			 }else {
				vistaDatos = new vistaDatosUsuario(vista);
				controladorDatos = new Controlador_DatosUsuario(vistaDatos, vista.getUsuarioSeleccionado());
			 }
			
			
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
