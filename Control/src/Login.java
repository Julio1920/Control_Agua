import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.*;

public class Login extends JFrame{
	
	JPanel panel1 = new JPanel();
	
	JTextField usuario = new JTextField();
	JPasswordField password = new JPasswordField();
	
	public Login() {
		this.setSize(400,600);   //establecemos tamaño
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //cerrar la ventana al precionar X
		this.setTitle("Genesis");
		this.setLocationRelativeTo(null); //establecemos posicion (centrado)
		
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		
		panel1.setBackground(Color.WHITE);
		this.getContentPane().add(panel1);
		panel1.setLayout(null);  // desactivando el diseño por defecto
		colocarEtiquetas();
	}
	
	public void colocarEtiquetas() {
		JLabel titulo = new JLabel("hi");
		titulo.setBounds(100,100,200,100); //tamaño y posicion
		titulo.setForeground(Color.black); //color de letra
		panel1.add(titulo); //agregamos la etiqueta al panel
	}

}
