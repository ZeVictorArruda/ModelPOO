package exercecioRevisao_1va;

public class Endereco {
	
	private String logradouro, cep, bairro, cidade;
	private int numero;
	private String complemento;
	
	// Construtor
	public Endereco() {
		
	}
	
	public Endereco(String logradouro, String cep, String bairro, String cidade, int numero, String complemento) {
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.numero = numero;
		this.complemento = complemento;
	}

	
	// getters and setters
	public String getLogradouro() {
		return logradouro;
	}
	

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	

	public String getCep() {
		return cep;
	}
	

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	

	public String getBairro() {
		return bairro;
	}
	

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	

	public String getCidade() {
		return cidade;
	}
	

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

	public int getNumero() {
		return numero;
	}
	

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

	public String getComplemento() {
		return complemento;
	}
	

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	// fim de getters and setters

	@Override
	public String toString() {
		return "[logradouro=" + logradouro + ", cep=" + cep + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", numero=" + numero + ", complemento=" + complemento + "]";
	}
	
	

}
