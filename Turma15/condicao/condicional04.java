package Turma15;

import java.util.Scanner;

public class condicional04 {
	public static void main (String agrs[]) {
		double num,par,impar,raiz,pot;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		num = ler.nextFloat();
		
		if (num%2 == 0) {
			par = num;
			raiz = Math.sqrt(par);
			System.out.println(num+" é par e sua raiz quadrada é: "+raiz);
		}else {
			impar = num;
			pot = Math.pow(impar,2);
			System.out.println(num+" é impar e sua potencia é: "+pot);
		}
		
	}
}
