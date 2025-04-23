package aula_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercicio01_CollectionList {

	public static void main(String[] args) {

		Set<String> cores = new LinkedHashSet<String>();
		Scanner leia = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a " + i + "ª cor:");
			String cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("\nListar todas as Cores:\n");
		for (var cor : cores) {
			System.out.println(cor);
		}
		List<String> ListaCores = new ArrayList<String>(cores);

		Collections.sort(ListaCores);

		System.out.println("\nOrdenar as Cores:");
		for (String cor : ListaCores) {
			System.out.println(cor);
		}

		leia.close();
	}
}