package aula261022;

public class Gerente extends Funcionario {

	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario()*1.1);
		
	}


}
