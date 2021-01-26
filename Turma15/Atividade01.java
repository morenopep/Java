package Turma15;

import java.util.Scanner;

public class Atividade01 {
	public static void main (String agrs[]) {
		int idade, mes, dias,cont;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual a sua idade expressa em anos?");
		idade = ler.nextInt();
		System.out.println("Qual a sua idade expressa em meses?");
		mes = ler.nextInt();
		System.out.println("Qual a sua idade expressa em dias?");
		dias = ler.nextInt();
		
		cont = (idade * 365) + (mes * 31) + dias;
		
		System.out.println("Sua idade expressa em dias é:"+cont);		
		
	}
	
}
