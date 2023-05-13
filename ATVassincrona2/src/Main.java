import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aguia;
import entities.Animais;
import entities.Leao;
import entities.Lobo;
import entities.Pato;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Animais> lista = new ArrayList<>();

		System.out.println("Insira um animal:");

		while (true) {
			System.out.print("Qual animal deseja inserir (Leao, Lobo, Pato, Aguia)? ");
			String resposta2 = sc.next();
			
			switch (resposta2) {
				case "Leao":
					lista.add(new Leao(1, "Juba", 15, 50.0, 1250000, 5));
				case "Lobo":
					lista.add(new Lobo(2, "Lobao", 20, 43.0, 1550000, true));
				case "Pato":
					lista.add(new Pato(3, "Quak", 2, 2.0, 80.0, "verde"));
				case "Aguia":
					lista.add(new Aguia(4, "Visionario", 5, 5.0, 120.0, true));
			}

			System.out.println("Deseja inserir mais um animal(s/n)?");
			String r = sc.next();

			if (r.charAt(0) == 'n') {
				break;
			}
		}

		System.out.print("Digite o id do animal a ser removido: ");
		int id = sc.nextInt();

		for (Animais a : lista) {
			if (id == a.getId()) {
				lista.remove(a);
				System.out.println(a);
				break;
			}
		}
	
	sc.close();
		
	}
}
