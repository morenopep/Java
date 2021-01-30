package Turma15;

import java.util.Scanner;

public class vetorMatriz03 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int x,y,num,cont=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
				System.out.println("Entre com o valores da matriz");
				num = ler.nextInt();
				matriz[x][y] = num;
				
				if(num > 10) {					
					System.out.println(num+" é maior de 10 ");
					cont++;
				}
			}
		}	
		System.out.println(cont+" é a Quantidade de numeros maiores de 10 ");
	}

}
