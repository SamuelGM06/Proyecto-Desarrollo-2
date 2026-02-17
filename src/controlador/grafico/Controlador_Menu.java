package controlador.grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import modelo.dao.IDAO_Usuario;
import vista.grafico.VistaMenu;
import vista.grafico.vistaActualizar;
import vista.grafico.vistaConfiguracion;
import vista.grafico.vistaEliminar;
import vista.grafico.vistaInsertar;
import vista.grafico.vistaMostrar;




public class Controlador_Menu implements ActionListener{
	
	IDAO_Usuario modelo;
	private ReproductorMusica musica;
	
	// Referencias a las distintas vistas del sistema
		private VistaMenu vista;
		private vistaInsertar vistaI;
		private vistaMostrar vistaM;
		private vistaActualizar vistaA;
		private vistaEliminar vistaE;
		private vistaConfiguracion vistaC;
	
		
	//controladores secundarios
		private Controlador_Insertar controladorIns;
		private Controlador_Mostrar controladorM;
		private Controlador_Actualizar controladorA;
		private Controlador_Eliminar controladorE;
		private Controlador_Configuracion controladorC;



		public Controlador_Menu(VistaMenu vista, IDAO_Usuario modelo) {
	        this.vista = vista;
	        this.modelo = modelo;
	        
			// Se registra el controlador como "oyente" (listener) 
	        // de las acciones generadas por la vista del menú.
			vista.setActionListener(this);
			vista.imprimirList(modelo.mostrar());
			musica = new ReproductorMusica();
		    musica.reproducirMusica("src/musica/StarWarsMenu.wav");
			
	    }	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnInsertar()) {
			vistaI = new vistaInsertar(vista);
			controladorIns = new Controlador_Insertar(vistaI, modelo);
		}else if(e.getSource() == vista.getBtnMostrar()) {
			vistaM = new vistaMostrar(vista);
			controladorM = new Controlador_Mostrar(vistaM, modelo);
		}else if(e.getSource() == vista.getBtnActualizar()) {
			vistaA = new vistaActualizar(vista);
			controladorA = new Controlador_Actualizar(vistaA, modelo);
		}else if(e.getSource() == vista.getBtnEliminar()) {
			vistaE = new vistaEliminar(vista);
			controladorE = new Controlador_Eliminar(vistaE, modelo);
		}else if(e.getSource() == vista.getBtnConfiguracion()) {
			vistaC = new vistaConfiguracion(vista);
			controladorC = new Controlador_Configuracion(vistaC);
		}else if(e.getSource() == vista.getBtnSalir()) {
			vista.cerrar();
			musica.detener();
		}
	}
	

}
