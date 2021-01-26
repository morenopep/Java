package Turma15;

import java.util.Scanner;

public class Atividade03 {
	public static void main (String agrs[]) {
		int sec,min,hr,cont,evento; 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos Segundos durará o Evento? ");
		evento = ler.nextInt();
		
		hr = evento/3600;
		min = (evento%3600)/60;
		sec = (evento%3600)%60;
		
		System.out.println("Seu evento tera "+hr+" horas, "+min+" minutos e "+sec+" Segundos");
		
		
		
	}
}
