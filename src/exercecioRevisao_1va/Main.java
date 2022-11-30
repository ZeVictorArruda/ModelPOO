package exercecioRevisao_1va;

public class Main {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Armindo Cardoso Moura", "53220-050", "Peixinhos", "Olinda", 300, "Loja");
		Endereco endereco2 = new Endereco("Rua Construtor João Alves", "49020-340", "Aracaju", "Sergipe", 542, "Casa");
		Terreno terreno1 = new Terreno(20, 15, endereco1);
		Terreno terreno2 = new Terreno(30, 15, endereco2);
		
		Corretora corretora1 = new Corretora();
		corretora1.addTerreno(terreno1);
		corretora1.addTerreno(terreno2);
		
		Cotacao cotPeixinhos = new Cotacao("Peixinhos", 2500);
		Cotacao cotAracaju = new Cotacao("Aracaju", 2000);
		
		corretora1.addCotacao(cotPeixinhos);
		corretora1.addCotacao(cotAracaju);
		
		System.out.println("Valor toral: " + corretora1.valorTerreno(terreno1));
		System.out.println("Valor toral: " + corretora1.valorTerreno(terreno2));
		System.out.println("Valor total: " + corretora1.somatorioValores());
		
	}

}
