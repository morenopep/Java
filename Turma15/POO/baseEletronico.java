package POO;

public class baseEletronico {
	public String hardware;	
	public int numSerie;

	public baseEletronico(String nariz, int numSerie) {
		this.hardware = nariz;		
		this.numSerie = numSerie;
	}
	
	public void imprimirInfo() {
		System.out.println("O "+hardware+" do numero de Serie "+numSerie);
	}

	public String getHardware() {
		return hardware;
	}

	public void setHardware(String hardware) {
		this.hardware = hardware;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	
	
	
}
