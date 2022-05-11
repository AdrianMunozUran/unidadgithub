package atrapaLaFruta;


	import java.util.ArrayList;

	public class Escenario {
		private int width;
		private int heigth;
		protected Personaje personaje; 
		protected ArrayList<Elemento> elementos;  
		private int contEfecto = 0; 
		private int contSaltar = 0; 
		
		
		public Escenario (int ancho, int alto) {
			width=ancho; 
			heigth= alto; 
			this.elementos = new ArrayList<Elemento>();
		}
		
		public ArrayList<Elemento> getElementos(){
			return elementos; 
		}
		
		public void setElementos(ArrayList<Elemento>elementos) {
			this.elementos=elementos; 
		}
		
		public void crearEscenario1() {
			this.aniadirPersonaje();
			this.aniadirFrutaDragon(5,1);
			this.aniadirFrutaPlateada(15,1);
			
		}
		
		public void aniadirPersonaje() {
			personaje=new Personaje(1,1,5,5,"mario", '0',1);
			elementos.add(personaje);	
		}
		public void aniadirFruta(int X, int Y, int width, int heigth,String imagen,String nombre,int puntos,char simbolo) {
			elementos.add(new Fruta(X,Y,width,heigth,imagen,nombre,puntos,simbolo));
		}
		
		public void aniadirFrutaDragon(int X, int Y) {
			elementos.add(new Fruta(X,Y,10,10,"FrutaDragon","Dragon", 100,'D'));
		}
		public void aniadirFrutaPlateada(int X, int Y) {
			elementos.add(new Fruta(X,Y,10,10,"imagenFrutaPlateada","Plateada",200,'P'));
			}
		
		public void mostarElementoEscenario() {
			for(Elemento elemento: elementos) {
				elemento.mostrarDatos();
				}
		}
		
		
		public void saltar() {
			this.personaje.saltar();
			this.contSaltar=1; 
		}
	
	public boolean jugando() {
		if (this.personaje.getX()<this.width -1) {
			this.personaje.avanzar();
			
			Elemento elemento_aux = null; 
			for (Elemento elemento: elementos) {
				if((elemento instanceof Fruta)&&(personaje.choque(elemento))){						
					Fruta fruta = (Fruta) elemento; 
					//falta frutaMagica
					
						personaje.cogerFruta(fruta);
						elemento_aux=elemento;
					//	break;
				}
			}
			if(elemento_aux!=null) {
				elementos.remove(elemento_aux);
			}
			return true; 
		}
			
			else {
				personaje.mostrarResultado();
				return false;
			}
		}
	}
		

	
