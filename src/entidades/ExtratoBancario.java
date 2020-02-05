package entidades;

public class ExtratoBancario {
	private String conta;
	private String saques;
	private String depositos;
	private String transferencias;
	
	public ExtratoBancario() {}

	public ExtratoBancario(String conta, String saques, String depositos, String transferencias) {
		super();
		this.conta = conta;
		this.saques = saques;
		this.depositos = depositos;
		this.transferencias = transferencias;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getSaques() {
		return saques;
	}

	public void setSaques(String saques) {
		this.saques = saques;
	}

	public String getDepositos() {
		return depositos;
	}

	public void setDepositos(String depositos) {
		this.depositos = depositos;
	}

	public String getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(String transferencias) {
		this.transferencias = transferencias;
	};
}
