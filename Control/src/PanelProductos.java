import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.JPanel;

public class PanelProductos extends JPanel{
	
	public PanelProductos() {
		setBackground(Color.WHITE);
		setBounds(0,220,800,480);
		setLayout(null);
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		colocarEtiquetas();
	}
	
	public void colocarEtiquetas() {
		JLabel nProducto = new JLabel();
		nProducto.setFont(new Font("Arimo",Font.PLAIN,22));
		nProducto.setBounds(100,100,100,30);
		nProducto.setForeground(Color.BLACK);
		add(nProducto);
	}

}
