package Turma15;

import java.util.Scanner;

public class repeticao05 {
	public static void main (String agrs[]) {
		int soma=0,num=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero ");
			num = ler.nextInt();
			
				soma = soma + num;
			
				System.out.println("A soma dos numeros digitados é igual "+soma);
			
		}while(num != 0);
		
			System.out.println("Você digitou o zero e saiu do progrma ");
		
	}
}
