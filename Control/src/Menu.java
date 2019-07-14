import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Menu extends JFrame{
	
	JPanel panelMenu = new JPanel();
	JPanel panelClientes = new JPanel();
	
		
	JButton clientes = new JButton("Clientes");
	JButton productos = new JButton("Productos");
	JButton ventas = new JButton("Ventas");
	JButton agregar = new JButton("Agregar");
	JButton salir = new JButton("");
	ImageIcon imgS = new ImageIcon("Salir.png"); //objeto ImageIcon
	
	
	JTextField nom = new JTextField();	JTextField dia = new JTextField();
	JTextField num = new JTextField();	JTextField mes = new JTextField();
	JTextField contrato = new JTextField();
	
	public Menu() {
		this.setSize(800,700);   //establecemos tamaño
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //cerrar la ventana al precionar X
		this.setResizable(false);
		this.setTitle("Menú");
		this.setLocationRelativeTo(null); //establecemos posicion (centrado)
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		panelClientes.setBackground(Color.BLACK);
		this.getContentPane().add(panelClientes);
		panelClientes.setBounds(0,220,800,480);
		panelClientes.setVisible(true);
		panelClientes.setLayout(null);
		
		panelMenu.setBackground(Color.BLACK);
		this.getContentPane().add(panelMenu);
		panelMenu.setBounds(0,0,800,220);
		panelMenu.setLayout(null);
		Graphics g = null;
		colocarEtiquetas();
		colocarCajas();
		paint(g);
	}
	
	public void colocarEtiquetas() {
		ImageIcon img = new ImageIcon("Logo.png"); //objeto ImageIcon
		JLabel imagen = new JLabel();   //label 
		imagen.setBounds(30,30,140,140);
		//escalado del icon
		imagen.setIcon(new ImageIcon(img.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
		panelMenu.add(imagen);
		
		JLabel gym = new JLabel("Gimnasio Genesis");
		gym.setFont(new Font("DejaVu Sans Mono",Font.PLAIN,30));
		gym.setBounds(300,50,300,100); //tamaño y posicion
		gym.setForeground(Color.WHITE); //color de letra
		panelMenu.add(gym); //agregamos la etiqueta al panel
		
		JLabel nombre = new JLabel("Nombre:");
		nombre.setFont(new Font("Arimo",Font.PLAIN,22));
		nombre.setBounds(40,40,100,30);
		nombre.setForeground(Color.WHITE);
		panelClientes.add(nombre);
		
		JLabel numero = new JLabel("Numero:");
		numero.setFont(new Font("Arimo",Font.PLAIN,22));
		numero.setBounds(40,100,100,30);
		numero.setForeground(Color.WHITE);
		panelClientes.add(numero);
		
		JLabel servicio = new JLabel("Contrato:");
		servicio.setFont(new Font("Arimo",Font.PLAIN,22));
		servicio.setBounds(40,160,100,30);
		servicio.setForeground(Color.WHITE);
		panelClientes.add(servicio);
		
		JLabel dia = new JLabel("Dia");					JLabel mes= new JLabel("Mes");
		dia.setFont(new Font("Arimo",Font.PLAIN,22));	mes.setFont(new Font("Arimo",Font.PLAIN,22));
		dia.setBounds(80,220,50,30);					mes.setBounds(210,220,50,30);
		dia.setForeground(Color.WHITE);					mes.setForeground(Color.WHITE);
		panelClientes.add(dia);							panelClientes.add(mes);
		
		
	}
	
	public void colocarCajas() {
		
		nom.setBounds(150,40,200,30);
		nom.setFont(new Font("Arimo",Font.PLAIN,21));
		panelClientes.add(nom);
		
		//Borrar /	/	/	/	/	/	/	/
		JTextField d = new JTextField();   //
		d.setBounds(390,40,2,350);		   //	
		panelClientes.add(d);			   //
		//esta parte   /	/	/	/	/	/
		
		num.setBounds(150,100,200,30);
		num.setFont(new Font("Arimo",Font.PLAIN,21));
		panelClientes.add(num);
		
		contrato.setBounds(150,160,200,30);
		contrato.setFont(new Font("Arimo",Font.PLAIN,21));
		panelClientes.add(contrato);
		
		dia.setBounds(130,220,50,30);					mes.setBounds(260,220,50,30);
		dia.setFont(new Font("Arimo",Font.PLAIN,21));	mes.setFont(new Font("Arimo",Font.PLAIN,21));
		panelClientes.add(dia);							panelClientes.add(mes);
		
		//botones
		agregar.setBounds(70,350,250,40);
		agregar.setBackground(Color.LIGHT_GRAY);
		panelClientes.add(agregar);
	
		clientes.setBounds(70,180,170,35);        //Agregamos el botón de clientes
		clientes.setBackground(Color.LIGHT_GRAY);
		panelMenu.add(clientes);
		
		productos.setBounds(310,180,170,35);	  //Agregamos el botón de productos
		productos.setBackground(Color.LIGHT_GRAY);
		panelMenu.add(productos);
		
		ventas.setBounds(550,180,170,35);
		ventas.setBackground(Color.LIGHT_GRAY);
		panelMenu.add(ventas);
		
		Color color1 = new Color(215,106,106); //color rgb para agregar
		salir.setBounds(740,20,35,35);
		salir.setIcon(new ImageIcon(imgS.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH)));
		salir.setBackground(Color.WHITE); 
		panelMenu.add(salir);
		
		salir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                salir.setBackground(color1);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                salir.setBackground(Color.WHITE);
            }
        });
		
	}
	
	public static void main(String args[]) {
		Login login = new Login();
		//login.setVisible(true); //se hace visible la ventana
		
		Menu menu = new Menu();
		menu.setVisible(true);
	}
	
}
