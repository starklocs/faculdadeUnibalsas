package exercicioBruno;
import java.util. Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	//cria o scanner
	Scanner scanner = new Scanner(System.in);
	//solicita o número ao usuário
	System.out.print("Digite um número: ");
	//atribui o número digitado à variável num
	int num = scanner.nextInt();
	//utiliza um laço para imprimir números de
	//0 até o número digitado
	for (int i = 0; i <= num; i++) {
	System.out.println(i);
		}
	}
}
