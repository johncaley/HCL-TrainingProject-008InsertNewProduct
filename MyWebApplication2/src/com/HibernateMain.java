package com;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
	public static void AddtoDB(Book book) {
		try {
			Configuration configuration = new Configuration().configure();
			configuration.addAnnotatedClass(com.Book.class);
			StandardServiceRegistryBuilder builder = 
					new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			SessionFactory factory = configuration.buildSessionFactory(builder.build());
			
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(book);
			transaction.commit();
			session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
