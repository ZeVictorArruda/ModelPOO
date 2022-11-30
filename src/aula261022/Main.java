package aula261022;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Gerente();
		Funcionario f2 = new Programador();
		
		f1.setSalario(2000);
		f2.setSalario(5000);
		
		f1.aumentaSalario();
		f2.aumentaSalario();
		
		System.out.println(f1.getSalario());
		System.out.println(f2.getSalario());

	}

}
