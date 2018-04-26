
public class Cuenta {
	double fondos;
	String nombre;
	Banco banco;
	
	public Cuenta(double fondos,String nombre,Banco banco){
		this.fondos = fondos;
		this.nombre = nombre;
		this.banco = banco;
	}
	
	public Banco getBanco(){
		return this.banco;
	}
	
	public String getName(){
		return this.nombre;
	}
}
