package POO;

public class Preguica extends Animal{
	public Preguica() {
		super("Carolzinha",23,"Zzzzz","Só dorme");
	}
	
	@Override
		public void nomeAnimal(String nome) {
		System.out.println(super.nomeAnimal);
		}
	@Override
		public void idadeAnimal(int idade) {
		System.out.println(super.idadeAnimal);
		}
	@Override
		public void somAnimal(String som) {
		System.out.println(super.somAnimal);
		}
	@Override
		public void andarAnimal(String andar) {
		System.out.println(super.andarAnimal);
		}	

}
