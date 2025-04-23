package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01_Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		String nome;

		do {
			System.out.println("\n******************************************");
			System.out.println("1 - Adicionar Cliente na Fila            *");
			System.out.println("2 - Listar todos os Clientes		 *");
			System.out.println("3 - Retirar Cliente da Fila	         *");
			System.out.println("0 - Sair			         *");
			System.out.println("******************************************");
			
			System.out.println("Digite uma Opção: ");
			opcao = Integer.parseInt(leia.nextLine());

			switch (opcao) {
			case 1:
				System.out.println("Digite Digite o Nome: ");
				nome = leia.nextLine();

				fila.add(nome);

				System.out.println(nome + " Adicionado(a) à fila!");

				break;

			case 2:

				System.out.println(fila);

				break;

			case 3:

				fila.remove();

				break;

			case 0:

				System.out.println("Programa sendo Finalizado!!");
				break;

			default:
				System.out.println("/nO Cliente foi Chamado!");
				System.out.println("Opção invalida.");
			}

		} while (opcao != 0);
		leia.close();
		return;
	}

}
