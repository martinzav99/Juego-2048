package game2048;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tablero 
{
	Celda [][] matriz;
	
	public Tablero() 
	{
		matriz = new Celda[4][4];
		
		for (int i = 0 ; i< matriz.length;i++)
			for (int j = 0 ; i< matriz[i].length;j++)
				matriz[i][j] = new Celda();
	}
	
	public Celda[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Celda[][] matriz) {
		this.matriz = matriz;
	}

	public void ApareceOtro2()
	{
				
	}
	
	public boolean gameOver()
	{
		return true;
	}
	
	public void reiniciar() 
	{
		
	}
		
	private void moverTodoDerecha() 
	{
		moviminetoHorizontal();
	}

	private void moverTodoIzquierda() 
	{
		moviminetoHorizontal();
	}

	private void moverTodoAbajo() 
	{
		moviminetoVertical();
		
	}

	private void moverTodoArriba() 
	{
		moviminetoVertical();
	}

	
	private void moviminetoHorizontal() {
		// TODO Auto-generated method stub
		
	}
	
	private void moviminetoVertical() {
		// TODO Auto-generated method stub
		
	}

	
	public void keyTyped(KeyEvent event) 
	{
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			moverTodoArriba();
	    }
		if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			moverTodoAbajo();
		}
		if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			moverTodoIzquierda();
		}
		if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			moverTodoDerecha();
		}
	}
	
}
