package entities;

import java.util.ArrayList;
import java.util.List;

public class Registro {
	private List<Cliente> lista = new ArrayList<>();

	public Registro() {
	}
	
	public void adicionarCliente(Cliente c) {
		lista.add(c);
	}
	
	public void removerCliente(String resposta) {
		for(Cliente c : lista) {
			if(c.getCpf().equals(resposta)) {
				lista.remove(c);
				System.out.println("Cliente removido!");
				break;
			}
			
			else {
				System.out.println("Cliente não encontrado!");
				break;
			}
		}
	}
	
	public void listarClientes() {
		for(Cliente c : lista) {
			c.exibir();
			System.out.println("===================================");
		}
	}
}
