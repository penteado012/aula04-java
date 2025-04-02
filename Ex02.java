package aula04;

import java.util.Scanner;

public class Ex02 {
	
	public static void setOpcao() { 

		System.out.println("1. soma");
		System.out.println("2. subtracao");
		System.out.println("3. multiplicacao");
		System.out.println("4. divisao");
		System.out.println("0. saida");
		
	}
	
	public static void app() {
		Scanner scanner = new Scanner(System.in);
		setOpcao();
		
		int opcao;
		System.out.println("Digite o valor do 1º numero");
		int num1 = scanner.nextInt();
		int num2;
		int operador;
		int total;
		
		while((opcao = scanner.nextInt()) !=0) {
			System.out.println("Digite o valor do 2º numero");
			num2 = scanner.nextInt();
			switch (opcao) {
			case 1:
				total = num1+num2;
				System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
				app();
				break;

			default:
				break;
			}
		}
	}
	
	public static void main(String [] args) {
		
		
		app();
	}
}
