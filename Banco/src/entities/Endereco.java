package entities;

public class Endereco {
	private String cep;
	private String logradouro;
	private String numero;
	
	public Endereco(String cep, String logradouro, String numero) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "CEP: " + cep + "\n" + "Logradouro: " + logradouro + "\n" + "Numero: " + numero;
	}
}
