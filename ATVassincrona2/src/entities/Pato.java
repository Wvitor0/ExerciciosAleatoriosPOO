package entities;

public class Pato extends Ave{
	private String corPenas;

	public Pato(int id, String nome, int idade, double peso, double envergaduraAsas, String corPenas) {
		super(id, nome, idade, peso, envergaduraAsas);
		this.corPenas = corPenas;
	}

	public String getCorPenas() {
		return corPenas;
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
		
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
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
				"cor: " + corPenas;
	}
}
