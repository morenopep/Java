package POO;

public class baseFuncionario {
	public String nomeFuncionario;
	public String endereco;
	public int numContato;
	
	//METODO CONTRUSTOR
	
	public baseFuncionario(String nome, String rua, int telefone){
		this.nomeFuncionario = nome;
		this.endereco = rua;
		this.numContato = telefone;
	}
	
	public void imprimirInfo() {
		System.out.println("O Funcionario(a) "+nomeFuncionario+" que mora na "+endereco+" tem o telefone "+numContato);
	}
}
