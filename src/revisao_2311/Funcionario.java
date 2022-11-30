package revisao_2311;

// criando a classe abstrata (não pode ser instanciada)
public abstract class Funcionario {
	
	private String nome;
	private int codigo;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", codigo=" + codigo + ", endereco=" + endereco + "]";
	}

	
}
