package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Criamos a coleçao ArrayList
		ArrayList<Double> numeros = new ArrayList<Double>();

		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);

		//System.out.println("Digite um número real: ");
		// double imput = leia.nextDouble();

		// numeros.add(imput);

		// Listando os Valores da Coleção ArrayList
		for (var numero : numeros) {
			System.out.println(numero);
		}

		System.out.println("Indice do número 9.0: " + numeros.indexOf(9.0));

		System.out.println("O número 9.0 existe na coleção?: " + numeros.contains(9.0));

		System.out.println("Qual valor está armazenado no indice 2? " + numeros.get(2));

		// Alterar o valor de um elemento
		numeros.set(2, 10.0);

		
		// Exibe os dados atualizados, através do método ForEach
		System.out.println("Exibe os Dados após a atualização ");
		numeros.forEach(System.out::println);

		// Excluir um elemento da lista, com base no indice
		numeros.remove(2);
		
		//Excluir um elemento da lista, com base no elemento
		numeros.remove(2.0);
		
		//Exibe os Dados atualizados, através do forEach
		System.out.println("Exibe os Dados após a exclusao ");
		numeros.forEach(System.out::println);
			
		System.out.println("Qual é o tamanho da coleção? " + numeros.size());
		
		//Limpar a coleção
		//numeros.clear();
		
		System.out.println("A coleção está vazia? " + numeros.isEmpty());
		
		//ordenar a coleção
		numeros.sort(null);

		System.out.println("Exibir os dados ordenados em ordem crescente ");
		numeros.forEach(System.out::println);
		
		numeros.sort(Comparator.reverseOrder());
		
		System.out.println("Exibir os dados ordenados em ordem decrescente ");
		numeros.forEach(System.out::println);
			
			
		leia.close();
	}

}
