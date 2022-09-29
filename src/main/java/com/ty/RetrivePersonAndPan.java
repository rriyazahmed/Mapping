package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetrivePersonAndPan {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();

		Person person = em.find(Person.class, 1);
		if (person != null) {
			System.out.println("----------Person info----------");
			System.out.println("Id is: " + person.getId());
			System.out.println("Name is: " + person.getName());
			System.out.println("Gender is: " + person.getGender());
			System.out.println("--------------------");
		}

		Pan pan = person.getPan(); // or Pan pan=em.find(Pan.class,1); but as we already have a pan inside
									// person(has a relationship) so we can access using this method also
		if (pan != null) {
			System.out.println("----------Pan info----------");
			System.out.println("id is: " + pan.getId());
			System.out.println("number is :" + pan.getNumber());
			System.out.println("type is: " + pan.getType());
			System.out.println("--------------------");
		}
	}

}
