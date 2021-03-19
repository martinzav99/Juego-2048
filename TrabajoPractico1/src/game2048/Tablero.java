package game2048;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tablero 
{
	Celda [][] matriz;
	int borde =0;
	int grilla=0;
	
	
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
		Boolean vacio = true ;
		while(vacio)
		{
			int fila = (int) (Math.random()*4);
			int columna = (int) (Math.random()*4);
			double x = Math.random();
			if (matriz[fila][columna].estaVacio()) 
			{
				if (x<0.2) 
				{
					matriz[fila][columna]= new Celda(4);
					vacio = false;
				}	
				else 
				{
					matriz[fila][columna]= new Celda(2);
					vacio = false;
				}		
			}	
		}
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
		moviminetoVertical(1,1,"asd");
		
	}

	private void moverTodoArriba() 
	{
		for (int i =0; i<grilla ;i++) 
		{
			borde =0;
			for (int j=0 ; j<grilla ; j++)
				if (matriz[j][i].estaVacio() == false)
					moviminetoVertical(j,i,"arriba");
		}
	}	
	
	private void moviminetoHorizontal() 
	{
		
		
	}
	
	private void moviminetoVertical(int fila , int columna , String direccion) 
	{
		
	}

	
	// PASARLO AL INTERFAZ PERO NO SE DONDE 
	
	
	public void keyTyped(KeyEvent event) 
	{
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			moverTodoArriba();
			ApareceOtro2();
	    }
		if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			moverTodoAbajo();
			ApareceOtro2();
		}
		if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			moverTodoIzquierda();
			ApareceOtro2();
		}
		if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			moverTodoDerecha();
			ApareceOtro2();
		}	
		
		// SIN MENU , LO SACAMOS Y ESPAWNEAMOS DE UNA 
		if ( event.getKeyCode() == KeyEvent.VK_ENTER )
        {
			ApareceOtro2();
			ApareceOtro2();
        }
	}
	
}
