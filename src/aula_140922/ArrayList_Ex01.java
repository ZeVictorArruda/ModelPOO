package aula_140922;

import java.util.ArrayList;

public class ArrayList_Ex01 {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();
		
		carros.add("Jag");
		carros.add("Ford");
		carros.add("FIAT");
		System.out.println(carros.contains("Ford"));
		System.out.println(carros);
	}

}
