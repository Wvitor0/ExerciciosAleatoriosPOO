package entities;

public abstract class Animais {
	private int id;
	private String nome;
	private int idade; 
	protected double peso;
	
	public Animais() {
		
	}
	
	public Animais(int id, String nome, int idade, double peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public abstract void crescer();
	public abstract void comer();
	public abstract void correr();
	public abstract String familia(String familia);
}
