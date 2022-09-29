package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonPan {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Person person = new Person();

		person.setName("vineeth");
		person.setGender("male");

		Pan pan = new Pan();
	

		pan.setNumber("Agukdkd78gg6");
		pan.setType("Business");
		//person.setPan(pan);
		pan.setPerson(person);

		
		et.begin();
		em.persist(person);
		em.persist(pan);
		et.commit();

	}

}
