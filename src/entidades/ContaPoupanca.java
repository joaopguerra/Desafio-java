package entidades;

public class ContaPoupanca extends Conta{

	@Override
	public void sacar(Double valor) {
		Double saldo = super.getSaldo() - valor;
	}

	@Override
	public void depositar(Double valor) {
		Double saldo = super.getSaldo() + valor;
	}

	@Override
	public void transferir(Double valor, Conta conta) {
		Double saldo = conta.getSaldo() + valor;
		conta.setSaldo(saldo);
		
	}

}
