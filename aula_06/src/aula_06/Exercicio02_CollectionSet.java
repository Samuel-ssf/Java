package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio02_CollectionSet {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<>();

		System.out.println("Insira 10 Números nao Repitidos:");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("\nInsira um Número %d:", i);
			numeros.add(leia.nextInt());
		}

		Iterator<Integer> iNumeros = numeros.iterator();
		
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());

		}

		leia.close();

	}

}
