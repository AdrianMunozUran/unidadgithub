package es.upct.programacion;

import java.util.ArrayList;

public class Escenario {
	private int weigth;
	private int heigth;
	protected Personaje personaje; 
	protected ArrayList<Elemento> elementos;  
	private int contEfecto = 0; 
	private int contSaltar = 0; 
	
	
	public Escenario (int ancho, int alto) {
		weigth=ancho; 
		heigth= alto; 
	}
	
	public ArrayList<Elemento> getElementos(){
		return elementos; 
	}
	
	public void setElementos(ArrayList<Elemento>elementos) {
		this.elementos=elementos; 
	}
}