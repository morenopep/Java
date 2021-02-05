package POO;

public class Cachorro extends Animal {
	public Cachorro() {
		super("Nina",1,"Au Au Au","Corre com 4 patinhas rs");
		
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
