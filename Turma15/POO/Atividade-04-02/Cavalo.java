package POO;

public class Cavalo extends Animal{
	public Cavalo() {
		super("Troia",13,"Hiin in in","Pocoto Pocoto ");
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
