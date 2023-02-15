package exercicioBruno;
import java.util.Scanner;
public class Exercicio6 {
	public class FatorialRecursivo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Pede para o usuário informar o número
	        System.out.print("Informe o número para calcular o fatorial: ");
	        int numero = scanner.nextInt();

	        // Calcula o fatorial e imprime o resultado
	        int resultado = fatorial(numero);
	        System.out.println(numero + "! = " + resultado);
	    }

	    // Função recursiva para calcular o fatorial de um número
	    public static int fatorial(int numero) {
	        if (numero == 0) {
	            // Caso base: o fatorial de 0 é 1
	            return 1;
	        } else {
	            // Caso geral: chama a função recursivamente com um número menor
	            return numero * fatorial(numero - 1);
	        }
	    }
	}
}
