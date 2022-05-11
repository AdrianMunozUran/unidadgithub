package atrapaLaFruta;

import java.util.ArrayList;

public class Personaje extends Elemento {
	
	public int velocidad;
	protected ArrayList<Fruta> frutas; 

	public Personaje(int x, int y, int width, int height, String imagen, char simbolo, int velocidad) {
		super(x, y, width, height, imagen, simbolo);
		this.velocidad=velocidad;
		this.frutas = new ArrayList<Fruta>();
	}
	
	public void mostrarDatos() {
		System.out.println("Personaje " + this.x + " Posición Y: " + this.y);
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
		this.x=this.x + velocidad;
	}

	public void cogerFruta(Fruta fruta) {
		this.frutas.add(fruta);
	}
	
	public boolean choque(Elemento fruta) {
		if((this.x == fruta.getX())&&(this.y==fruta.getY())){
			return true;
		}
			
		else 
			return false; 
	}
	public void mostrarFruta() {
		
	}
	


	public void mostrarResultado() {
		for (Fruta fruta: frutas) {
			fruta.mostrarDatos();
		}
			
	}
	
}



