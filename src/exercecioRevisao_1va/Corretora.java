package exercecioRevisao_1va;

import java.util.ArrayList;

public class Corretora {
	
	private ArrayList<Terreno> catalogoTerrenos;
	private ArrayList<Cotacao> catalogoCotacoes;
	
	public Corretora() {
		catalogoTerrenos = new ArrayList<Terreno>();
		catalogoCotacoes = new ArrayList<Cotacao>();
	}
	
	public void addTerreno(Terreno terreno) {
		catalogoTerrenos.add(terreno);
	}
	
	public void addCotacao(Cotacao cotacao) {
		catalogoCotacoes.add(cotacao);
	}
	
	public void removeTerrenoByID(int idx) {
		catalogoTerrenos.remove(idx);
	}
	
	public void removeCotacaoByIdx(int idx) {
		catalogoCotacoes.remove(idx);
	}
	
	public Terreno buscaTerrenoByID(String idTerreno) {
		for(Terreno terreno : catalogoTerrenos){
            if (terreno.getIdTerreno() == idTerreno) {
                return terreno;
            }
        }
        return null;
	}
	
	public Double valorTerreno(Terreno terreno) {
		for (Cotacao cotacao : catalogoCotacoes) {
			if (terreno.getEndereco().getBairro() == cotacao.getBairro()) {
				return terreno.area() * cotacao.getPrecoM2();
			}
		}
		return null;
	}
	
	public Double somatorioValores() {
		double valor=0;
		for (Terreno terreno : catalogoTerrenos) {
			valor += valorTerreno(terreno);
		}
		return valor;
	}
	

}
