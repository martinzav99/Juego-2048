import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game2048.Juego;
import game2048.Tablero;

class moviemientoTest {

	@Test
	void moverTest() {
		Juego juego = new Juego();
		juego.getTablero().getMatriz()[0][0].setValor(512);
		juego.getTablero().getMatriz()[1][0].setValor(512);
		juego.getTablero().getMatriz()[2][0].setValor(1024);
		juego.getTablero().getMatriz()[3][0].setValor(1024);
		assertEquals(512,juego.getTablero().getMatriz()[0][0].getValor());
		assertEquals(1024,juego.getTablero().getMatriz()[2][0].getValor());
		
		juego.moverTodoArriba();
		assertEquals(1024, juego.getTablero().getMatriz()[0][0].getValor());
		assertEquals(2048, juego.getTablero().getMatriz()[1][0].getValor());
	}

}
