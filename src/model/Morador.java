package model;

public class Morador {
	
	private int numAp;
	private String nomeM;
	private String modeloC;
	private String corC;
	private String placaC;

	public Morador() {
		super();
	}
	
	public Morador(int numAp, String nomeM, String modeloC, String corC, String placaC) {
		this.numAp = numAp;
		this.nomeM = nomeM;
		this.modeloC = modeloC;
		this.corC = corC;
		this.placaC = placaC;
	}
	
	public int getNumAp() {
		return numAp;
	}

	public void setNumAp(int numAp) {
		this.numAp = numAp;
	}

	public String getNomeM() {
		return nomeM;
	}

	public void setNomeM(String nomeM) {
		this.nomeM = nomeM;
	}

	public String getModeloC() {
		return modeloC;
	}

	public void setModeloC(String modeloC) {
		this.modeloC = modeloC;
	}

	public String getCorC() {
		return corC;
	}

	public void setCorC(String corC) {
		this.corC = corC;
	}

	public String getPlacaC() {
		return placaC;
	}

	public void setPlacaC(String placaC) {
		this.placaC = placaC;
	}

	@Override
	public String toString() {
		return "Morador: " + nomeM + ", nº apt.: " + numAp + ", modelo do carro: " + modeloC + ", cor do carro:" + corC + ", placa do carro:"
				+ placaC;
	}

	public int hashCode() {
		return (numAp - 100) / 100;
	}
}
