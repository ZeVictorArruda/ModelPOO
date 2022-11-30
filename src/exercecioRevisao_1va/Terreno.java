package exercecioRevisao_1va;

public class Terreno {
	
	private double largura, comprimento;
	private static int contadorTerreno = 0;
	private String idTerreno;
	private Endereco endereco;
	
	
	// construtor
	public Terreno (double largura, double comprimento, Endereco endereco) {
		this.largura = largura;
		this.comprimento = comprimento;
		this.endereco = endereco;
		idTerreno = geraID();
		
	}
	
	
	// getters and setters
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getIdTerreno() {
		return idTerreno;
	}


	// métodos
	public double area() {
		return comprimento * largura;
	}
	
	public String geraID() {
		contadorTerreno += 1;
		return "TER_" + contadorTerreno;
	}


	@Override
	public String toString() {
		return "[largura=" + largura + ", comprimento=" + comprimento + ", idTerreno=" + idTerreno
				+ ", endereco=" + endereco + "]";
	}
	
	
	
}
