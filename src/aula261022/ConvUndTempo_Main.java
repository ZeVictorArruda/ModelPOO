package aula261022;

import java.util.Scanner;

public class ConvUndTempo_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int minuto = sc.nextInt();
		
		int segundos = ConversaoUnidadesTempo.MinutoParaSegundo(minuto);
		
		System.out.println("A quantidade de segundos é: " + segundos);
		
		sc.close();
	}

}
