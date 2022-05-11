package atrapaLaFruta;

public class Elemento {
	protected int x; 
	protected int y; 
	protected int width; 
	protected int height;
	protected String imagen;
	protected char simbolo; 
	// no estan implementadas las variables simbolo,sonido
	//porque no se el tipo de variable que deben ser
	public Elemento(int x, int y, int width, int height,String imagen,char simbolo) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.imagen=imagen; 
		this.simbolo=simbolo; 
	}

	
	public void setImagen(String imagen) {
		this.imagen=imagen;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void mostrarDatos() {
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}



	public char getSimbolo() {
		return simbolo;
	} 
	
}
