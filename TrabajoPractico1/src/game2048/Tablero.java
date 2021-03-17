package game2048;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tablero 
{
	int [][] matriz;
	
	public Tablero() 
	{
		matriz = new int [4][4];       
	}
	
	public void primerSpawn()
	{
		
	}
	
	public void noSePuedeMover() 
	{
		
	}
	
	public boolean gameOver()
	{
		return true;
	}
		
	private void moverTodoDerecha() 
	{

		
	}

	private void moverTodoIzquierda() 
	{

		
	}

	private void moverTodoAbajo() 
	{

		
	}

	private void moverTodoArriba() 
	{

		
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
