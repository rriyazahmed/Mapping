package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBikeChassis {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Bike bike = new Bike();
		bike.setName("Honda ct");
		bike.setCost(60000);
		Chassis chassis = new Chassis();

		chassis.setType("MultiCraddleFrame");
		chassis.setBike(bike);

		bike.setChassis(chassis);

		et.begin();
		em.persist(bike);
		em.persist(chassis);
		et.commit();

	}

}
