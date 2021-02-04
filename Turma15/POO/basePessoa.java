package POO;

public class basePessoa {
//	Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
//	(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
//	op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
//	String telefone;
	
	//DECLARA��O DE ATRIBUTOS DA MINHA CLASSE
	public String nome;
	public String endereco;
	public int idade;
	public double telefone;
	
	//METODO CONSTRUTOR
	public basePessoa(String nome, String endereco,int idade, double telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	//DECLARA��O DOS DEMAIS METODOS DA CLASSE
//	public void checarTel() {
//		if(getTelefone().length() =! 11 ) {
//			System.out.println("");
//		}
//	}
	
	public void checarIdade() {
		if(idade < 18) {
			System.out.println("Voc� n�o tem mais de 18 anos");
		}
		else {
			System.out.println("Voc� tem mais de 18 anos");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
}


