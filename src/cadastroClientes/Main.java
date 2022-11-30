package cadastroClientes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Dados pessoais
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o rg: ");
		String rg = sc.nextLine();
		System.out.println("Digite o cpf: ");
		String cpf = sc.nextLine();
		
		// Endereco
		System.out.println("Digite o nome da rua: ");
		String logradouro = sc.nextLine();
		System.out.println("Digite o número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o bairro: ");
		String bairro = sc.nextLine();
		System.out.println("Digite a cidade: ");
		String cidade = sc.nextLine();
		System.out.println("Digite o estado: ");
		String estado = sc.nextLine();
		
		// Telefone
		System.out.println("Digite o telefone: ");
		String telefone = sc.nextLine();
		System.out.println("Digite o ddd: ");
		int ddd = sc.nextInt();
		sc.nextLine();
		
		// Data
		System.out.println("Digite o dia de nascimento: ");
		int dia = sc.nextInt();
		System.out.println("Digite o mês de nascimento: ");
		int mes = sc.nextInt();
		System.out.println("Digite o ano de nascimento: ");
		int ano = sc.nextInt();
		
		// Intanciacoes
		Data dataNasc = new Data(dia, mes, ano);
		Telefone numTel = new Telefone(telefone, ddd);
		Endereco endereco = new Endereco(logradouro, numero, bairro, cidade, estado);
		
		Cliente cliente = new Cliente(nome, rg, cpf, numTel, dataNasc, endereco);
		
		System.out.println(cliente);
		
		sc.close();
	}

}
