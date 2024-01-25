import java.util.Scanner;
import java.util.Locale;
public class Program{

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        ler a quantidade de pessoas presentes no programa
        int qntPessoas = sc.nextInt();
//        criar vetores do temanho da quantidade de pessaos presentes no programa
        double[] altura = new double[qntPessoas];
        String[] nome = new String[qntPessoas];
        int[] idade = new int[qntPessoas];

        int mediaIdade = 0;
        double mediaAltura = 0;
        int contadorIdade = 0;

        sc.nextLine();

        for (int i = 0; i < nome.length; i++) {
//            colcoar informacoes no vetor de cada pessoa em sua posicao
            nome[i] = sc.nextLine();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
//            somar para calcular a media entre todos;
            mediaIdade += idade[i];
            mediaAltura += altura[i];
//            verificar se a pessoa tem -16
            if (idade[i] < 16){
                contadorIdade++;
            }
            sc.nextLine();
        }

//        calcular a porcentagem de menores de 16 anos
        double porcentagem = ((double) contadorIdade / qntPessoas) * 100;
//        calculando a media da altura
        mediaAltura = mediaAltura / qntPessoas;



        System.out.printf("A média das alturas é: %.2f%n", mediaAltura);
        System.out.println("pessoas com a idade menor de 16 anos: " + porcentagem + "%");
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 16)
                System.out.println(nome[i]);
        }

        sc.close();
    }
}