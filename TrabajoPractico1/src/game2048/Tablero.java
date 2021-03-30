package game2048;

import java.awt.event.KeyEvent;

public class Tablero 
{
	private Celda [][] matriz;
	private int tamanoDeMatriz = 4;
	
 
	public Tablero() 
	{
		matriz = new Celda[4][4];
		
		for (int i = 0 ; i< matriz.length;i++)
			for (int j = 0 ; j<matriz[i].length;j++)
				matriz[i][j] = new Celda();
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
