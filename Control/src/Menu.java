import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.*;

public class Menu extends JFrame{
	
	JPanel panelMenu = new JPanel();
	PanelClientes panelC = new PanelClientes();
	PanelProductos panelP = new PanelProductos();
		
	JButton clientes = new JButton("Clientes");
	JButton productos = new JButton("Productos");
	JButton ventas = new JButton("Ventas");
	JButton salir = new JButton();
	ImageIcon imgS = new ImageIcon("Salir.png"); //objeto ImageIcon
	
	public Menu() {
		this.setSize(800,700);   //establecemos tamaño
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //cerrar la ventana al precionar X
		this.setResizable(false);
		this.setTitle("Menú");
		this.setLocationRelativeTo(null); //establecemos posicion (centrado)
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		
		this.getContentPane().add(panelP);
		this.getContentPane().add(panelC);
		this.getContentPane().add(panelMenu);
		
		panelMenu.setBounds(0,0,800,220);
		panelMenu.setBackground(Color.BLACK);
		panelMenu.setVisible(true);
		panelMenu.setLayout(null);
		
		panelP.setVisible(false);
		
		colocarEtiquetas();
		colocarBotones();		
		eventos();
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
		
	}
	
	public void colocarBotones() {		
		//botones
		clientes.setBounds(70,180,170,35);        //Agregamos el botón de clientes
		clientes.setBackground(Color.LIGHT_GRAY);
		panelMenu.add(clientes);
		clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                clientes.setBackground(Color.WHITE);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                clientes.setBackground(Color.LIGHT_GRAY);
            }
        });
		
		productos.setBounds(310,180,170,35);	  //Agregamos el botón de productos
		productos.setBackground(Color.LIGHT_GRAY);
		panelMenu.add(productos);
		productos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                productos.setBackground(Color.WHITE);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                productos.setBackground(Color.LIGHT_GRAY);
            }
        });
		
		ventas.setBounds(550,180,170,35);
		ventas.setBackground(Color.LIGHT_GRAY);
		panelMenu.add(ventas);
		ventas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                ventas.setBackground(Color.WHITE);
            }
            @Override
            public void mouseExited(MouseEvent e) {
            	ventas.setBackground(Color.LIGHT_GRAY);
            }
        });
		
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
	
	public void eventos() {
		
		salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int resp=JOptionPane.showConfirmDialog(null,"Deseas salir");
			    if (JOptionPane.OK_OPTION == resp){
			    	Login login = new Login();
			    	login.setVisible(true);
			    	setVisible(false);
			    }
			}
			
		});
		
		productos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelC.setVisible(false);
				panelP.setVisible(true);
			}
			
		});
		
		clientes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelC.setVisible(true);
				panelP.setVisible(false);
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
