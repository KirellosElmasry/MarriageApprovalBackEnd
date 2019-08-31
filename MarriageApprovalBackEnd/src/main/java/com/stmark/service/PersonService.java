package com.stmark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stmark.model.Person;
import com.stmark.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	public Person create(Person person) {
		return personRepository.save(person);
	}

	public Person getPersonByEid(String eId) {
		return personRepository.findByEId(eId);
	}

	public Person update(String eId, Person person) {
		Person p = personRepository.findByEId(eId);

		if (p != null) {
			if (p.getName() != null)
				p.setName(person.getName());
			// must set all values in person class
		
			return personRepository.save(p);
		}
		return null;
	}

	public void delete(String eId) {
		Person person = personRepository.findByEId(eId);
		personRepository.delete(person);
	}
}
