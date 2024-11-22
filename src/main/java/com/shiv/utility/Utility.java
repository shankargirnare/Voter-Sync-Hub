package com.shiv.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shiv.Entity.Address;
import com.shiv.Entity.Person;
import com.shiv.Entity.VotingCard;

public class Utility {

	public static Session session() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(VotingCard.class);
		cfg.addAnnotatedClass(Address.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		return session;
	}

}
