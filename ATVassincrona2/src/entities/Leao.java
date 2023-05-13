package entities;

public class Leao extends Mamifero{
	private int vacinas;

	public Leao(int id, String nome, int idade, double peso, int qtdPelos, int vacinas) {
		super(id, nome, idade, peso, qtdPelos);
		this.vacinas = vacinas;
	}

	public int getVacinas() {
		return vacinas;
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
				"vacinas: " + vacinas;
	}
}
