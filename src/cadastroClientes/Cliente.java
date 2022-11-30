package cadastroClientes;

public class Cliente {
	
	public String nome, rg, cpf;
	public Telefone telefone;
	public Data dataNasc;
	public Endereco endereco;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String rg, String cpf, Telefone telefone, Data dataNasc, Endereco endereco) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", telefone=" + telefone + ", dataNasc="
				+ dataNasc + ", endereco=" + endereco + "]";
	}
	

}
