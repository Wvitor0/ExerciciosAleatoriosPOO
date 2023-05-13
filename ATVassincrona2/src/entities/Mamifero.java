package entities;

public abstract class Mamifero extends Animais{
	private int qtdPelos;
	
	public Mamifero() {
		
	}
	
	public Mamifero(int id, String nome, int idade, double peso, int qtdPelos) {
		super(id, nome, idade, peso);
		this.qtdPelos = qtdPelos;
	}

	
	public int getQtdPelos() {
		return qtdPelos;
	}
	
	public abstract String alimentos(String alimento);
}
