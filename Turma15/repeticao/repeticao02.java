package Turma15;

import java.util.Scanner;

public class repeticao02 {
	public static void main(String agrs[]) {
		int num,x,impar=0,par=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(x = 1; x < 11 ;x++) {
			System.out.println("Entre com o "+x+"� valor");
			num = ler.nextInt();
			
			if(num%2 == 0) {
				System.out.println(num+" � par");
				par++;
			}else {
				System.out.println(num+" � impar");
				impar++;
			}
		}
		
		System.out.println("total de pares � "+ par);
		System.out.println("total de impares � "+ impar);
		
	}
}
