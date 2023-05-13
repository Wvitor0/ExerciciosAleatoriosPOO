package entities;

public class Lobo extends Mamifero{
	private boolean ehAlpha;

	public Lobo(int id, String nome, int idade, double peso, int qtdPelos, boolean ehAlpha) {
		super(id, nome, idade, peso, qtdPelos);
		this.ehAlpha = ehAlpha;
	}

	public boolean isEhAlpha() {
		return ehAlpha;
	}

	@Override
	public String alimentos(String alimento) {
		return alimento;
	}

	@Override
	public void crescer() {
		
	}
	
	@Override
	public void comer() {
		this.peso += 1;
	}

	@Override
	public void correr() {
		this.peso -= 2;
	}

	@Override
	public String familia(String familia) {
		return familia;
	}
	
	public String toString() {
		return "id: " + getId() + "\n" + 
				"nome: " + getNome() + "\n" + 
				"idade: " + getIdade() + "\n" + 
				"peso: " + getPeso() + "\n" + 
				"pelos: " + getQtdPelos() + "\n" +
				"alpha: " + ehAlpha;
	}
}
