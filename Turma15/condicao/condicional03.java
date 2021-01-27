package Turma15;

import java.util.Scanner;

public class condicional03 {
	public static void main (String agrs[]) {
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com sua idade");
		idade = ler.nextInt();
		
		if(idade >=10 && idade <= 14) {
			System.out.println("Você se encontra na categoria Infantil");
		}else if (idade >=15 && idade <= 17) {
			System.out.println("Você se encontra na categoria Juvenil");
		}else if (idade >= 18 && idade <= 25) {
			System.out.println("Você se encontra na categoria Adulto");
		}else {
			System.out.println("Você não esta em nenhumas das categorias!!");
		}
	}
}
