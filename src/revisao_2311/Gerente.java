package revisao_2311;

//extende a classe abstrata funcionario e implementa a interface prioridade
public class Gerente extends Funcionario implements Prioridade {
	
	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public boolean autentica() {
		
		if (departamento == "RH" || departamento == "Compras" || departamento == "Pessoal") {
			return true;
		}
		
		return false;
	}
	
}
