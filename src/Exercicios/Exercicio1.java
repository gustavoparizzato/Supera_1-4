package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("-Digite quantos valores serão dado a entrada: ");
		int n = sc.nextInt();
		
		System.out.print("-Digite agora os valores, sendo apenas números inteiros e positivos: ");
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x % 2 == 0) {
				pares.add(x);
			}
			else {
				impares.add(x);
			}
		}
		
		Collections.sort(pares);
		Collections.reverse(impares);
		
		System.out.println("\n-Lista ordenada com os pares em ordem crescente e ímpares em ordem decrescente");
		for (Integer par : pares) {
			System.out.println(par);
		}
		for (Integer impar : impares) {
			System.out.println(impar);
		}
		
		sc.close();
	}
}
