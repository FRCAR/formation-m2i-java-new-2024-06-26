package com.bigcorp.project.main.cours;

import java.util.Set;
import java.util.stream.Stream;

public class TakeDropIterateStream {

	public static void main(String[] args) {
		//Utilisation de dropWhile
		//Fonctionne bien avec un stream ordonné
		Stream.of("a", "b", "c", "", "e", "", "f", "g")
				.dropWhile(s -> !s.isEmpty())
				.forEach(s -> System.out.println("-" + s + "-"));

		//Utilisation de dropWhile
		//Ne fonctionne  pas bien avec un stream non ordonné
		System.out.println("Utilisation de dropWhile dans un set");
		Set<String> hashSet = Set.of("a", "b", "c", "", "e", "f", "g");
		hashSet.stream().dropWhile(s -> !s.isEmpty())
				.forEach(s -> System.out.println("-" + s + "-"));

		//Utilisation de iterate, avec ses deux versions
		Stream.iterate(3, i -> i * 2).takeWhile(i -> i < 300).forEach(System.out::println);
		Stream.iterate(3, i -> i < 300, i -> i * 2).count();

	}

}
