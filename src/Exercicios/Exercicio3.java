package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor alvo e depois a quantidade de valores que serão incluídos na listagem\n");
		System.out.print("-Alvo: ");
		int alvo = sc.nextInt();
		System.out.print("-Quantidade de valores: ");
		int nListagem = sc.nextInt();

		int[] array = new int[nListagem];
 		for (int i = 0; i < nListagem; i++) {
			array[i] = sc.nextInt();
		}
 		
        int contador = 0;
        for (int i = 0; i < nListagem; i++) {
            for (int j = i + 1; j < nListagem; j++) {
                if (Math.abs(array[i] - array[j]) == alvo) {
                    contador++;
                }
            }
        }
		
        System.out.println("-Número de pares com diferença igual a " + alvo + ": " + contador);
        
		sc.close();
	}
}
