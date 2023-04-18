package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Tablero;

public class Juego {
	private static final int DIFICULTAD = 1;
	private static final int PEQUENIO = 1;
	private static final int MEDIANO = 2;
	private static final int GRANDE = 3;
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Tablero tablero = new Tablero();
		tablero.creacionJuegoFacil();
		tablero.mostrarTablero();
		comienzoJuego(tablero);
	}
		

	private static void comienzoJuego(Tablero tablero) {
		Integer noBomba = 0;
		Integer perdiste = 0;
		do {
			
			System.out.println("Seleccione una fila");
	         Integer fila = teclado.nextInt();
	         System.out.println("Seleccionar columna");
	         Integer columna = teclado.nextInt();
	         
	         if (tablero.comprobarCantidadBomba(fila, columna) == 9) {
				System.out.println("perdiste forrito");
				perdiste = 9;
			} else {
				
				
				System.out.println("La cantidad de bombas alrededor es: " + tablero.comprobarCantidadBomba(fila, columna));
				
				tablero.mostrarTablero();
				
				
				if (tablero.comprobarFinJuego(noBomba) == 13) {
					noBomba=13;
				} else {
					noBomba=0;
				}
			}
		} while (perdiste != 9 && noBomba != 13);
		
		
        
	}
		
	}