package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02_Pilha {

		    public static void main(String[] args) {



		        Stack<String> pilha = new Stack<String>();
		        int tamanhoLinha = 40;
		        String livro;
		        int opcao;
		        Scanner scanner = new Scanner(System.in);

		        do {

		            System.out.printf("%s\n", "".repeat(tamanhoLinha));
		            System.out.println("\n1 - Adicionar Livro na Pilha:");
		            System.out.println("2 - Listar todos os Livros:");
		            System.out.println("3 - Retirar Livro da Pilha:");
		            System.out.println("0 - Sair:\n");
		            System.out.printf("%s\n", "".repeat(tamanhoLinha));
		            System.out.println("Entre com a opção desejada:");
		            opcao = Integer.parseInt(scanner.nextLine());

		            switch(opcao){
		                case 1 :

		                    System.out.println("Digite o nome do livro:");
		                    livro = scanner.nextLine();

		                    pilha.push(livro);

		                    System.out.println(livro + " foi adicionado a Pilha.");
		                    break;
		                case 2 :

		                    if(pilha.isEmpty())System.out.println("Não existe nenhum Livro na Pilha:");

		                    else System.out.println(pilha);
		                    break;
		                case 3 :

		                    if(pilha.isEmpty())System.out.println("Não existe Livro para ser removido:");

		                    else System.out.printf("Livro %s removido:\n", pilha.pop());
		                    break;
		                case 0 :

		                    System.out.println("Finalizando programa.");
		                    break;
		                default :

		                    System.out.println("Opção invalida.");
		                    break;

		            }
		        }
		        while(opcao != 0);
		        scanner.close();
		        return;
		    }
}




