public class Producto {
	public Producto() {
		
	}

	String nombre;
	double precio;
	double cantidad;
	
	//metodos set
	public void setNombre(String n) {
		nombre = n;
	}
	public void setPrecio(double p) {
		precio = p;
	}
	public void setCantidad(double c) {
		cantidad = c;
	}
	
	//metodos get
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public double getCantidad() {
		return cantidad;
	}
	
}
