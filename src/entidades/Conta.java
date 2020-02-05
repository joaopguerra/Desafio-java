package entidades;

public abstract class Conta {
	private Integer numero;
	private Double saldo;
	private Cliente cliente;
	private Banco banco;
	
	public Conta() {}
	
	public Conta(Integer numero, Double saldo, Cliente cliente, Banco banco) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.banco = banco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public abstract void sacar (Double valor);
	
	public abstract void depositar (Double valor);
	
	public abstract void transferir (Double valor, Conta conta);
	

}
