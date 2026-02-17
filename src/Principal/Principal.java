package Principal;


import controlador.grafico.Controlador_Menu;
import modelo.dao.archivoJSON.DAO_Usuario;
import modelo.dataset.ListaUsuarios;
import vista.grafico.VistaMenu;

public class Principal {
	
	private ListaUsuarios dataset;

	public static void main(String[] args) {
		
		Principal principal = new Principal();
		principal.iniciar();
	}
	
	public void iniciar() {
			
		dataset = new ListaUsuarios();
		DAO_Usuario modelo = new DAO_Usuario(dataset);
		
		VistaMenu vista = new VistaMenu();
		Controlador_Menu controlador = new Controlador_Menu(vista, modelo);

	}

}
