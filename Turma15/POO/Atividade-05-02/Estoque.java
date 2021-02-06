package POO;

public class Estoque {
	
	private String produto;
	private int quantide;
	
	public Estoque (String produto, int quantide)
	{
		this.produto = produto;
		this.quantide = quantide;
	}

	public Estoque() {
		
	}

	public String getProduto() {
		return this.produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantide() {
		return quantide;
	}

	public void setQuantide(int quantide) {
		this.quantide = quantide;
	}
	
	public String toString()
	{
		return produto + " - " + quantide;
	}
	
	public int mudarEstoque (int quantide)
	{
		this.quantide += quantide;
		return this.quantide;
	}
	
}