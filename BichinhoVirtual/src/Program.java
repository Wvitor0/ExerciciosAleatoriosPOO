import java.util.Scanner;
import entities.Animal;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do animal: ");
		String nome = sc.next();
		
		System.out.print("Digite a familia do animal: ");
		String familia = sc.next();
		
		System.out.print("Digite a classe do animal: ");
		String classe = sc.next();
		
		System.out.println();
		Animal a = new Animal(nome, familia, classe);
		System.out.println();
		
		while(a.isEstado() == true) {
			System.out.print("Qual acao deseja executar (comer[1], correr[2], dormir[3], morrer[4])? ");
			int r = sc.nextInt();
			
			if(r == 1) {
				a.comer();
				System.out.println();
			}
			
			if(r == 2) {
				a.correr();
				System.out.println();
			}
			
			if(r == 3) {
				a.dormir();
				System.out.println();
			}
			
			if(r == 4) {
				a.morrer();
				System.out.println();
			}
		}
		
		sc.close();
	}
}
