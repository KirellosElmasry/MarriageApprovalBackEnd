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

import com.stmark.exception.ResourceNotFoundException;
import com.stmark.model.Person;
import com.stmark.repository.PersonRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PersonController {

	@Autowired
	PersonRepository personRepository;

	// Get All persons
	@GetMapping("/allPersons")
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	// Create a new person
	@PostMapping("/newPerson")
	public Person createNewPerson(@Valid @RequestBody Person person) {
		return personRepository.save(person);
	}

	// Get a Single person
	@GetMapping("/person/{eId}")
	public Person getPersonByEId(@PathVariable(value = "eId") Long eId) {
		// it will return a 404 Not Found error to the client if EId doesn't exist
		return personRepository.findById(eId)
				.orElseThrow(() -> new ResourceNotFoundException("Person", "eId", eId));

	}
	
	// Update a Person
	@PutMapping("/updatePerson/{eId}")
	public Person updatePerson(@PathVariable(value = "eId") Long eId,
	                                        @Valid @RequestBody Person personDetails) {

		Person person= personRepository.findById(eId)
	            .orElseThrow(() -> new ResourceNotFoundException("Person", "eId", eId));

		person.setMaritalState(personDetails.getMaritalState());
		
	    Person updatedPerson = personRepository.save(person);
	    return updatedPerson;
	}

	// Delete a Note
	@DeleteMapping("/deletePerson/{eId}")
	public ResponseEntity<?> deletePerson(@PathVariable(value = "eId") Long eId) {
		Person person = personRepository.findById(eId)
	            .orElseThrow(() -> new ResourceNotFoundException("Person", "eId", eId));

		personRepository.delete(person);

	    return ResponseEntity.ok().build();
	}
}
