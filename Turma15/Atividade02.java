package Turma15;

import java.util.Scanner;

public class Atividade02 {
	public static void main (String agrs[]) {
		int dias,meses,anos,cont;
		
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Escreva sua idade expressa em dias:");
		dias = ler.nextInt();
		
		anos = dias/365;
		meses = (dias%365)/30;
		dias = (dias%365)%30;
		
		System.out.println("você tem "+anos+" anos, "+meses+" meses, "+dias+" dias.");
		
	}
}
