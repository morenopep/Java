package Turma15;

import java.util.Scanner;

public class array01 {

	public static void main(String args[] ) {
		float vetor[] = new float[5],maior= Float.MIN_VALUE;
		
		Scanner usuario = new Scanner(System.in);
			
			for(int x=0; x < 5; x++) {
				 System.out.printf("Digite o%2dº valor: ", (x+1));
			     vetor[x] = usuario.nextFloat();
			     if(vetor[x] > maior) maior= vetor[x];
			}			
			System.out.println("O maior número digitado foi: "+maior);
				
		}

	}


