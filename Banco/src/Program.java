import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.Endereco;
import entities.Registro;
import entities.Telefone;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Registro r = new Registro();
		
		
		while (true) {
			System.out.print("O que deseja fazer? 1-Cadastrar cliente, 2-Listar clientes, 3-Excluir cliente, 4-Sair");
			System.out.println();
			int opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.print("CPF: ");
				String cpf = sc.next();
				
				System.out.print("Nome: ");
				String nome = sc.next();
				
				System.out.println("ENDERECO");
				System.out.print("CEP: ");
				String cep = sc.next();
				
				System.out.print("Logradouro: ");
				String log = sc.next();
				
				System.out.print("Numero: ");
				String num = sc.next();
				
				Cliente cliente = new Cliente(cpf, nome, new Endereco(cep, log, num));				
				
				Telefone telefone1 = new Telefone("81", "99509-6969");
				cliente.addTel(telefone1);
				Telefone telefone2 = new Telefone("83", "95990-9988");
				cliente.addTel(telefone2);
				Conta conta1 = new Conta("409490-99", "1344");
				cliente.addConta(conta1);
				Conta conta2 = new Conta("488948-98", "1345");
				cliente.addConta(conta2);
				
				r.adicionarCliente(cliente);
			}

			if (opcao == 2) {
				System.out.println("===================================");
				r.listarClientes();
			}

			if (opcao == 3) {
				System.out.print("Digite o cpf do cliente que deseja excluir: ");
				String resposta = sc.next();
				
				r.removerCliente(resposta);
			}

			if (opcao == 4) {
				System.out.println("VOCÊ SAIU!");
				break;
			}
		}
		sc.close();
	}
}
