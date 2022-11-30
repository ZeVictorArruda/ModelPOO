package cadastroClientes;

public class Endereco {
	public String logradouro;
	public int numero;
	public String bairro, cidade, estado;
	
	public Endereco(){
		
	}
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado){
		
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + "]";
	}
	
}
