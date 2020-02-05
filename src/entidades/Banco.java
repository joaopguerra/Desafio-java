package entidades;

import java.util.Date;

public class Banco {
	private Integer numeroAgencia;
	private String nomeComercial;
	private Date dataDeFundacao;
	
	public Banco() {}

	public Banco(Integer numeroAgencia, String nomeComercial, Date dataDeFundacao) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.nomeComercial = nomeComercial;
		this.dataDeFundacao = dataDeFundacao;
	}

	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	public Date getDataDeFundacao() {
		return dataDeFundacao;
	}

	public void setDataDeFundacao(Date dataDeFundacao) {
		this.dataDeFundacao = dataDeFundacao;
	};

}
