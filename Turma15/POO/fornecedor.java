package POO;

public class fornecedor extends basePessoa {
		//DECLARAÇÃO DE ATRIBUTOS DA MINHA CLASSE
	
		private int valorCredito;
		private int valorDivida;
		
		//METODO CONSTRUTOR
	public fornecedor(String nome, String endereco,int idade, double telefone, int valorCredito,int valorDivida) {
		
		super(nome, endereco,idade, telefone); //HERDANDO OS "PARAMETROS DA MINHA SUPER CLASSE"
		
		this.valorCredito = valorCredito;//DESSA CLASSE
		this.valorDivida = valorDivida;//DESSA CLASSE	
	}
	
	//DECLARAÇÃO DOS DEMAIS METODOS DA CLASSE
	public void obterSaldo() {		
			int saldo = valorCredito - valorDivida;
			System.out.println(nome+"Seu saldo é: "+saldo+" entraremos em contato pelo seu numero "+telefone);			
		}



	int getValorCredito() {
		return valorCredito;
	}


	private void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}


	int getValorDivida() {
		return valorDivida;
	}


	private void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	
	
//		Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe
//		Fornecedor. Considere que cada instância da classe Fornecedor tem, para além dos atributos
//		que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito
//		máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor).
//		Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores,
//		um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e
//		valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
//		adequado que lhe permita verificar o funcionamento dos métodos implementados na classe
//		Fornecedor e os herdados da classe Pessoa.
		
		
		
		

	

}
