package com.bigcorp.project.main.cours.recordtype;

/**
 * Décrit une personne
 */
public record PersonRecord(Long id, String firstName, String lastName) {
	
	@Override
	public String toString() {
		return "coucou";
	}
	
}