package Turma15;

import java.util.Scanner;

public class array04 {
	public static void main(String[] args) {
		int t3 = 3;
		int matriz1[][] = new int[t3][t3],somaDiagonais = 0,somaMatriz = 0;
		
		Scanner ler= new Scanner(System.in);
			for(int linha= 0; linha< t3; linha++) {
				for(int coluna=0; coluna< t3; coluna++) {				
					
					//Random
					matriz1[linha][coluna] = (int)Math.round(Math.random() * 9)+ 1;		//pesquisar mais 					 
					somaMatriz+= matriz1[linha][coluna];
					
					if(linha == coluna) {
						somaDiagonais+= matriz1[linha][coluna];
					}
				}
			
			}
			
			
			for(int linha= 0; linha< t3; linha++) {
				for(int coluna=0; coluna< t3; coluna++) {
					System.out.printf("%2d |", matriz1[linha][coluna]);//enfeite rsrs
				}
				System.out.println();//enfeite
			}			
			System.out.println("Soma dos valores da matriz: "+somaMatriz);
			System.out.println("Soma dos valores diagonais da matriz: "+somaDiagonais);					
	}
}
