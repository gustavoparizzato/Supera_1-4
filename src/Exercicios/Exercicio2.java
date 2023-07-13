package Exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) throws IOException{
  
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor monetário: ");
        double valor = sc.nextDouble();

        int centavos = (int) (valor * 100);

        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("\nNOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = centavos / (nota * 100);
            centavos %= nota * 100;
            System.out.printf("%d nota(s) de R$ %d%n", quantidadeNotas, nota);
        }

        System.out.println("\nMOEDAS:");
        for (int moeda : moedas) {
            int quantidadeMoedas = centavos / moeda;
            centavos %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda / 100.0);
        }

        sc.close();
    }
}

