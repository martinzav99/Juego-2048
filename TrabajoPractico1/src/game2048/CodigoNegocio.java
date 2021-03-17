package game2048;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CodigoNegocio 
{
	int [][] matriz;
	boolean [][] matrizBoolean;
	
	
	public CodigoNegocio() 
	{
		matriz = new int [4][4];
		matrizBoolean = new boolean [4][4];
	       
	}
	
	public ArrayList<Tupla<Integer,Integer>> lugaresVacios(boolean[][] m)
	{
		ArrayList <Tupla<Integer,Integer>> guarda = new ArrayList<Tupla<Integer,Integer>>();
		for (int i = 0 ; i< m.length ; i++)
			for (int j = 0 ; j< m.length ; j++)
				if (m[i][j] == false)
					guarda.add(new Tupla<Integer,Integer>(i,j));
		
		return guarda;
	}
	
	public void ocuparLugar (int[][]mtx,boolean[][]bmtx)
	{
		List<Integer> lista = Arrays.asList(2, 4);
        Random aleatorio = new Random();
        int Dos_o_Cuatro = lista.get(aleatorio.nextInt(lista.size()));
        
        Tupla<Integer,Integer> lugarElegido =lugaresVacios(bmtx).get(aleatorio.nextInt());
        mtx[lugarElegido.x][lugarElegido.y] = Dos_o_Cuatro;
        bmtx[lugarElegido.x][lugarElegido.y] = true;
	}
	
	public int dos_o_Cuatro() 
	{
		List<Integer> lista = Arrays.asList(2, 4);
        Random aleatorio = new Random();
        int Dos_o_Cuatro = lista.get(aleatorio.nextInt(lista.size()));
        
        return Dos_o_Cuatro;
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
	
	private void moverTodoDerecha() {
		// TODO Auto-generated method stub
		
	}

	private void moverTodoIzquierda() {
		// TODO Auto-generated method stub
		
	}

	private void moverTodoAbajo() {
		// TODO Auto-generated method stub
		
	}

	private void moverTodoArriba() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) 
	{
		
	}

}
