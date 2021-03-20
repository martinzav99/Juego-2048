package game2048;

public class Celda 
{
	private Integer valor;
	
	public Celda()
	{
		valor =0;
	}
	
	public Celda(int nuevoValor)
	{
		valor = nuevoValor;
	}
	
	public boolean estaVacio() 
	{
		if (valor==0) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public  boolean estaOcupado() {
		if (valor!=0) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Integer getValor() 
	{
		return valor;
	}

	public void setValor(Integer valor) 
	{
		this.valor = valor;
	}

	

	
}
