package com.bigcorp.project.main.cours.recordtype;

import java.time.LocalDate;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person(3l, "jacques", "durant", LocalDate.of(1980, 2, 4));
		p.toString();

		PersonRecord precord = new PersonRecord(3l, "jean", "dupont");

		System.out.println("le prénom vaut: " + precord.firstName());
		System.out.println(precord.toString());

		PersonRecord precord2 = new PersonRecord(3l, "jean", "dupont");

		System.out.println("Les deux objets sont égaux avec == " + (precord == precord2));
		System.out.println("Les deux objets sont égaux avec .equals " + (precord.equals(precord2)));

		System.out.println("hashcode precord : " + precord.hashCode() 
			+ ", hashcode precord 2 : " + precord2
				.hashCode());

	}

}
