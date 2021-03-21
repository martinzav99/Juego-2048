package game2048;

import java.awt.event.KeyEvent;

public class Tablero 
{
	Celda [][] matriz;
	int tamanoDeMatriz = 4;
	
	
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
	
		
	private void moverTodoDerecha() 
	{
		int borde =tamanoDeMatriz-1;
		for (int fila =0 ; fila < tamanoDeMatriz ; fila++)
		{
			for (int columna = tamanoDeMatriz-1; columna >= 0 ;columna --)
			{
				if (matriz[fila][columna].estaOcupado())
				{
					if (matriz[fila][columna]!=matriz[fila][borde])
					{
						if (matriz[fila][columna].getValor()== matriz[fila][columna+1].getValor() || 
								matriz[fila][columna+1].estaVacio())
						{
							int suma = matriz[fila][columna].getValor() + matriz[fila][columna+1].getValor();
							matriz[fila][columna+1].setValor(suma);
							matriz[fila][columna].setValor(0);
						}
					}
				}
			}
		}
	}

	private void moverTodoIzquierda() 
	{
		int borde =0 ;
		for (int fila = 0 ; fila < tamanoDeMatriz ;fila++)
		{
			for (int columna = 0 ; columna < tamanoDeMatriz ;columna++)
			{
				if (matriz[fila][columna].estaOcupado())
				{
					if (matriz[fila][columna]!=matriz[fila][borde])
					{
						if (matriz[fila][columna].getValor() == matriz[fila][columna-1].getValor()
								|| matriz[fila][columna-1].estaVacio()) 
						{
							int suma = matriz[fila][columna].getValor() + matriz[fila][columna-1].getValor();
							matriz[fila-1][columna].setValor(suma);
							matriz[fila][columna].setValor(0);
						}
					}
				}
			}
		}
	}

	private void moverTodoAbajo() 
	{
		int borde =tamanoDeMatriz-1 ;
		for (int columna =0 ; columna < tamanoDeMatriz;columna++) 
		{
			for (int fila = tamanoDeMatriz-1 ; fila >=0 ; fila--) 
			{
				if (matriz[fila][columna].estaOcupado()) 
				{
					if (matriz[fila][columna]!=matriz[borde][columna]) 
					{
						if (matriz[fila][columna].getValor() == matriz[fila+1][columna].getValor()
								|| matriz[fila+1][columna].estaVacio() ) 
						{
							int suma = matriz[fila+1][columna].getValor() + matriz[fila][columna].getValor();
							matriz[fila+1][columna].setValor(suma);
							matriz[fila][columna].setValor(0);
						}
					}
				}	
			}
			
		}
	}

	private void moverTodoArriba() 
	{
		int borde = 0;
		for (int columna =0; columna<tamanoDeMatriz ;columna++) 
		{
			for (int fila=tamanoDeMatriz ; fila<0 ; fila++) 
			{
				if (matriz[fila][columna].estaOcupado()) 
				{
					if (matriz[fila][columna]!=matriz[borde][columna]) 
					{
						if (matriz[fila][columna].getValor() == matriz[fila-1][columna].getValor() 
															|| matriz[fila-1][columna].estaVacio() ) 
						{
							int suma = matriz[fila-1][columna].getValor() + matriz[fila][columna].getValor();
							matriz[fila-1][columna].setValor(suma);
							matriz[fila][columna].setValor(0);
						}
					}
				}
			}				
		}
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
