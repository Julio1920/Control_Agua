import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.*;

public class Login extends JFrame{
	
	public Login() {
		this.setSize(400,600);   //establecemos tamaño
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Genesis");
		this.setLocationRelativeTo(null); //establecemos posicion (centrado)
		
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLACK);
		this.getContentPane().add(panel1);
		colocarEtiquetas();
	}
	
	public void colocarEtiquetas() {
		JLabel titulo = new JLabel("GENESIS");
	}

}
