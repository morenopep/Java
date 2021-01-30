package Turma15;

import java.util.Scanner;

public class array02 {

	public static void main(String[] args) {
		int dado[] = new int[10];
		int x,soma=0,contMaior=0;
		float mediaDeLancamento;
		
		Scanner ler = new Scanner(System.in); 
		
		for(x=0;x<10;x++) { //----> esse for é para inserir os dados dentro do array
			System.out.println("Entre Com os valores do Lançamento "+(x+1));
			dado[x] = ler.nextInt();
			soma+= dado[x];
			while(dado[x]<=0 || dado[x] > 6) {
				System.out.println("Entre Com os valores do Lançamento "+(x+1));
				dado[x] = ler.nextInt();
			}
			
			
			if(dado[x] == 6) {//Conta quantas vezes saiu o 6 No dado
				contMaior++;
			}
		}
		
		for(x=0;x<10;x++) {
			System.out.printf("\n Lançamento[%d] = %d",(x+1),dado[x]);
		}
		mediaDeLancamento = soma/10;
		
		
		System.out.println("\nA media é: "+mediaDeLancamento);
		System.out.println("O maior numero foi lançado: "+contMaior+" Vezes");
	}

}
