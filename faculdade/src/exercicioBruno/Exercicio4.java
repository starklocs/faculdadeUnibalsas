package exercicioBruno;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede para o usuário informar o tamanho do vetor
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Cria o vetor com o tamanho informado pelo usuário
        int[] vetor = new int[tamanho];

        // Pede para o usuário informar os valores a serem armazenados no vetor
        System.out.println("Informe os valores a serem armazenados no vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Verifica se o número 10 existe no vetor
        boolean existe10 = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == 10) {
                existe10 = true;
                break;
            }
        }

        // Informa se o número 10 existe no vetor
        if (existe10) {
            System.out.println("O número 10 existe no vetor.");
        } else {
            System.out.println("O número 10 não existe no vetor.");
        }
    }
}
