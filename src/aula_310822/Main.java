package aula_310822;

public class Main {

	public static void main(String[] args) {
		// Criando variáveis do departamento
		int codigoDpto = 1501;
		String nomeDpto = "TI";
		
		// Criando variaveis do funcionario
		int matriculaFunc = 2020123;
		String nomeFunc = "Fulano de Tal";
		Departamento dpto = new Departamento(codigoDpto, nomeDpto);
		
		// Instanciando funcionário
		Funcionario funcionario1 = new Funcionario(matriculaFunc, nomeFunc, dpto);
		
		System.out.println(funcionario1);
		
		
	}

}
