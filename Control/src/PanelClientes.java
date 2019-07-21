import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelClientes extends JPanel{
	
	JTextField nom = new JTextField();	JTextField dia = new JTextField();
	JTextField num = new JTextField();	JTextField mes = new JTextField();
	JTextField contrato = new JTextField();
	
	JButton agregar = new JButton("Agregar");
	
	Cliente[] listaClientes = new Cliente [500];
	
	//Tabla
    DefaultTableModel modelo = new DefaultTableModel() {
    	@Override
    	public boolean isCellEditable(int row, int col)
    	{
    	return false;
    	}
    };	
    JTable tabla = new JTable(modelo);
	JScrollPane scroll = new JScrollPane(tabla); 
	
	public PanelClientes() {
		setBackground(Color.BLACK);
		setBounds(0,220,800,480);
		setLayout(null);
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		colocarEtiquetas();
		colocarCajas();
		eventos();
		colocarTabla();
	}

	public void colocarEtiquetas() {
		JLabel nombre = new JLabel("Nombre:");
		nombre.setFont(new Font("Arimo",Font.PLAIN,22));
		nombre.setBounds(40,40,100,30);
		nombre.setForeground(Color.WHITE);
		add(nombre);
		
		JLabel numero = new JLabel("Numero:");
		numero.setFont(new Font("Arimo",Font.PLAIN,22));
		numero.setBounds(40,100,100,30);
		numero.setForeground(Color.WHITE);
		add(numero);
		
		JLabel servicio = new JLabel("Contrato:");
		servicio.setFont(new Font("Arimo",Font.PLAIN,22));
		servicio.setBounds(40,160,100,30);
		servicio.setForeground(Color.WHITE);
		add(servicio);
		
		JLabel dia = new JLabel("Dia");					JLabel mes= new JLabel("Mes");
		dia.setFont(new Font("Arimo",Font.PLAIN,22));	mes.setFont(new Font("Arimo",Font.PLAIN,22));
		dia.setBounds(80,220,50,30);					mes.setBounds(210,220,50,30);
		dia.setForeground(Color.WHITE);					mes.setForeground(Color.WHITE);
		add(dia);							            add(mes);
		
	}
	
	public void colocarCajas() {
		
		nom.setBounds(150,40,200,30);
		nom.setFont(new Font("Arimo",Font.PLAIN,21));
		add(nom);
		
		//Borrar /	/	/	/	/	/	/	/
		JTextField d = new JTextField();   //
		d.setBounds(390,40,2,350);		   //	
		add(d);		                	   //
		//esta parte   /	/	/	/	/	/
		
		num.setBounds(150,100,200,30);
		num.setFont(new Font("Arimo",Font.PLAIN,21));
		add(num);
		
		contrato.setBounds(150,160,200,30);
		contrato.setFont(new Font("Arimo",Font.PLAIN,21));
		add(contrato);
		
		dia.setBounds(130,220,50,30);					mes.setBounds(260,220,50,30);
		dia.setFont(new Font("Arimo",Font.PLAIN,21));	mes.setFont(new Font("Arimo",Font.PLAIN,21));
		this.add(dia);							            this.add(mes);
		
		//botones
		agregar.setBounds(70,350,250,40);
		agregar.setBackground(Color.LIGHT_GRAY);
		this.add(agregar);
		agregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                agregar.setBackground(Color.WHITE);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                agregar.setBackground(Color.LIGHT_GRAY);
            }
        });
	
	}
	
	public void eventos() {
		
		agregar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
	}
	
	private void colocarTabla() {
		
		JLabel n = new JLabel("Nombre");
		
    	modelo.addColumn("");
    	modelo.addColumn("");
    	modelo.addColumn("");
    	modelo.addColumn("");
    	
    	JTable tabla = new JTable(modelo);
    	JScrollPane scroll = new JScrollPane(tabla);
    	//tabla.setBackground(Color.LIGHT_GRAY);
    	//tabla.setResizable(false);
    	scroll.setBounds(430,40,340,350);    	
        add(scroll);
		
	}
	
}
