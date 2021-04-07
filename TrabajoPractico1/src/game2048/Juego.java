package game2048;

public class Juego {
	private Tablero tablero;
	
	public Juego() {
		this.tablero = new Tablero();
	}
	
	public Tablero getTablero() {
		return tablero;
	}
	
	public void ApareceOtro2()
	{
		if (existeCeldaLibre()) 
		{
			Boolean faltaColocar2o4 = true ;
			while(faltaColocar2o4)
			{
				int fila = (int) (Math.random()*4);
				int columna = (int) (Math.random()*4); 
				double probabilidad = Math.random();
				if (tablero.getMatriz()[fila][columna].estaVacio()) 
				{
					if (probabilidad<0.1) 
					{
						tablero.getMatriz()[fila][columna]= new Celda(4);
						faltaColocar2o4 = false;
					}	
					else 
					{
						tablero.getMatriz()[fila][columna]= new Celda(2);
						faltaColocar2o4 = false;
					}		
				}	
			}
		}
	}
	
	public boolean existeCeldaLibre()
	{
		boolean seEncontroCeldaVacia = false;
		for (int fila =0 ; fila< tablero.getTamanoDeMatriz();fila++)
			for (int columna =0 ; columna< tablero.getTamanoDeMatriz();columna++)
				if (tablero.getMatriz()[fila][columna].estaVacio())
					seEncontroCeldaVacia = true;
		
		return seEncontroCeldaVacia;
	}
	
	public boolean ganaElJuego()
	{
		boolean seEncontroUn2048 = false;
		for (int fila =0 ; fila< tablero.getTamanoDeMatriz();fila++)
			for (int columna =0 ; columna< tablero.getTamanoDeMatriz();columna++)	
				if (tablero.getMatriz()[fila][columna].getValor() == 256)
					seEncontroUn2048 = true;   	
		return seEncontroUn2048;
	}
	
	public boolean pierdeElJuego()
	{
		boolean noSePuedeSumarCeldas = true;
		
		for (int fila =0 ; fila < tablero.getTamanoDeMatriz() ;fila ++)
		{
			for (int columna =0 ; columna < tablero.getTamanoDeMatriz() ;columna ++)
			{
				if (fila ==0 && columna ==0)
				{
					if (tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila][columna+1].getValor() ||
							tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila+1][columna].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if (fila ==0 && columna ==3)
				{
					if (tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila][columna-1].getValor() ||
							tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila+1][columna].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if (fila ==3 && columna ==0)
				{
					if (tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila-1][columna].getValor() ||
							tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila][columna+1].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if (fila ==3 && columna ==3)
				{
					if (tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila][columna-1].getValor() ||
							tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila-1][columna].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if ((fila == 1 && (columna == 1 || columna == 2)) || (fila ==2 && (columna==1 || columna==2)))
				{
					if (tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila-1][columna].getValor() ||
							tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila][columna-1].getValor()||
									tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila][columna+1].getValor()||
											tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila+1][columna].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if ((fila == 0 && (columna == 1 || columna == 2)) || (fila ==3 && (columna==1 || columna==2)))
				{
					if (tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila][columna-1].getValor() ||
							tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila][columna+1].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if (( (fila == 1 || fila== 2) && columna == 0) || ((fila == 1 || fila== 2) && columna == 3))
				{
					if (tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila-1][columna].getValor() ||
							tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila+1][columna].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
			}		
		}
		return noSePuedeSumarCeldas;
	}
	
	public void moverTodoDerecha() 
	{
		for (int fila =0 ; fila < tablero.getTamanoDeMatriz() ; fila++)
		{
			int bordeDerecho = tablero.getTamanoDeMatriz()-1;
			{
				for (int columna = tablero.getTamanoDeMatriz()-1; columna >= 0 ;columna --)
				{
					if (tablero.getMatriz()[fila][columna].estaOcupado())
					{
						if (columna<bordeDerecho)
						{
							if (tablero.getMatriz()[fila][columna].getValor()== tablero.getMatriz()[fila][bordeDerecho].getValor() || 
									tablero.getMatriz()[fila][bordeDerecho].estaVacio())
							{	
								int suma = tablero.getMatriz()[fila][columna].getValor() + tablero.getMatriz()[fila][bordeDerecho].getValor();			
								
								int auxValorCeldaBorde = tablero.getMatriz()[fila][bordeDerecho].getValor();
								int auxValorOtraCelda = tablero.getMatriz()[fila][columna].getValor();
								tablero.getMatriz()[fila][bordeDerecho].setValor(suma);
								tablero.getMatriz()[fila][columna].setValor(0);
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
		
		for (int fila = 0 ; fila < tablero.getTamanoDeMatriz() ;fila++)
		{
			int bordeIzquierdo =0 ;
			{
				for (int columna = 0 ; columna < tablero.getTamanoDeMatriz() ;columna++)
				{
					if (tablero.getMatriz()[fila][columna].estaOcupado())
					{
						if (columna>bordeIzquierdo)
						{
							if (tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[fila][bordeIzquierdo].getValor()
									|| tablero.getMatriz()[fila][bordeIzquierdo].estaVacio()) 
							{
								int suma = tablero.getMatriz()[fila][columna].getValor() + tablero.getMatriz()[fila][bordeIzquierdo].getValor();
								int auxValorCeldaBorde =tablero.getMatriz()[fila][bordeIzquierdo].getValor();
								int auxValorOtraCelda = tablero.getMatriz()[fila][columna].getValor();
								tablero.getMatriz()[fila][bordeIzquierdo].setValor(suma);
								tablero.getMatriz()[fila][columna].setValor(0);
								if (auxValorCeldaBorde!=0 && suma == auxValorOtraCelda*2 )
								{
									System.out.println("entro izquierda");
									bordeIzquierdo++; 
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
		
		for (int columna =0 ; columna < tablero.getTamanoDeMatriz();columna++) 
		{
			int bordeInferior =tablero.getTamanoDeMatriz()-1 ;
			for (int fila = tablero.getTamanoDeMatriz()-1 ; fila >=0 ; fila--) 
			{
				if (tablero.getMatriz()[fila][columna].estaOcupado()) 
				{
					if (fila<bordeInferior) 
					{
						if (tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[bordeInferior][columna].getValor()
								|| tablero.getMatriz()[bordeInferior][columna].estaVacio() ) 
						{
							int suma = tablero.getMatriz()[bordeInferior][columna].getValor() + tablero.getMatriz()[fila][columna].getValor();
							int auxValorCeldaBorde = tablero.getMatriz()[bordeInferior][columna].getValor();
							int auxValorOtraCelda =tablero.getMatriz()[fila][columna].getValor();
							tablero.getMatriz()[bordeInferior][columna].setValor(suma);
							tablero.getMatriz()[fila][columna].setValor(0);
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
		
		for (int columna =0; columna< tablero.getTamanoDeMatriz() ;columna++) 
		{
			int bordeSuperior = 0;
			for (int fila=0 ; fila< tablero.getTamanoDeMatriz() ; fila++) 
			{
				if (tablero.getMatriz()[fila][columna].estaOcupado()) 
				{
					if (fila>bordeSuperior) 
					{
						if (tablero.getMatriz()[fila][columna].getValor() == tablero.getMatriz()[bordeSuperior][columna].getValor() 
															|| tablero.getMatriz()[bordeSuperior][columna].estaVacio() ) 
						{
							int suma = tablero.getMatriz()[bordeSuperior][columna].getValor() + tablero.getMatriz()[fila][columna].getValor();
							int auxValorCeldaBorde=tablero.getMatriz()[bordeSuperior][columna].getValor();
							int auxValorOtraCelda=tablero.getMatriz()[fila][columna].getValor();
							tablero.getMatriz()[bordeSuperior][columna].setValor(suma);
							tablero.getMatriz()[fila][columna].setValor(0);
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
	
}
