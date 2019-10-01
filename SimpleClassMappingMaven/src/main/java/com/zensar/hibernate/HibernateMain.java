package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

import org.hibernate.Session;


/**
 * Hibernate Main
 *
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {
        //System.out.println( "This is a Hibernate Main File" );
    	
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
    	
    	transaction.commit();
    	session.close();
    	
    }
}
