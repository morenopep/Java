package POO;

public class baseAviao {
	public String nomeAviao;
	public String modeloAviao;
	public int horasDeVoo;
	
	//METODO CONSTRUTOR
	public baseAviao(String nomeAviao,String modeloAviao,int horasDeVoo) {
		this.nomeAviao = nomeAviao;
		this.modeloAviao = modeloAviao;
		this.horasDeVoo = horasDeVoo;
	}
	
	//declaração dos demais métodos da classe
	
	public void imprimirInfo(){
		System.out.println("O "+nomeAviao+", modelo "+modeloAviao+" tem "+horasDeVoo+" mil horas de voo");
	}

	public String getNomeAviao() {
		return nomeAviao;
	}

	public void setNomeAviao(String nomeAviao) {
		this.nomeAviao = nomeAviao;
	}

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}

	public int getHorasDeVoo() {
		return horasDeVoo;
	}

	public void setHorasDeVoo(int horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}
	
	
}
