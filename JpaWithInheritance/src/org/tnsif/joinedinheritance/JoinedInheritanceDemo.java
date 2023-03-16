package org.tnsif.joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tnsif.tableperclass.Employee1;
import org.tnsif.tableperclass.Manager1;

public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		//first student
		Student e4=new Student();
		e4.setRollno(1001);
		e4.setName("Sayali");
		e4.setPercentage(85.90f);
		em.persist(e4);
		
		//first citizen
		Citizen m1=new Citizen();
		m1.setRollno(1500);
		m1.setName("Akanksha");
		m1.setPercentage(76.56f);
		m1.setCitizenType("India");
		m1.setCardno(5827);
		em.persist(m1);
		em.getTransaction().commit();
		System.out.println("Data added successfully");
		em.close();
		factory.close();


	}

}