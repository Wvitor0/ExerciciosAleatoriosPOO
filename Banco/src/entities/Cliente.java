package entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	protected String cpf;
	private String nome;
	private List<Conta> conta = new ArrayList<>();
	private Endereco endereco;
	private List<Telefone> telefone = new ArrayList<>();
	
	public Cliente() {
	}
	
	public Cliente(String cpf, String nome, Endereco endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getConta() {
		return conta;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}
	
	public void addConta(Conta c) {
		conta.add(c);
	}
	
	public void addTel(Telefone t) {
		telefone.add(t);
	}

	public void exibir() {
		System.out.println("CPF: " + cpf);
		System.out.println("Nome: " + nome);
		System.out.println("Endereco: " + endereco.toString());
		System.out.println("Contas: ");

		for(Conta c : conta) {
			System.out.println(c);
		}
		
		System.out.println("Telefones: ");
		
		for(Telefone t : telefone) {
			System.out.println(t);
		}
	}
}
