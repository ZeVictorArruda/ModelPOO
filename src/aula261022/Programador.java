package aula261022;

public class Programador extends Funcionario {

	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario()*1.2);
		
	}
	

}
