package aula_310822;

public class Funcionario {
	
	// Atributos
	private int matricula;
	private String nome;
	private Departamento dpto;
	
	// Construtores
	public Funcionario(int matricula, String nome, Departamento dpto) {
		this.setMatricula(matricula);
		this.setNome(nome);
		this.setDpto(dpto);
	}

	// Getters and Setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Departamento getDpto() {
		return dpto;
	}
	public void setDpto(Departamento dpto) {
		this.dpto = dpto;
	}
	
	@Override
	public String toString() {
		return "Matrícula do funcionário: " + getMatricula() + ", Nome do funcionário: " + getNome() + "; " + getDpto();
	}
		
	
}
