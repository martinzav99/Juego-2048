package Interfaz;
import game2048.Tablero;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EscuchaTeclado implements KeyListener {
	private Tablero tablero;
	private InterfazDeJuego interfaz;
	
	public EscuchaTeclado(Tablero tablero, InterfazDeJuego interfaz) {
		this.tablero = tablero;
		this.interfaz = interfaz;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			this.tablero.moverTodoArriba();
			this.tablero.ApareceOtro2();
			interfaz.refrescarPantalla(tablero);

	    }
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.tablero.moverTodoAbajo();
			this.tablero.ApareceOtro2();
			interfaz.refrescarPantalla(tablero);
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.tablero.moverTodoIzquierda();
			this.tablero.ApareceOtro2();
			interfaz.refrescarPantalla(tablero);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.tablero.moverTodoDerecha();
			this.tablero.ApareceOtro2();
			interfaz.refrescarPantalla(tablero);
		}	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	

}
