package com.shiv.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shiv.Entity.Address;
import com.shiv.Entity.Person;
import com.shiv.Entity.VotingCard;
import com.shiv.utility.Utility;

public class Dao {

	public List<Person> listOfPerson() {
		Session session = Utility.session();
		Criteria criteria = session.createCriteria(Person.class);
		List<Person> allper = criteria.list();
		return allper;
	}

	public String insertPerson(int adhar, String name, String vid, String cons, int houseNo, String city, int pin) {
		Session session = Utility.session();
		Transaction tx = session.beginTransaction();
	
		Person p = new Person(adhar, name, new VotingCard(vid, cons),new Address(houseNo, pin, city));

		session.save(p);
		tx.commit();
		String res = "data inserted successfully...";
		session.close();
		return res;
	}

	public Object updatePerson(int adhar, String name, String vid, String cons, int houseNo, String city, int pin) {
		
		Session session = Utility.session();
		Transaction tx = session.beginTransaction();
	
		Person p = new Person(adhar, name, new VotingCard(vid, cons),new Address(houseNo, pin, city));

		session.saveOrUpdate(p);
		tx.commit();
		String res = "data inserted successfully...";
		session.close();
		return res;
	}

	public void deletePerson(int adhar) {
		Session session = Utility.session();
		Transaction tx = session.beginTransaction();
		
		List<Person> list = listOfPerson();
		for (Person person : list) {
			if (person.getAddhar_id()== adhar) {
				session.delete(person);
			}
		}
		tx.commit();
		session.close();
		
	}

}
