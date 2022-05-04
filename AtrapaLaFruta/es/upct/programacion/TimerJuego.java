package atrapaLaFruta;
import java.util.TimerTask;

public class TimerJuego extends TimerTask {

	
	private final Ventana ventana;

	public TimerJuego(Ventana ventana) {
	this.ventana = ventana;
	}

	public void run() {
		if(!ventana.jugando()) {
			cancel();
			System.exit(0);
		}

	//Método que será ejecutado cada 200 milisegundos
	// Para cancelar el timer podéis utilizar: "cancel();"

	}



	}

