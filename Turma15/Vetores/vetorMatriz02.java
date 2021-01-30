package Turma15;

import java.util.Scanner;

public class vetorMatriz02 {

	public static void main(String[] args) {
		int vetor[] = new int[6];
		int x,soma,num,totalpar=0,totalimpar=0,par=0,impar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("Entre com inteiro");
			num = ler.nextInt();
			vetor[x]= num;
			
			par = num%2;
			if(par == 0) {
				par++;
				totalpar = totalpar + num; 
				System.out.println(num+" é par");
			}else {
				impar++;
				totalimpar = totalimpar + num;
				System.out.println(num+" é impar");
			}
		}
		System.out.println(totalimpar+" é o total de impar");
		System.out.println(totalpar+" é o total de par");		
		
		
	}

}
