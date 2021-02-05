package POO;

import java.util.Scanner;
public class Floresta {
	public void main(String agrs[]) {
		int num;		
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica monkey = new Preguica();
		
		Scanner entradaUser = new Scanner(System.in);		
		
		System.out.println("Escolha qual animal você deseja ouvir o som: ");		
		System.out.println("\n1 - Cavalo\n2 - Cachorro\n3 - Preguiça");
		num = entradaUser.nextInt();
		
		if(num == 1) {
			dog.nomeAnimal();
		}
		else if(num == 2) {
			horse.somAnimal();
		}
		else if(num == 3) {
			monkey.somAnimal();
		}
		else {
			System.out.println("Numero inválido....Reinicie o sistema");
		}
		
		
	}
}
