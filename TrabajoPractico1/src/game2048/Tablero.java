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
		Boolean faltaColocar2o4 = true ;
		while(faltaColocar2o4)
		{
			int fila = (int) (Math.random()*4);
			int columna = (int) (Math.random()*4);
			double probabilidad = Math.random();
			if (matriz[fila][columna].estaVacio()) 
			{
				if (probabilidad<0.1) 
				{
					matriz[fila][columna]= new Celda(4);
					faltaColocar2o4 = false;
				}	
				else 
				{
					matriz[fila][columna]= new Celda(2);
					faltaColocar2o4 = false;
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
			int bordeDerecho =tamanoDeMatriz-1;
			{
				for (int columna = tamanoDeMatriz-1; columna >= 0 ;columna --)
				{
					if (matriz[fila][columna].estaOcupado())
					{
						if (columna<bordeDerecho)
						{
							if (matriz[fila][columna].getValor()== matriz[fila][bordeDerecho].getValor() || 
									matriz[fila][bordeDerecho].estaVacio())
							{
								int suma = matriz[fila][columna].getValor() + matriz[fila][bordeDerecho].getValor();
								int auxValorCeldaBorde = matriz[fila][bordeDerecho].getValor();
								int auxValorOtraCelda = matriz[fila][columna].getValor();
								matriz[fila][bordeDerecho].setValor(suma);
								matriz[fila][columna].setValor(0);
								if (auxValorCeldaBorde!=0 && suma == auxValorOtraCelda*2 )
								{
									System.out.println("entro derecha");
									bordeDerecho--;
									columna++;
								}
							}
							else
							{
								bordeDerecho--;
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
			int bordeIzquierdo =0 ;
			{
				for (int columna = 0 ; columna < tamanoDeMatriz ;columna++)
				{
					if (matriz[fila][columna].estaOcupado())
					{
						if (columna>bordeIzquierdo)
						{
							if (matriz[fila][columna].getValor() == matriz[fila][bordeIzquierdo].getValor()
									|| matriz[fila][bordeIzquierdo].estaVacio()) 
							{
								int suma = matriz[fila][columna].getValor() + matriz[fila][bordeIzquierdo].getValor();
								int auxValorCeldaBorde =matriz[fila][bordeIzquierdo].getValor();
								int auxValorOtraCelda = matriz[fila][columna].getValor();
								matriz[fila][bordeIzquierdo].setValor(suma);
								matriz[fila][columna].setValor(0);
								if (auxValorCeldaBorde!=0 && suma == auxValorOtraCelda*2 )
								{
									System.out.println("entro izquierda");
									bordeIzquierdo--;
									columna--;
								}
							}
							else
							{
								bordeIzquierdo++;
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
			int bordeInferior =tamanoDeMatriz-1 ;
			for (int fila = tamanoDeMatriz-1 ; fila >=0 ; fila--) 
			{
				if (matriz[fila][columna].estaOcupado()) 
				{
					if (fila<bordeInferior) 
					{
						if (matriz[fila][columna].getValor() == matriz[bordeInferior][columna].getValor()
								|| matriz[bordeInferior][columna].estaVacio() ) 
						{
							int suma = matriz[bordeInferior][columna].getValor() + matriz[fila][columna].getValor();
							int auxValorCeldaBorde = matriz[bordeInferior][columna].getValor();
							int auxValorOtraCelda =matriz[fila][columna].getValor();
							matriz[bordeInferior][columna].setValor(suma);
							matriz[fila][columna].setValor(0);
							if (auxValorCeldaBorde!=0 && suma == auxValorOtraCelda*2 )
							{
								System.out.println("entro abajo");
								bordeInferior--;
								fila++;
							}
						}
						else
						{
							bordeInferior--;
							fila++;
						}
					}
				}	
			}
			
		}
	}

	public void moverTodoArriba() 
	{
		
		for (int columna =0; columna<tamanoDeMatriz ;columna++) 
		{
			int bordeSuperior = 0;
			for (int fila=0 ; fila<tamanoDeMatriz ; fila++) 
			{
				if (matriz[fila][columna].estaOcupado()) 
				{
					if (fila>bordeSuperior) 
					{
						if (matriz[fila][columna].getValor() == matriz[bordeSuperior][columna].getValor() 
															|| matriz[bordeSuperior][columna].estaVacio() ) 
						{
							int suma = matriz[bordeSuperior][columna].getValor() + matriz[fila][columna].getValor();
							int auxValorCeldaBorde=matriz[bordeSuperior][columna].getValor();
							int auxValorOtraCelda=matriz[fila][columna].getValor();
							matriz[bordeSuperior][columna].setValor(suma);
							matriz[fila][columna].setValor(0);
							if (auxValorCeldaBorde!=0 && suma == auxValorOtraCelda*2 )
							{
								System.out.println("entro arriba");
								bordeSuperior++;
								fila--;
							}
						}
						else
						{
							bordeSuperior++;
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
}
