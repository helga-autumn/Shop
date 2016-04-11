package com.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	

		public static void main(String[] args) {
			EntityManagerFactory factory = Persistence
					.createEntityManagerFactory("primary");
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			em.find(User.class, 1);
			em.getTransaction().commit();
			em.close();
			factory.close();
		}

}
