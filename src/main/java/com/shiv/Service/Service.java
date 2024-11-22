package com.shiv.Service;

import java.util.List;

import com.shiv.Dao.Dao;
import com.shiv.Entity.Person;

public class Service {

	Dao dao = null;

	public List<Person> listOfPerson() {
		dao = new Dao();
		List<Person> list = dao.listOfPerson();
		return list;
	}

	public Object insertPerson(int adhar, String name, String vid, String cons, int houseNo, String city, int pin) {
		dao = new Dao();
		Object p1 = dao.insertPerson(adhar, name, vid, cons, houseNo, city, pin);
		return p1;
	}

	public Object updatePerson(int adhar, String name, String vid, String cons, int houseNo, String city, int pin) {
		dao = new Dao();
		Object p1 = dao.updatePerson(adhar, name, vid, cons, houseNo, city, pin);
		return p1;
	}

	public void deletePerson(int adhar) {

		dao = new Dao();
		dao.deletePerson(adhar);
	}

}
