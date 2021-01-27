package Turma15;

import java.util.Scanner;

public class condicional01 {
	public static void main (String agrs[]) {
		int n1,n2,n3,maior,menor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro Valor: ");
		n1 = ler.nextInt();
		System.out.println("Entre com o Segundo Valor: ");
		n2 = ler.nextInt();
		System.out.println("Entre com o Terceiro Valor: ");
		n3 = ler.nextInt();
		
		if(n1 > n2 & n1 > n3) {
			maior = n1;
			System.out.println("O maior valor é: "+maior);
		}if(n2 > n1 & n2 > n3) {
			maior = n2;
			System.out.println("O maior valor é: "+maior);
		}if(n3 > n1 & n3 > n2) {
			maior = n3;
			System.out.println("O maior valor é: "+maior);
		}
		
	}		
}
	
