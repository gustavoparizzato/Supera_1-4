package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine();
            String linhaDecifrada = desembaralharString(linha);
            saida.append(linhaDecifrada);
            if (i < n - 1) {
                saida.append(System.lineSeparator());
            }
        }
        System.out.print(saida);

        sc.close();
    }

    private static String desembaralharString(String linha) {
        int meio = linha.length() / 2;
        StringBuilder linhaDecifrada = new StringBuilder();

        for (int i = meio - 1; i >= 0; i--) {
            linhaDecifrada.append(linha.charAt(i));
        }

        for (int i = linha.length() - 1; i >= meio; i--) {
            linhaDecifrada.append(linha.charAt(i));
        }

        return linhaDecifrada.toString();
	}
}
