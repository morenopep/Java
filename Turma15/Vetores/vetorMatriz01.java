package Turma15;

public class vetorMatriz01 {
	public static void main(String agrs[]) {
		int a[] = {1,0,5,-2,-5,7};
		int var,x;
		
		var = a[0]+a[1]+a[5];
		a[4] = 100;
		
		for(x=0;x<6;x++) {
			System.out.println("Posição "+x+" Do vetor vale: "+a[x]);
		}
		
		System.out.println("soma entre os valores das posições\r\n"
				+ "A[0], A[1] e A[5] é: "+var);
		
	}
}
