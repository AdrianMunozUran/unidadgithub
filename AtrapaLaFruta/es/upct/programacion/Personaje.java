package es.upct.programacion;

import java.util.ArrayList;

public class Personaje extends Elemento {
	
	public int velocidad;
	protected ArrayList<Fruta> frutas; 

	public Personaje(int x, int y, int width, int height, String imagen, char simbolo, int velocidad) {
		super(x, y, width, height, imagen, simbolo);
		this.velocidad=velocidad;
	}

	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad=velocidad; 
	}
	public void saltar() {
		
	}
	
	public void avanzar() {
		
	}

	public void cogerFruta() {
		
	}
	
	public void choque() {
	}
	public void mostrarFruta() {
		
	}
}



