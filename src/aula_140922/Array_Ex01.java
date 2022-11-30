package aula_140922;
import java.util.Scanner;

public class Array_Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int maiorPar = 0, menorImpar = 0, media;
		int soma = 0;
		
		// Prenchendo o vetor
		for (int i=0; i< vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}
		
		// Maior par e menor impar		
		for (int i=0; i < vetor.length; i++) {
			if (i==1) {
				maiorPar = vetor[i];
				menorImpar = vetor[i];
			} else {
				if (vetor[i] % 2 == 0) {
					if (vetor[i]>maiorPar) {
						maiorPar = vetor[i];
					}
				}
				if (vetor[i] % 2 == 1) {
					if (vetor[i]<menorImpar) {
						menorImpar = vetor[i];
					}
				}
			}
		}
		
		// somatorio
		for (int i=0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		// media
		media = soma/vetor.length;
		
		System.out.printf("Maior par: %d;%nMenor Impar: %d;%nMedia: %d;%nSoma: %d%n", maiorPar, menorImpar, media, soma);
		
		sc.close();
	}

}
