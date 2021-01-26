package Turma15;

import java.util.Scanner;

public class Atividade04 {
	public static void main (String agrs[]) {
		int a,b,c,d,r,s;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("entre com o Valor de A");
		a = ler.nextInt();
		System.out.println("entre com o Valor de B");
		b = ler.nextInt();
		System.out.println("entre com o Valor de C");
		c = ler.nextInt();
		
		r = (int) Math.pow((a+b),2);
		s = (int) Math.pow((b+c),2);
		d = (r+s)/2;
		
		System.out.println("r = "+r+" s = "+s+" d = "+d);
		
	}
}
