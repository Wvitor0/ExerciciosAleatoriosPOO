package entities;

public class Aguia extends Ave{
	private boolean gerouFilhos;

	public Aguia(int id, String nome, int idade, double peso, double envergaduraAsas, boolean gerouFilhos) {
		super(id, nome, idade, peso, envergaduraAsas);
		this.gerouFilhos = gerouFilhos;
	}

	public boolean isGerouFilhos() {
		return gerouFilhos;
	}

	@Override
	public void ehVoador(boolean voa) {
		if(voa == true) {
			System.out.println("O pato voa");
		}
		else {
			System.out.println("O pato não voa");
		}
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
				"envergadura: " + getEnvergaduraAsas() + "\n" +
				"gerou filhos: " + gerouFilhos;
	}
}
