package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetrieveCompanyGst {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		
		Gst gst=em.find(Gst.class, 1);
		if(gst!=null)
		{
			System.out.println("----------Gst info----------");
			System.out.println("Id is: "+gst.getId());
			System.out.println("Number :is "+gst.getNumber());
			System.out.println("Type is: "+gst.getStatus());
			System.out.println("--------------------");
		}
		Company company=gst.getCompany(); // or Company company=em.find(Gst.class,1); but as we already have a company inside
		// gst(has a relationship) so we can access using this method also
		if(company!=null)
		{
			System.out.println("----------Company info----------");
			System.out.println("Id is: "+company.getId());
			System.out.println("Name is: "+company.getName());
			System.out.println("Address is: "+company.getAddress());
			System.out.println("--------------------");
		}	
		}
				

	}


