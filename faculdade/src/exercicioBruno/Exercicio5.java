package exercicioBruno;
import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede para o usuário informar o tamanho do vetor
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Cria o vetor com o tamanho informado pelo usuário
        int[] vetor = new int[tamanho];

        // Preenche o vetor com valores informados pelo usuário
        System.out.println("Informe os valores a serem armazenados no vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Imprime o vetor
        System.out.println("Vetor preenchido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
