package exercicioBruno;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("DIGITE UM NÚMERO: ");
		int numero = scanner.nextInt();
		int soma = 0;
		
		for(int i=0; i<= numero; i++){
			soma += i;
		}
		
		System.out.println("A SOMA DOS NÚMEROS DE 0 A "+numero+" É:"+soma);
		
		
	}
}
