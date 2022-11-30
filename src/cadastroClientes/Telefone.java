package cadastroClientes;

public class Telefone {
	
	public String telefone;
	public int ddd;
	
	public Telefone() {
		
	}
	
	public Telefone(String telefone, int ddd) {
		this.telefone = telefone;
		this.ddd = ddd;
	}

	@Override
	public String toString() {
		return "Telefone [telefone=" + telefone + ", ddd=" + ddd + "]";
	}

}
