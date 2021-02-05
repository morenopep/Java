package POO;

public abstract class Animal { // ----CLASSE ABSTRATA MEU JOVEM
	//DECLAREI OS ATRIBUTOS	
	protected String nomeAnimal;
	protected int idadeAnimal;
	protected String somAnimal;
	protected String andarAnimal;	
	
	//METODO CONSTRUTOR
	public Animal(String nomeAnimal, int idadeAnimal, String somAnimal, String andarAnimal) {
		this.nomeAnimal = nomeAnimal;
		this.idadeAnimal = idadeAnimal;
		this.somAnimal = somAnimal;
		this.andarAnimal = andarAnimal;
	}
	
	//METODO ABSTRATO
	abstract public void nomeAnimal(String nome);
	abstract public void idadeAnimal(int idade);
	abstract public void somAnimal(String som);
	abstract public void andarAnimal(String andar);	
	
	
	
}
