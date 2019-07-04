public class Cliente {
	
	public Cliente() {
		
	}
	
	String nombre;
	String numero;
	int mesI,diaI;
	int mesF,diaF;
	
	//metodos set
	public void setNombre(String n) {
		nombre = n;
	}
	public void setNumero(String n) {
		numero = n;
	}
	
	//metodos get
	public String getNombre() {
		return nombre;
	}
	public String getNumero() {
		return numero;
	}
	
}
