package aplication;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // comer a quebra de linha
        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("digite o numero ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println("numero negativo encontrado: " + numeros[i]);
            }
        }

        sc.close();
    }
}
