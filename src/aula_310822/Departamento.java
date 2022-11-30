package aula_310822;

public class Departamento {
	private int codigo;
	private String nome;
	
	// Construtores
	public Departamento() {
		
	}
	
	public Departamento(int codigo, String nome) {
		this.setCodigo(codigo);
		this.setNome(nome);
	}
	
	
	// Getters and Setters
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		if (codigo < 0) {
			System.out.println("C�digo inv�lido.");
		} else {
			this.codigo = codigo;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome == "" || nome == null) {
			System.out.println("Informa��o inv�lida.");
		} else {
			this.nome = nome;
		}
	}

	@Override
	public String toString() {
		return "C�digo do departamento: " + getCodigo() + "; Nome do departamento: " + getNome();
	}
	
	
	
}
