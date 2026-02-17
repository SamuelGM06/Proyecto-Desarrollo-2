package controlador.grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import vista.grafico.vistaConfiguracion;

public class Controlador_Configuracion implements ActionListener{
	vistaConfiguracion vista;
	
	public Controlador_Configuracion(vistaConfiguracion vista) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
		
		vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnRegresar()) {
			vista.cerrar();
		}else if (e.getSource() == vista.getBtnGuardar()) {
			int vidas = (int)vista.getSpinnerVidas().getValue();
			
			try (FileWriter fw = new FileWriter("data/config.txt")) {
	            fw.write("vidas=" + vidas);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	        vista.mostrarMensaje("Configuración guardada correctamente");
		}
	}

}
