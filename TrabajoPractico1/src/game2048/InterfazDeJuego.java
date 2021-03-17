package game2048;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTable;

public class InterfazDeJuego {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

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
		frame.getContentPane().setLayout(null);
		
			
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(34, 49, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(130, 49, 86, 20);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(226, 49, 86, 20);
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(322, 49, 86, 20);
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(34, 80, 86, 20);
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(34, 111, 86, 20);
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(34, 142, 86, 20);
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(130, 80, 86, 20);
		textField_7.setColumns(10);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(130, 111, 86, 20);
		textField_8.setColumns(10);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(130, 142, 86, 20);
		textField_9.setColumns(10);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(226, 80, 86, 20);
		textField_10.setColumns(10);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(226, 111, 86, 20);
		textField_11.setColumns(10);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(226, 142, 86, 20);
		textField_12.setColumns(10);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(322, 80, 86, 20);
		textField_13.setColumns(10);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setBounds(322, 111, 86, 20);
		textField_14.setColumns(10);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setBounds(322, 142, 86, 20);
		textField_15.setColumns(10);
		frame.getContentPane().add(textField_15);
		
		
		
	}
}
