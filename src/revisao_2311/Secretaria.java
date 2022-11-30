package revisao_2311;

// extende a classe abstrata funcionario e implementa a interface prioridade
public class Secretaria extends Funcionario implements Prioridade{
	
	private String idiomaFalado;

	public String getIdiomaFalado() {
		return idiomaFalado;
	}

	public void setIdiomaFalado(String idiomaFalado) {
		this.idiomaFalado = idiomaFalado;
	}

	@Override
	public boolean autentica() {
		if (idiomaFalado == "Ingles" || idiomaFalado == "Inglês") {
			return true;
		}
		return false;
	}
	
}
