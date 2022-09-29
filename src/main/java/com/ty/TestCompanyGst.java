package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCompanyGst {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		
		Company company=new Company();
		company.setName("Apple");
		company.setAddress("Hyderabad");
		
		Gst gst=new Gst();
		gst.setNumber("gst21786");
		gst.setStatus("Active");
		
		gst.setCompany(company);
		
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(company);
		em.persist(gst);
		et.commit();
		
	}

}
