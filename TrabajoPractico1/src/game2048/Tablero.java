package game2048;

import java.awt.event.KeyEvent;

public class Tablero 
{
	private Celda [][] matriz;
	private int tamanoDeMatriz = 4;
	
 
	public Tablero() 
	{
		matriz = new Celda[tamanoDeMatriz][tamanoDeMatriz];
		
		for (int fila = 0 ; fila< tamanoDeMatriz;fila++)
			for (int columna = 0 ; columna<matriz[fila].length;columna++)
				matriz[fila][columna] = new Celda();
	}
	
	public Celda[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Celda[][] matriz) {
		this.matriz = matriz;
	}
	
	public int getTamanoDeMatriz() {
		return tamanoDeMatriz;
	}

	

}
