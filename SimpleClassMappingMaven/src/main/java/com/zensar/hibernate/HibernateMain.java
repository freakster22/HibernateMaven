package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * Hibernate Main
 *
 */
public class HibernateMain {
	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Product product = new Product();
		product.setProductId(1043);
		product.setName("OP7T");
		product.setBrand("One Plus");
		product.setPrice(37000f);

		session.save(product);

		System.out.println("Product is Saved here");

		transaction.commit();
		session.close();

	}
}
