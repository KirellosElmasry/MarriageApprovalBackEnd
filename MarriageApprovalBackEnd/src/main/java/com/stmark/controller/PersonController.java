package com.stmark.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stmark.model.Person;
import com.stmark.service.PersonService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PersonController {

	@Autowired
	PersonService personService;

	// Get All persons
	@GetMapping("/allPersons")
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}

	// Create a new person
	@PostMapping("/newPerson")
	public Person create(@RequestBody Person person) {
		System.out.println(person.toString());
		return personService.create(person);
	}

	// Get a Single person
	@GetMapping("/person/{emirateId}")
	public Person getPersonByemirateId(@PathVariable(value = "emirateId") String emirateId) {
		// it will return a 404 Not Found error to the client if emirateId doesn't exist
		return personService.getPersonByemirateId(emirateId);
	}

	// Update a Person
	@PutMapping("/updatePerson")
	public Person updatePerson(@RequestBody Person personDetails) {

		return personService.update(personDetails.getEmirateId(), personDetails);
	}

	// Delete a Person
	@DeleteMapping("/deletePerson/{emirateId}")
	public ResponseEntity<?> deletePerson(@PathVariable(value = "emirateId") String emirateId) {
		personService.delete(emirateId);

		return ResponseEntity.ok().build();
	}
}
