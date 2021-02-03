package POO;

public class baseCliente {
	public String nomeCliente;
	public String sobrenomeCliente;
	public int numeroCartao;
	
	//METODO CONSTRUTOR
	 public baseCliente(String nomeCliente,String sobrenomeCliente, int numeroCartao) {
		 this.nomeCliente = nomeCliente;
         this.sobrenomeCliente = sobrenomeCliente;
         this.numeroCartao = numeroCartao;
   } 
	 
	//declaração dos demais métodos da classe
	 public void imprimirInfo()
		{
			System.out.println(nomeCliente+" "+sobrenomeCliente+" com o documento numero: "+numeroCartao);
		}

	 
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}

	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	 
	 
}
