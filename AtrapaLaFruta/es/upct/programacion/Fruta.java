package atrapaLaFruta;

public class Fruta extends Elemento {
	private String nombre;
	private int puntos;

	public Fruta(int x, int y, int width, int height,String imagen,String nombre,int puntos,char simbolo) {
		super(x, y, width, height,imagen,simbolo);
		this.nombre=nombre; 
		this.puntos=puntos;
	}
	
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
		public String mostrarDatos() {
			String frase = super.mostrarDatos();
			String frase2 = frase + "Otros de msi datos son: " + nombre;
			return frase2;
			}
	
	
}
