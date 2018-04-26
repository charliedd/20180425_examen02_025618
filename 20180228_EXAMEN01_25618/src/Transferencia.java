
public class Transferencia {
	double monto;
	Cuenta origen;
	Cuenta destino;
	
	public Transferencia(double monto,Cuenta origne,Cuenta destino){
		this.monto = monto;
		this.origen = origen;
		this.destino = destino;
	}
	
	public Banco getBancoOrigen(){
		return this.origen.getBanco();
	}
	
	public Banco getBancoDestino(){
		return this.destino.getBanco();
	}
	
	public String toString(){
		return this.monto + " " +this.origen.
	}
}
