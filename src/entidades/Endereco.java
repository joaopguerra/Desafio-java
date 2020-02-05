package entidades;

public class Endereco {
	private String rua;
	private Integer numero;
	
	public Endereco() {};
	
	public Endereco (String rua, Integer numero) {
		this.rua = rua;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return rua + ", " + numero;
	}

}
