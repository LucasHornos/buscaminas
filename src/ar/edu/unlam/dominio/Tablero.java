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

public void creacionJuegoFacil() {
	
	for (int i = 0; i < tablero.length; i++) {
		for (int j = 0; j < tablero.length; j++) {
		
			this.tablero[i][j] = 1;
			
		}
	}
	
	//Genera Variable
	Integer filaRandom1 ;
	Integer columnaRandom1 ;
	
	Integer filaRandom2 ;
	Integer columnaRandom2 ;
	
	Integer filaRandom3 ;
	Integer columnaRandom3 ;

	//Asigna Valor	
	filaRandom1 = filaRandom();
	columnaRandom1 = columnaRandom();
		
	filaRandom2 = filaRandom();
	columnaRandom2 = columnaRandom();
		
	filaRandom3 = filaRandom();
	columnaRandom3 = columnaRandom();
	
if (filaRandom1 == filaRandom2 && columnaRandom1 == columnaRandom2) {
		
		if(columnaRandom2 == 3) {
			columnaRandom2--;
		} else {
			columnaRandom2++;
			if (filaRandom2 == 3) {
				filaRandom2--;
			} else {
				filaRandom2++;
			}
		}
		
 }
if (filaRandom3 == filaRandom2 && columnaRandom3 == columnaRandom2) {
		
		if(columnaRandom2 == 3) {
			columnaRandom2--;
		} else {
			columnaRandom2++;
			if (filaRandom2 == 3) {
				filaRandom2--;
			} else {
				filaRandom2++;
			}
		}
		
 }

if (filaRandom1 == filaRandom3 && columnaRandom1 == columnaRandom3) {
	
	if(columnaRandom3 == 3) {
		columnaRandom3--;
	} else {
		columnaRandom3++;
		if (filaRandom3 == 3) {
			filaRandom3--;
		} else {
			filaRandom3++;
		}
	}
	
}

this.tablero[filaRandom1][columnaRandom1] = 0;
this.tablero[filaRandom2][columnaRandom2] = 0;
this.tablero[filaRandom3][columnaRandom3] = 0;
		
}

public void mostrarTablero() {
	creacionJuegoFacil();
	for (int i = 0; i < tablero.length; i++) {
		for (int j = 0; j < tablero.length; j++) {
		System.out.print(this.tablero[i][j] + " ");
		
		}
		System.out.println(" ");
	}

}



public void comprobarCantidadBomba(Integer fila,Integer columna) {
	Integer cantidadBombas = 0;
	Integer filaReal = fila - 1;
	Integer columnaReal = columna - 1;
	
	if(this.tablero[filaReal][columnaReal] != 0) {
		
		bombasMedio(cantidadBombas, filaReal, columnaReal);
		
		esquinaSuperiorIzquierda(cantidadBombas, filaReal, columnaReal);
		
		esquinaInferiorIzquierda(cantidadBombas, filaReal, columnaReal);
		
		esquinaSuperiorDerecha(cantidadBombas, filaReal, columnaReal);
		
		esquinaInferiorDerecha(cantidadBombas, filaReal, columnaReal);

		
		
	} else {
		System.out.println("Sos un burro perdiste");
	}
	
	
}


private void esquinaInferiorDerecha(Integer cantidadBombas, Integer filaReal, Integer columnaReal) {
	if (filaReal == 4 && columnaReal == 4) {
		if (this.tablero[filaReal-1][columnaReal-1] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal-1][columnaReal] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal][columnaReal-1] == 0) {
			cantidadBombas++;
		}
	}
}


private void esquinaSuperiorDerecha(Integer cantidadBombas, Integer filaReal, Integer columnaReal) {
	if (filaReal == 0 && columnaReal == 4) {
		if (this.tablero[filaReal-1][columnaReal] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal+1][columnaReal-1] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal+1][columnaReal] == 0) {
			cantidadBombas++;
		}
	}
}


private void esquinaInferiorIzquierda(Integer cantidadBombas, Integer filaReal, Integer columnaReal) {
	if (filaReal == 4 && columnaReal == 0) {
		if (this.tablero[filaReal-1][columnaReal] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal-1][columnaReal+1] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal][columnaReal+1] == 0) {
			cantidadBombas++;
		}
	}
}


private void esquinaSuperiorIzquierda(Integer cantidadBombas, Integer filaReal, Integer columnaReal) {
	if (filaReal == 0 && columnaReal == 0) {
		if (this.tablero[filaReal][columnaReal+1] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal+1][columnaReal] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal+1][columnaReal+1] == 0) {
			cantidadBombas++;
		}
	}
}


private void bombasMedio(Integer cantidadBombas, Integer filaReal, Integer columnaReal) {
	if(filaReal != 0 && columnaReal != 0 && filaReal != 3 && columnaReal != 3 ) {
		if (this.tablero[filaReal-1][columnaReal-1] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal-1][columnaReal] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal-1][columnaReal+1] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal][columnaReal-1] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal+1][columnaReal-1] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal+1][columnaReal+1] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal+1][columnaReal] == 0) {
			cantidadBombas++;
		}
		if (this.tablero[filaReal][columnaReal+1] == 0) {
			cantidadBombas++;
		}
	}
}



}
