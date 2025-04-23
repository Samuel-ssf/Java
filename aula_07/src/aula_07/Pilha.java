package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Cria a Estrutura de dados Pilha
		Stack<String> pilha = new Stack<String>();
		
		// Adiciona elementos na pilha
		pilha.add("Comunica��o n�o Violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A Coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Di�rio de um Banana");
		pilha.add("Senhor dos An�is");
		pilha.add("O C�digo Da Vinci");
		
		// Adicionar um elemento na pilha, via teclado 
		System.out.println("Digite o T�tulo de um livro: ");
		pilha.push(leia.nextLine());
		
		System.out.println(pilha);
		
		// Retira um elemento da Pilha 
		pilha.pop();
		
		System.out.println(pilha);
		
		// Adiciona um Elemento na pilha
		pilha.push("Roube como um Artista");

		System.out.println(pilha);
		
		// Exibe o elemento que est� no topo da pilha
		System.out.println(pilha.peek());
		
		// Verifica se um elemento existe na pilha
		System.out.println("O Livro Di�rio de um Banana, existe na Pilha? " + pilha.contains("Di�rio de um Banana"));
		
		leia.close();
	}

}
