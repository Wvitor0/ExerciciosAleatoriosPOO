package entities;

public class Animal {
	private String nome;
	private String familia;
	private int idade = 0;
	private boolean estado = true;
	private String classe;
	private int forca = 10;
	private int calorias = 10;
	
	public Animal() {
	}
	
	public Animal(String nome, String familia, String classe) {
		this.nome = nome;
		this.familia = familia;
		this.classe = classe;
		
		System.out.println("O animal nasceu!");
		System.out.println();
		System.out.println("O nome é: " + nome + "\n" + "A familia é: " + familia + "\n" + 
				"A classe é: " + classe + "\n" + 
				"A idade é: " + idade + "\n" + 
				"A força é: " + forca + "\n" +
				"As calorias sao: " + calorias);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
	public void morrer() {
		forca = 0;
		estado = false;
		System.out.println("O animal morreu!");
	}
	
	public void comer() {
		if(estado == true && calorias < 100) {
			calorias += 10;
			forca -= 2;
			
			if(forca < 0) {
				forca = 0;
			}
			
			System.out.println("O animal comeu e agora suas calorias aumentaram para " + calorias + " e sua forca diminiu para " + forca);
		}
		
		else {
			System.out.println("O animal está cheio!");
		}
	}
	
	public void correr() {
		if(estado == true && calorias > 0) {
			calorias -= 5;
			forca -= 5;
			
			if(calorias < 0) {
				calorias = 0;
			}
			if(forca < 0) {
				forca = 0;
			}
			
			System.out.println("O animal correu e agora suas calorias diminuiram para " + calorias + " e sua forca diminuiu para " + forca);
		}
		
		else {
			System.out.println("O animal está fraco!");
		}
	}
	
	public void dormir() {
		if(estado == true) {
			calorias -= 2;
			forca += 10;
			System.out.println("O animal dormiu e agora suas calorias valem " + calorias + " e sua forca aumentou para " + forca);
		}
	}
}
