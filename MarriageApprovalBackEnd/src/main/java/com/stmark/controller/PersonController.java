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
	public Person create(@Valid @RequestBody Person person) {
		System.out.println(person.toString());
		return personService.create(person);
	}

	// Get a Single person
	@GetMapping("/person/{eId}")
	public Person getPersonByEId(@PathVariable(value = "eId") String eId) {
		// it will return a 404 Not Found error to the client if EId doesn't exist
		return personService.getPersonByEid(eId);
	}

	// Update a Person
	@PutMapping("/updatePerson/{eId}")
	public Person updatePerson(@PathVariable(value = "eId") String eId, @Valid @RequestBody Person personDetails) {

		return personService.update(eId, personDetails);
	}

	// Delete a Note
	@DeleteMapping("/deletePerson/{eId}")
	public ResponseEntity<?> deletePerson(@PathVariable(value = "eId") String eId) {
		personService.delete(eId);

		return ResponseEntity.ok().build();
	}
}
