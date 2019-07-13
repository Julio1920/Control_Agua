import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;

import javax.swing.*;

public class Login extends JFrame{
	
	JPanel panel1 = new JPanel();
	JTextField usuario = new JTextField();
	JPasswordField password = new JPasswordField(4);
	JButton entrar = new JButton("Entrar");
	
	public Login() {
		this.setSize(400,600);   //establecemos tamaño
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //cerrar la ventana al precionar X
		this.setResizable(false);
		this.setTitle("Login");
		this.setLocationRelativeTo(null); //establecemos posicion (centrado)
		
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		
		panel1.setBackground(Color.BLACK);
		this.getContentPane().add(panel1);
		panel1.setLayout(null);  // desactivando el diseño por defecto
		colocarEtiquetas();
		colocarCajas();
	}
	
	public void colocarEtiquetas() {
		
		ImageIcon img = new ImageIcon("Logo.png"); //objeto ImageIcon
		JLabel imagen = new JLabel();   //label 
		imagen.setBounds(110,50,180,180);
		//escalado del icon
		imagen.setIcon(new ImageIcon(img.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
		panel1.add(imagen);
		
		JLabel titulo = new JLabel("GENESIS");
		titulo.setFont(new Font("DejaVu Sans Mono",Font.PLAIN,30));
		titulo.setBounds(135,210,200,100); //tamaño y posicion
		titulo.setForeground(Color.WHITE); //color de letra
		panel1.add(titulo); //agregamos la etiqueta al panel
		
		JLabel usuario = new JLabel("Usuario"); //label de usuario
		usuario.setFont(new Font("Arimo",Font.PLAIN,22));
		usuario.setBounds(20,340,200,22);
		usuario.setForeground(Color.WHITE);
		panel1.add(usuario);
		
		JLabel password = new JLabel("Password");  //label de password
		password.setFont(new Font("Arimo",Font.PLAIN,22));
		password.setBounds(20,400,200,22);
		password.setForeground(Color.WHITE);
		panel1.add(password);
	}
	
	public void colocarCajas() {
		
		//agregar caja de usuario a login
		usuario.setBounds(140,337,200,30);
		usuario.setFont(new Font("Arimo",Font.PLAIN,21));
		panel1.add(usuario);
		
		//agregar caja de password a login
		password.setBounds(140,397,200,30);
		password.setFont(new Font("Arimo",Font.PLAIN,21));
		panel1.add(password);
		
		//agregar botón
		entrar.setBounds(70,480,270,50);
		entrar.setBackground(Color.LIGHT_GRAY);
		panel1.add(entrar);
		
	}
	
	public void eventos() {
		
		
		String us = usuario.getText();
		char[] pass = {'1','9','2','0'}; //mi contraseña
		char[] contra = password.getPassword();  //contenido del JPasswordField
		if(us.equals("admin") && Arrays.equals(contra,pass)) {
			System.out.println("Bienvenido");
		}else {
			System.out.println("Error en usuario o contraseña");
		}
		
	}

}
