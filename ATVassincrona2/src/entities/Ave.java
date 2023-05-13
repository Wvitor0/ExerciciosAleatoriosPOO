package entities;

public abstract class Ave extends Animais{
	private double envergaduraAsas;
	
	public Ave() {
		
	}

	public Ave(int id, String nome, int idade, double peso, double envergaduraAsas) {
		super(id, nome, idade, peso);
		this.envergaduraAsas = envergaduraAsas;
	}

	public double getEnvergaduraAsas() {
		return envergaduraAsas;
	}

	public String getAlimento(String alimento) {
		return "O animal " + super.getNome() + " se alimentou de " + alimento;
	}
	
	public abstract void ehVoador(boolean voa);
}
