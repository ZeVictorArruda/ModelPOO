package exercecioRevisao_1va;

public class Cotacao {
	
	private String bairro;
	private double precoM2;
	
	// contrutor
	public Cotacao(String bairro, double cotacao) {
		this.bairro = bairro;
		this.precoM2 = cotacao;
	}
	
	// getters and setters
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public double getPrecoM2() {
		return precoM2;
	}
	public void setPrecoM2(double cotacao) {
		this.precoM2 = cotacao;
	}

	@Override
	public String toString() {
		return "[bairro=" + bairro + ", precoM2=" + precoM2 + "]";
	}
	

}
