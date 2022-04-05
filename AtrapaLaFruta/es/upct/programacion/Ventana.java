package es.upct.programacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ventana {
	private Escenario = escenario; 
	private int ancho = 50; 
	private int alto = 50;
	
	public void mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
		int eleccion = 0; 
	
	System.out.Println("Seleccione un escenario"); 
	System.out.println("--------\n");
	System.out.println("Pulsa 1--> para escenario 1");
	System.out.println("Pulsa 2--> para escenario 2");
	System.out.println("Pulsa 3--> para escenario 3");
	System.out.println("Pulsa 4--> para escenario 4");

	eleccion = scanner.nextInt(); 
	
	switch(eleccion) {
	case 1: 
		this.escenario.crearEscenario();
		break; 
	
	case 2: 
		this.escenario.crearEscenario(); 
		break; 
		
	case 3: 
		this.escenario.crearEscenario(); 
		break; 
		
	case 4: 
		this.escenario.crearEscenario(); 
		break; 
	}

	
	}
	
	
	
	
	
	public void dibujarEscenario(ArrayList<Elemento> elementos, int WIDTH, int HEIGHT) {     
		  char[][] escenarioTextual = new char[WIDTH][HEIGHT];  
		  for (int i = 0; i < WIDTH; i++) {     
		    for (int j = 0; j < HEIGHT; j++) {           
		      if (j==0) {              
		        escenarioTextual[i][j] = '#';           
		      }else {              
		        escenarioTextual[i][j] = ' ';          
		       }        
		    }     
		  }     
		  for (Elemento elemento: elementos) {      
		      escenarioTextual[elemento.x][elemento.y] = elemento.getSimbolo();         
		  }     
		  for (int y =HEIGHT - 1; y >= 0; y--) {        
		    for (int x = 0; x < WIDTH; x++) {           
		      if (y==0) {              
		        System.out.printf("#");           
		      }else {
		        System.out.printf(Character.toString(escenarioTextual[x][y]));           
		      }        
		    }        
		    System.out.printf("\n");     
		  }  
		}
}
