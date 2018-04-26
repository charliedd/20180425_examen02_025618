
public class FTP implements Protocolo {
	

	@Override
	public String Enviar(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Estoy enviando por FTP ");
		return msg;
	}

	@Override
	public String Recibir(String msg) {
		System.out.print("Estoy recibiendo por FTP");
		return msg;
	}

}
