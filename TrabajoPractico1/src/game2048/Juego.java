package game2048;

public class Juego {
	private Tablero tablero;
	
	public Juego() {
		this.tablero = new Tablero();
	}
	
	public void ApareceOtro2()
	{
		Boolean faltaColocar2o4 = true ;
		while(faltaColocar2o4)
		{
			int fila = (int) (Math.random()*4);
			int columna = (int) (Math.random()*4);
			double probabilidad = Math.random();
			if (this.tablero.getMatriz()[fila][columna].estaVacio()) 
			{
				if (probabilidad<0.1) 
				{
					this.tablero.getMatriz()[fila][columna]= new Celda(4);
					faltaColocar2o4 = false;
				}	
				else 
				{
					this.tablero.getMatriz()[fila][columna]= new Celda(2);
					faltaColocar2o4 = false;
				}		
			}	
		}
	}
	
	public boolean ganaElJuego()
	{
		boolean seEncontroUn2048 = false;
		for (int fila =0 ; fila< tablero.getTamanoDeMatriz();fila++)
			for (int columna =0 ; columna< tablero.getTamanoDeMatriz();columna++)
				if (tablero.getMatriz()[fila][columna].getValor() == 8)
					seEncontroUn2048 = true;   
		
		return seEncontroUn2048;
	}
	
	public boolean pierdeElJuego()
	{
		boolean noSePuedeSumarCeldas = true;
		
		for (int fila =0 ; fila < this.tablero.getTamanoDeMatriz() ;fila ++)
		{
			for (int columna =0 ; columna < this.tablero.getTamanoDeMatriz() ;columna ++)
			{
				if (fila ==0 && columna ==0)
				{
					if (this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila][columna+1].getValor() ||
							this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila+1][columna].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if (fila ==0 && columna ==3)
				{
					if (this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila][columna-1].getValor() ||
							this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila+1][columna].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if (fila ==3 && columna ==0)
				{
					if (this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila-1][columna].getValor() ||
							this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila][columna+1].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if (fila ==3 && columna ==3)
				{
					if (this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila][columna-1].getValor() ||
							this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila-1][columna].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if ((fila == 1 && (columna == 1 || columna == 2)) || (fila ==2 && (columna==1 || columna==2)))
				{
					if (this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila-1][columna].getValor() ||
							this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila][columna-1].getValor()||
									this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila][columna+1].getValor()||
											this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila+1][columna].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if ((fila == 0 && (columna == 1 || columna == 2)) || (fila ==3 && (columna==1 || columna==2)))
				{
					if (this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila][columna-1].getValor() ||
							this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila][columna+1].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
				
				if (( (fila == 1 || fila== 2) && columna == 0) || ((fila == 1 || fila== 2) && columna == 3))
				{
					if (this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila-1][columna].getValor() ||
							this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila+1][columna].getValor())
					{
						noSePuedeSumarCeldas = false;
					}
				}
			}		
		}
		return noSePuedeSumarCeldas;
	}

	public Tablero getTablero() {
		return tablero;
	}
	
	public void moverTodoDerecha() 
	{
		for (int fila =0 ; fila < this.tablero.getTamanoDeMatriz() ; fila++)
		{
			int bordeDerecho = this.tablero.getTamanoDeMatriz()-1;
			{
				for (int columna = this.tablero.getTamanoDeMatriz()-1; columna >= 0 ;columna --)
				{
					if (this.tablero.getMatriz()[fila][columna].estaOcupado())
					{
						if (columna<bordeDerecho)
						{
							if (this.tablero.getMatriz()[fila][columna].getValor()== this.tablero.getMatriz()[fila][bordeDerecho].getValor() || 
									this.tablero.getMatriz()[fila][bordeDerecho].estaVacio())
							{
								int suma = this.tablero.getMatriz()[fila][columna].getValor() + this.tablero.getMatriz()[fila][bordeDerecho].getValor();
								int auxValorCeldaBorde = this.tablero.getMatriz()[fila][bordeDerecho].getValor();
								int auxValorOtraCelda = this.tablero.getMatriz()[fila][columna].getValor();
								this.tablero.getMatriz()[fila][bordeDerecho].setValor(suma);
								this.tablero.getMatriz()[fila][columna].setValor(0);
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
		
		for (int fila = 0 ; fila < this.tablero.getTamanoDeMatriz() ;fila++)
		{
			int bordeIzquierdo =0 ;
			{
				for (int columna = 0 ; columna < this.tablero.getTamanoDeMatriz() ;columna++)
				{
					if (this.tablero.getMatriz()[fila][columna].estaOcupado())
					{
						if (columna>bordeIzquierdo)
						{
							if (this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[fila][bordeIzquierdo].getValor()
									|| this.tablero.getMatriz()[fila][bordeIzquierdo].estaVacio()) 
							{
								int suma = this.tablero.getMatriz()[fila][columna].getValor() + this.tablero.getMatriz()[fila][bordeIzquierdo].getValor();
								int auxValorCeldaBorde =this.tablero.getMatriz()[fila][bordeIzquierdo].getValor();
								int auxValorOtraCelda = this.tablero.getMatriz()[fila][columna].getValor();
								this.tablero.getMatriz()[fila][bordeIzquierdo].setValor(suma);
								this.tablero.getMatriz()[fila][columna].setValor(0);
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
		
		for (int columna =0 ; columna < this.tablero.getTamanoDeMatriz();columna++) 
		{
			int bordeInferior =this.tablero.getTamanoDeMatriz()-1 ;
			for (int fila = this.tablero.getTamanoDeMatriz()-1 ; fila >=0 ; fila--) 
			{
				if (this.tablero.getMatriz()[fila][columna].estaOcupado()) 
				{
					if (fila<bordeInferior) 
					{
						if (this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[bordeInferior][columna].getValor()
								|| this.tablero.getMatriz()[bordeInferior][columna].estaVacio() ) 
						{
							int suma = this.tablero.getMatriz()[bordeInferior][columna].getValor() + this.tablero.getMatriz()[fila][columna].getValor();
							int auxValorCeldaBorde = this.tablero.getMatriz()[bordeInferior][columna].getValor();
							int auxValorOtraCelda =this.tablero.getMatriz()[fila][columna].getValor();
							this.tablero.getMatriz()[bordeInferior][columna].setValor(suma);
							this.tablero.getMatriz()[fila][columna].setValor(0);
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
		
		for (int columna =0; columna< this.tablero.getTamanoDeMatriz() ;columna++) 
		{
			int bordeSuperior = 0;
			for (int fila=0 ; fila< this.tablero.getTamanoDeMatriz() ; fila++) 
			{
				if (this.tablero.getMatriz()[fila][columna].estaOcupado()) 
				{
					if (fila>bordeSuperior) 
					{
						if (this.tablero.getMatriz()[fila][columna].getValor() == this.tablero.getMatriz()[bordeSuperior][columna].getValor() 
															|| this.tablero.getMatriz()[bordeSuperior][columna].estaVacio() ) 
						{
							int suma = this.tablero.getMatriz()[bordeSuperior][columna].getValor() + this.tablero.getMatriz()[fila][columna].getValor();
							int auxValorCeldaBorde=this.tablero.getMatriz()[bordeSuperior][columna].getValor();
							int auxValorOtraCelda=this.tablero.getMatriz()[fila][columna].getValor();
							this.tablero.getMatriz()[bordeSuperior][columna].setValor(suma);
							this.tablero.getMatriz()[fila][columna].setValor(0);
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
