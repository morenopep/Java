package Turma15;

public class repeticao01 {
	public static void main (String agrs[]) {
		int num,res;
		
		for(num = 1000;num<2000;num++) {
			res = num%11;
			
			if(res == 5 ) {				
				System.out.println(num);
			}			
		}
	}
}
