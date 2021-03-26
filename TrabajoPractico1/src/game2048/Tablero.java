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
			for (int j = 0 ; j<matriz[i].length;j++)
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
	
		
	public void moverTodoDerecha() 
	{
		for (int fila =0 ; fila < tamanoDeMatriz ; fila++)
		{
			int borde =tamanoDeMatriz-1;
			{
				for (int columna = tamanoDeMatriz-1; columna >= 0 ;columna --)
				{
					if (matriz[fila][columna].estaOcupado())
					{
						if (columna<borde)
						{
							if (matriz[fila][columna].getValor()== matriz[fila][borde].getValor() || 
									matriz[fila][borde].estaVacio())
							{
								int suma = matriz[fila][columna].getValor() + matriz[fila][borde].getValor();
								matriz[fila][borde].setValor(suma);
								matriz[fila][columna].setValor(0);
							}
							else
							{
								borde--;
								columna++;
							}
						}
					}	
				}
			}
		}
	}
	
	

	public void moverTodoIzquierda() 
	{
		
		for (int fila = 0 ; fila < tamanoDeMatriz ;fila++)
		{
			int borde =0 ;
			{
				for (int columna = 0 ; columna < tamanoDeMatriz ;columna++)
				{
					if (matriz[fila][columna].estaOcupado())
					{
						if (columna>borde)
						{
							if (matriz[fila][columna].getValor() == matriz[fila][borde].getValor()
									|| matriz[fila][borde].estaVacio()) 
							{
								int suma = matriz[fila][columna].getValor() + matriz[fila][borde].getValor();
								matriz[fila][borde].setValor(suma);
								matriz[fila][columna].setValor(0);
							}
							else
							{
								borde++;
								columna--;
							}
						}
					}
				}
			}
		}
	}

	public void moverTodoAbajo() 
	{
		
		for (int columna =0 ; columna < tamanoDeMatriz;columna++) 
		{
			int borde =tamanoDeMatriz-1 ;
			for (int fila = tamanoDeMatriz-1 ; fila >=0 ; fila--) 
			{
				if (matriz[fila][columna].estaOcupado()) 
				{
					if (fila<borde) 
					{
						if (matriz[fila][columna].getValor() == matriz[borde][columna].getValor()
								|| matriz[borde][columna].estaVacio() ) 
						{
							int suma = matriz[borde][columna].getValor() + matriz[fila][columna].getValor();
							matriz[borde][columna].setValor(suma);
							matriz[fila][columna].setValor(0);
						}
						else
						{
							borde--;
							fila++;
						}
					}
				}	
			}
			
		}
	}

	public void moverTodoArriba() 
	{
		int borde = 0;
		for (int columna =0; columna<tamanoDeMatriz ;columna++) 
		{
			for (int fila=0 ; fila<tamanoDeMatriz ; fila++) 
			{
				if (matriz[fila][columna].estaOcupado()) 
				{
					if (fila>borde) 
					{
						if (matriz[fila][columna].getValor() == matriz[borde][columna].getValor() 
															|| matriz[borde][columna].estaVacio() ) 
						{
							int suma = matriz[borde][columna].getValor() + matriz[fila][columna].getValor();
							matriz[borde][columna].setValor(suma);
							matriz[fila][columna].setValor(0);
						}
						else
						{
							borde++;
							fila--;
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
	
	/*
	public void ordenarFilaParaDerecha(int fila ,int columna, int puntero)
	{
		Celda celdaPuntero = matriz[fila][puntero];
		Celda otraCelda = matriz[fila][columna];
		
		if (celdaPuntero.estaVacio() || celdaPuntero.getValor() == otraCelda.getValor()) 
		{
			int suma = celdaPuntero.getValor() + otraCelda.getValor();
			celdaPuntero.setValor(suma);
			otraCelda.setValor(0);
		}
		else
		{
			puntero--;
			ordenarFilaParaDerecha(fila,columna,puntero);
		}
	}
	*/
	
}
