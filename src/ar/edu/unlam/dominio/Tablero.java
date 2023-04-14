package ar.edu.unlam.dominio;

import java.util.Iterator;

public class Tablero {

private Integer fila;
private Integer columna;
private Integer[][] tablero;
private final Integer FILA_MINIMA = 0;
private final Integer COLUMNA_MINIMA = 0;
private final Integer FILA_MAXIMA = 4;
private final Integer COLUMNA_MAXIMA = 4;

public Tablero() {
	
	this.tablero = new Integer[FILA_MAXIMA][COLUMNA_MAXIMA];
} 


public Integer filaRandom() {
	Integer filaAleatoria = 0;
	filaAleatoria = (int) (Math.random()*4);
	
	return filaAleatoria;
	
}

public Integer columnaRandom() {
	Integer columnaAleatoria = 0;
	columnaAleatoria = (int) (Math.random()*4);
	
	return columnaAleatoria;	
}

public void creacionJuego() {
	Integer filaRandom = filaRandom();
	Integer columnaRandom = columnaRandom();
	
	for (int i = 0; i < tablero.length; i++) {
		for (int j = 0; j < tablero.length; j++) {
		
			this.tablero[i][j] = 1;
			
		}
	}
	
	this.tablero[filaRandom][columnaRandom] = 0;
		
}

public void mostrarTablero() {
	creacionJuego();
	for (int i = 0; i < tablero.length; i++) {
		for (int j = 0; j < tablero.length; j++) {
		System.out.print(this.tablero[i][j] + " ");
		
		}
		System.out.println(" ");
	}

}

}
