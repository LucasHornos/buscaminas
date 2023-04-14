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
		// TODO Auto-generated method stub
		Tablero tablero = new Tablero();

		/*
		 * hola dificultad seleccione casilla fila/columna
		 * 
		 */
		mostrarMensaje("Bienvenido al buscaminas");
		int opcion;
		do {
			mostrarMensaje("Elija la opcion que desee\n1.Para seleccionar la dificultad");
			opcion = teclado.nextInt();
			switch (opcion) {
			case DIFICULTAD:
				eleccionDificultad(tablero);
				break;

			default:
				mostrarMensaje("Opcion incorrecta ");
				break;
			}
		} while (opcion != 10);

		tablero.mostrarTablero();
	}

	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);

	}

	private static void eleccionDificultad(Tablero tablero) {
		int opcion;
		do {
			mostrarMensaje("1. Facil\n2. Intermedio \n3. Técnico Especialista en Desactivación de Artefactos Explosivos ");
			opcion=teclado.nextInt();
		switch (opcion) {
		case PEQUENIO:
         tablero.creacionJuegoFacil();
         tablero.mostrarTablero();
			break;

		case MEDIANO:
			 tablero.creacionJuegoMedio();
			break;

		case GRANDE:
			 tablero.creacionJuegoTécnicoEspecialistaEnDesactivaciónDeArtefactosExplosivos();
			break;
		
		default:
			mostrarMensaje("Opcion incorrecta");
			break;
		}	
		} while (opcion != 10);
		}
		
	}


