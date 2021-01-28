package Turma15;

import java.util.Scanner;

public class repeticao03 {
	public static void main (String agrs[]) {
		int maior=0, menor=0, x=0;
		
		Scanner ler = new Scanner(System.in);
		
		while(x > -99) {
			
		System.out.println("Entre com Sua idade");
		x = ler.nextInt();
			if(x < 21) {
				menor++;
			}else if(x > 50) {
				maior++;
			}			
		}
		System.out.println("o Total menor de 21 é "+menor+" e o total maior de 50 é "+maior);
	}
}
