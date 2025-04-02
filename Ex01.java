package aula04;
import java.util.Scanner;

public class Ex01 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um nº: ");
		int qtd = scanner.nextInt();
		
		for(int i =0; i < qtd; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < qtd-2; i++) {
			System.out.print("*");
			for (int j = 0; j < qtd-2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
		for(int i =0; i < qtd; i++) {
			System.out.print("*");
		}
	}
}