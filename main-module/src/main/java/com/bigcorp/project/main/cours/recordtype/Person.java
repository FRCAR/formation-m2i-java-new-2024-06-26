package com.bigcorp.project.main.cours.recordtype;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

	private final Long id;

	private final String lastName;

	private final String firstName;

	private final LocalDate birthDay;

	public Person(Long id, String lastName, String firstName, LocalDate birthDay) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthDay = birthDay;
	}

	public Long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthDay, firstName, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		return Objects.equals(birthDay, other.birthDay) && Objects.equals(firstName, other.firstName) && Objects.equals(
				id, other.id) && Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", birthDay=" + birthDay
				+ "]";
	}

}
