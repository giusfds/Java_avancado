import java.util.Scanner;
public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vet = new double[n];
        double soma = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.println();
        System.out.println("soma: " + soma);
        double media = soma / n;
        System.out.println("media " + media);

        sc.close();
    }
}