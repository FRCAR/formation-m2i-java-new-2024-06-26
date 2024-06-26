package com.bigcorp.project.main.cours.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bigcorp.project.main.lambda.Matiere;

public class StreamMain {

	public static void main(String[] args) {
		List<String> maListe = new ArrayList<>();
		maListe.add("Salut");
		maListe.add("Ca va ?");
		maListe.add("Super");

		maListe.stream()
				.filter(s -> s.contains("a"))
				.peek(System.out::println)
				.filter(s -> s.contains("u"))
				.forEach(s -> System.out.println("A la sortie, j'affiche : " + s));

		// Le stream ci-dessus équivaut à la boucle ci-dessous
//		for (String s: maListe) {
//			if(s.contains("a")) {
//				if(s.contains("u")) {
//					System.out.println("A la sortie, j'affiche : " + s);
//			}
//		}
//	}

		maListe.stream()
				.filter((String s) -> {
					return s.contains("a");
				})
				.map((String s) -> {
					return new Matiere(s, 0, 0);
				})
				.forEach((Matiere m) -> {
					System.out.println("La matièere créée est : " + m);
				});
		
		int nombreTotalDeCaracteresDansMaListe = maListe.stream().mapToInt(s -> s.length()).sum();
		System.out.println("Nombre total de caracteres " + nombreTotalDeCaracteresDansMaListe);
		
		boolean auMoinsUnElementDeTailleSup2 = maListe.stream().anyMatch(s -> s.length() > 2);
		System.out.println("Au mons un élément de taille > 2 " + auMoinsUnElementDeTailleSup2);
		
		//On met le stream dans un nouveau set
		maListe.stream().collect(Collectors.toSet());

		//On trie le stream par longueur de chaîne croissante
		maListe.stream().sorted((s1,s2)-> s1.length() - s2.length()).forEach(System.out::println);;
	}

}
