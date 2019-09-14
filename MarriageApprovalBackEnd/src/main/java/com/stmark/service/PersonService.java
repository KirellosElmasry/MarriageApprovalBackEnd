package com.stmark.service;

import java.util.Date;
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
		person.setCreatedDate(new Date());
		person.setLastModified(new Date());
		
		return personRepository.save(person);
	}

	public Person getPersonByemirateId(String emirateId) {
		return personRepository.findByEmirateId(emirateId);
	}

	public Person update(String emirateId, Person person) {
		Person p = personRepository.findByEmirateId(emirateId);

		if (p != null) {
			if (person.getHasSecondClearance() != null) {
				p.setLastModified(new Date());
				p.setHasSecondClearance(person.getHasSecondClearance());
			}
			// must set all values in person class
		
			return personRepository.save(p);
		}
		return null;
	}

	public void delete(String emirateId) {
		Person person = personRepository.findByEmirateId(emirateId);
		personRepository.delete(person);
	}
}
