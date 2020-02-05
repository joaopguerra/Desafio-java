package entidades;

import java.util.Date;

public class Cliente {
	
	private String nome;
	private String cpf;
	private Date dataDeNascimento;
	private Double rendaMensal;
	private Endereco endereco;
	private String email;
	private String telefone;
	
	public Cliente() {}

	public Cliente(String nome, String cpf, Date dataDeNascimento, Double rendaMensal,
			Endereco endereco, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.rendaMensal = rendaMensal;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Double getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(Double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento + ", rendaMensal="
				+ rendaMensal + ", endereco=" + endereco + ", email=" + email + ", telefone=" + telefone + "]";
	};
	
	
	
	

}
