package Turma15;

import java.util.Scanner;

public class condicional02 {
	public static void main (String agrs[]) {
		int n1,n2,n3,maior,menor,meio;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro inteiro");
		n1 = ler.nextInt();
		System.out.println("Entre com o segundo inteiro");
		n2 = ler.nextInt();
		System.out.println("Entre com o terceiro inteiro");
		n3 = ler.nextInt();
			//LOGICA PRA SABER O MAIOR
		if(n1 > n2 && n1 > n3) {
			maior = n1;			
			}else if (n2 > n1 && n2 > n3) {
				maior = n2;				
				}else {
					maior = n3;
			} //LOGICA PRA SABER O DO MEIO
			
		if(n1 > n2 && n1 < n3 || n1 < n2 && n1 > n3) {
			meio = n1;					
			}else if(n2 > n1 && n2 < n3 || n2 < n1 && n2 > n1) {
					meio = n2;				
					}else{
						meio = n3;
					}// LOGICA DO MENOR
		if (n1 < n2 && n1 < n3) {
			menor = n1;
			}else if(n2 < n1 && n2 < n3) {
			 menor = n2;			
				}else {
				 menor = n3;
		}
		
		System.out.println("1= "+menor);
		System.out.println("2= "+meio);
		System.out.println("3= "+maior);
	}			
}

