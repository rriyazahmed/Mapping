package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetBikeChassisDetails {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Bike bike = em.find(Bike.class, 1);
		if (bike != null) {
			System.out.println("----------Bike info----------");
			System.out.println("Id is: " + bike.getId());
			System.out.println("Name is: " + bike.getName());
			System.out.println("Gender is: " + bike.getCost());
			System.out.println("----------------------------------");
		}
		Chassis chassis =bike.getChassis();
		if(chassis!= null)
		{
			System.out.println("----------Chassis info----------");
			System.out.println("Id is: " + chassis.getId());
			System.out.println("Name is: " + chassis.getType());
			System.out.println("----------------------------------");
		}

	}

}
