package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.Spring;


public class Colecaoset {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("maçã");
		
		System.out.println(frutas);
		
		for(var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}

		System.out.println("Morango existe na coleção? " + frutas.contains("Morango"));

		//Excluir um elemento da coleção
		frutas.remove("Morango");

			//Criar um Iterator
			Iterator<String> iFrutas = frutas.iterator();
			
			// Listar os dados após a exclusão de um elemento
			while(iFrutas.hasNext()) {
				System.out.println(iFrutas.next());
			}
			
			ArrayList<String> frutasList = new ArrayList<String>();
			
			frutasList.addAll(frutas);
			frutasList.sort(null);
			
			System.out.println("Exibir os Dados do Array List");
			frutasList.forEach(System.out::println);			
			
			
			
	}

}
