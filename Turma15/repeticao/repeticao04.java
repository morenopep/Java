package Turma15;

import java.util.Scanner;

public class repeticao04 {
	public static void main(String agrs[]) {
		int idade,sexo,mood,pessoas=0,mulheresnerv=0,homensagre=0,outroscalm=0,calmas=0,maior40=0,menor18=0;
		
		Scanner ler = new Scanner(System.in);
		
		while(pessoas <= 150){
			System.out.println("Qual a sua idade?");
			idade = ler.nextInt();
			System.out.println("Qual a seu sexo? digite 1 para masculino, 2 para feminino ou 3 para outros");
			sexo = ler.nextInt();
			if(sexo > 3 || sexo < 1 ) {
				System.out.println("Voce n�o seguiu as orienta��es de escolha, o sistema sera finalizado \n\n");
				pessoas = 151;
			}
			System.out.println("Digite 1 para Calma; 2 para Nervosa; 3 para Agressiva ");
			mood = ler.nextInt();
			if(mood > 3 || mood < 1 ) {
				System.out.println("Voce n�o seguiu as orienta��es de escolha, o sistema sera finalizado \n\n");
				pessoas = 151;
			}
			
			pessoas++;
			
			if(mood == 1) {
				calmas++;
			}				
			
			if(mood == 2 && sexo == 2) {
				mulheresnerv++;
			}
			if(mood == 3 && sexo == 1) {
				homensagre++;
			}
			
			if(mood == 1 && sexo == 3) {
				outroscalm++;
			}
			if(mood == 2 && idade > 40) {
				maior40++;
			}
			if(mood == 1 && idade < 18) {
				menor18++;
			}		
			
			
			System.out.println("O numero de pessoas calmas �: "+calmas);
			System.out.println("O numero de Mulheres nervosa �: "+mulheresnerv);
			System.out.println("O numero de homens agressivos �: "+homensagre);
			System.out.println("O numero de outros calmos �: "+outroscalm);
			System.out.println("O numero de pessoas nevosas com mais de 40 anos �: "+maior40);
			System.out.println("O numero de pessoas calmas com menos de 18 anos �: "+menor18);
			
		}
	}
}
