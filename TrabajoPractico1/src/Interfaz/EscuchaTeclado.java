package Interfaz;
import game2048.Juego;
import game2048.Tablero;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EscuchaTeclado implements KeyListener {
	private InterfazDeJuego interfaz;
	private Juego juego;
	
	public EscuchaTeclado(Juego juego, InterfazDeJuego interfaz) {
		this.juego = juego;
		this.interfaz = interfaz;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			this.juego.moverTodoArriba();
			this.juego.ApareceOtro2();
			interfaz.refrescarPantalla(this.juego);

	    }
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.juego.moverTodoAbajo();
			this.juego.ApareceOtro2();
			interfaz.refrescarPantalla(this.juego);
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.juego.moverTodoIzquierda();
			this.juego.ApareceOtro2();
			interfaz.refrescarPantalla(this.juego);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.juego.moverTodoDerecha();
			this.juego.ApareceOtro2();
			interfaz.refrescarPantalla(this.juego);
		}	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	

}
