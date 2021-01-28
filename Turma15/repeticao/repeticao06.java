package Turma15;

import java.util.Scanner;

public class repeticao06 {
	public static void main(String agrs[]) {
		int num,mult=0,total=0,soma=0;
		float media=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Entre com um numero inteiro");
			num = ler.nextInt();
				mult = num%3;
				
			if(mult == 0 ) {
				total++;
				soma = soma + num;
			}
			
			media = soma/total;				
			
		}while(num != 0 );
		
		System.out.println("O total dos numeros multiplos de 3 é "+total);
		System.out.println("A soma dos numeros multiplos de 3 é "+soma);
		System.out.println("A media dos numeros multiplos de 3 é "+media);
	}
}
