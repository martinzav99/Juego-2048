package game2048;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazDeJuego {

	private JFrame frame;
	private JTextField fila0columna0;
	private JTextField fila0columna1;
	private JTextField fila0columna2;
	private JTextField fila0columna3;
	private JTextField fila1columna0;
	private JTextField fila2columna0;
	private JTextField fila3columna0;
	private JTextField fila1columna1;
	private JTextField fila2columna1;
	private JTextField fila3columna1;
	private JTextField fila1columna2;
	private JTextField fila2columna2;
	private JTextField fila3columna2;
	private JTextField fila1columna3;
	private JTextField fila2columna3;
	private JTextField fila3columna3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazDeJuego window = new InterfazDeJuego();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazDeJuego() {
		try 
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (Exception e) 
		{

			e.printStackTrace();
		}
	
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Tablero tablero = new Tablero();
		tablero.ApareceOtro2();
		tablero.ApareceOtro2();
		frame.getContentPane().setLayout(null);
			
		fila0columna0 = new JTextField();
		fila0columna0.setBounds(34, 49, 86, 20);
		fila0columna0.setEditable(false);
		frame.getContentPane().add(fila0columna0);
		fila0columna0.setColumns(10);
		fila0columna0.setText(tablero.matriz[0][0].getValor().toString());
		
		
		fila0columna1 = new JTextField();
		fila0columna1.setBounds(130, 49, 86, 20);
		fila0columna1.setEditable(false);
		fila0columna1.setColumns(10);
		frame.getContentPane().add(fila0columna1);
		fila0columna1.setText(tablero.matriz[0][1].getValor().toString());
		
		fila0columna2 = new JTextField();
		fila0columna2.setBounds(226, 49, 86, 20);
		fila0columna2.setEditable(false);
		fila0columna2.setColumns(10);
		frame.getContentPane().add(fila0columna2);
		fila0columna2.setText(tablero.matriz[0][2].getValor().toString());
		
		fila0columna3 = new JTextField();
		fila0columna3.setBounds(322, 49, 86, 20);
		fila0columna3.setEditable(false);
		fila0columna3.setColumns(10);
		frame.getContentPane().add(fila0columna3);
		fila0columna3.setText(tablero.matriz[0][3].getValor().toString());
		
		fila1columna0 = new JTextField();
		fila1columna0.setBounds(34, 80, 86, 20);
		fila1columna0.setEditable(false);
		fila1columna0.setColumns(10);
		frame.getContentPane().add(fila1columna0);
		fila1columna0.setText(tablero.matriz[1][0].getValor().toString());
		
		fila2columna0 = new JTextField();
		fila2columna0.setBounds(34, 111, 86, 20);
		fila2columna0.setEditable(false);
		fila2columna0.setColumns(10);
		frame.getContentPane().add(fila2columna0);
		fila2columna0.setText(tablero.matriz[2][0].getValor().toString());
		
		fila3columna0 = new JTextField();
		fila3columna0.setBounds(34, 142, 86, 20);
		fila3columna0.setEditable(false);
		fila3columna0.setColumns(10);
		frame.getContentPane().add(fila3columna0);
		fila3columna0.setText(tablero.matriz[3][0].getValor().toString());
		
		fila1columna1 = new JTextField();
		fila1columna1.setBounds(130, 80, 86, 20);
		fila1columna1.setEditable(false);
		fila1columna1.setColumns(10);
		frame.getContentPane().add(fila1columna1);
		fila1columna1.setText(tablero.matriz[1][1].getValor().toString());
		
		fila2columna1 = new JTextField();
		fila2columna1.setBounds(130, 111, 86, 20);
		fila2columna1.setEditable(false);
		fila2columna1.setColumns(10);
		frame.getContentPane().add(fila2columna1);
		fila2columna1.setText(tablero.matriz[2][1].getValor().toString());
		
		fila3columna1 = new JTextField();
		fila3columna1.setBounds(130, 142, 86, 20);
		fila3columna1.setEditable(false);
		fila3columna1.setColumns(10);
		frame.getContentPane().add(fila3columna1);
		fila3columna1.setText(tablero.matriz[3][1].getValor().toString());
		
		fila1columna2 = new JTextField();
		fila1columna2.setBounds(226, 80, 86, 20);
		fila1columna2.setEditable(false);
		fila1columna2.setColumns(10);
		frame.getContentPane().add(fila1columna2);
		fila1columna2.setText(tablero.matriz[1][2].getValor().toString());
		
		fila2columna2 = new JTextField();
		fila2columna2.setBounds(226, 111, 86, 20);
		fila2columna2.setEditable(false);
		fila2columna2.setColumns(10);
		frame.getContentPane().add(fila2columna2);
		fila2columna2.setText(tablero.matriz[2][2].getValor().toString());
		
		fila3columna2 = new JTextField();
		fila3columna2.setBounds(226, 142, 86, 20);
		fila3columna2.setEditable(false);
		fila3columna2.setColumns(10);
		frame.getContentPane().add(fila3columna2);
		fila3columna2.setText(tablero.matriz[3][2].getValor().toString());
		
		fila1columna3 = new JTextField();
		fila1columna3.setBounds(322, 80, 86, 20);
		fila1columna3.setEditable(false);
		fila1columna3.setColumns(10);
		frame.getContentPane().add(fila1columna3);
		fila1columna3.setText(tablero.matriz[1][3].getValor().toString());
		
	
		fila2columna3 = new JTextField();
		fila2columna3.setBounds(322, 111, 86, 20);
		fila2columna3.setEditable(false);
		fila2columna3.setColumns(10);
		frame.getContentPane().add(fila2columna3);
		fila2columna3.setText(tablero.matriz[2][3].getValor().toString());
		
		fila3columna3 = new JTextField();
		fila3columna3.setBounds(322, 142, 86, 20);
		fila3columna3.setEditable(false);
		fila3columna3.setColumns(10);
		frame.getContentPane().add(fila3columna3);
		fila3columna3.setText(tablero.matriz[3][3].getValor().toString());
		
		JButton Arriba = new JButton("New button");
		Arriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablero.moverTodoArriba();
				tablero.ApareceOtro2();
				refrescarPantalla(tablero);
			}
		});
		Arriba.setBounds(160, 200, 89, 23);
		frame.getContentPane().add(Arriba);
		
		JButton Abajo = new JButton("New button");
		Abajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablero.moverTodoAbajo();
				tablero.ApareceOtro2();
				refrescarPantalla(tablero);
			}
		});
		Abajo.setBounds(160, 234, 89, 23);
		frame.getContentPane().add(Abajo);
		
		JButton Izquierda = new JButton("New button");
		Izquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablero.moverTodoIzquierda();
				tablero.ApareceOtro2();
				refrescarPantalla(tablero);
			}
		});
		Izquierda.setBounds(61, 214, 89, 23);
		frame.getContentPane().add(Izquierda);
		
		JButton Derecha = new JButton("New button");
		Derecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablero.moverTodoDerecha();
				tablero.ApareceOtro2();
				refrescarPantalla(tablero);
			}
		});
		Derecha.setBounds(259, 214, 89, 23);
		frame.getContentPane().add(Derecha);
	}

		
		public void refrescarPantalla(Tablero tablero) {
			fila0columna0.setText(tablero.matriz[0][0].getValor().toString());
			fila0columna1.setText(tablero.matriz[0][1].getValor().toString());
			fila0columna2.setText(tablero.matriz[0][2].getValor().toString());
			fila0columna3.setText(tablero.matriz[0][3].getValor().toString());
			fila1columna0.setText(tablero.matriz[1][0].getValor().toString());
			fila1columna1.setText(tablero.matriz[1][1].getValor().toString());
			fila1columna2.setText(tablero.matriz[1][2].getValor().toString());
			fila1columna3.setText(tablero.matriz[1][3].getValor().toString());
			fila2columna0.setText(tablero.matriz[2][0].getValor().toString());
			fila2columna1.setText(tablero.matriz[2][1].getValor().toString());
			fila2columna2.setText(tablero.matriz[2][2].getValor().toString());
			fila2columna3.setText(tablero.matriz[2][3].getValor().toString());
			fila3columna0.setText(tablero.matriz[3][0].getValor().toString());
			fila3columna1.setText(tablero.matriz[3][1].getValor().toString());
			fila3columna2.setText(tablero.matriz[3][2].getValor().toString());
			fila3columna3.setText(tablero.matriz[3][3].getValor().toString());
				
		}
	
		
		
	
		
	
		
	
		
		{
}
}