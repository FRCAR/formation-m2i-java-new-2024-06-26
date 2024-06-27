package com.bigcorp.project.main.cours.optional;

import java.util.Optional;

public class OptionalMain {
	
	public static void main(String[] args) {
		
		String maChaine = "ljk";
		
		//Utilisation de != null avant d'appeler une méthode sur maChaine
		if(maChaine != null) {
			System.out.println(maChaine.length());
		}
		
		String maChaine2 = "lkjlkj";
		//du code qui peut rendre null maChaine2 ...
		
		//Création d'un Optional via ofNullable
		Optional<String> optionalMaChaine2 = Optional.ofNullable("quelque chose");
		
		//Utilisation de isPresent avant d'appeler get() sur maChaine
		//get renvoie l'objet contenu dans Optional
		if(optionalMaChaine2.isPresent()) {
			System.out.println("Ma chaine dans l'optional vaut : " + optionalMaChaine2.get());
		}
		
		String chaineRecuperee = optionalMaChaine2.orElse("chaine par défaut");
		System.out.println("Ma chaine vaut : " + chaineRecuperee);
		
	}

}
