package entities;

public class Conta {
	private String numero;
	private String agencia;
	private Double saldo = 0.0;
	
	public Conta(String numero, String agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Numero da conta: " + numero + "\n" + "Agencia: " + agencia + "\n" + "Saldo: " + saldo; 
	}
}
