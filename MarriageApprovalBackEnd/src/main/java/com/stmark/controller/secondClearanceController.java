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

import com.stmark.model.SecondClearance;
import com.stmark.service.SecondClearanceService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/secondClearance")
public class secondClearanceController {

	@Autowired
	SecondClearanceService secondClearanceService ;

	// Get All SecondClearances
	@GetMapping("/allSecondClearances")
	public List<SecondClearance> getAllSecondClearances() {
		return secondClearanceService.getAllSecondClearances();
	}

	// Create a new SecondClearance
	@PostMapping("/newSecondClearance")
	public SecondClearance create(@RequestBody SecondClearance SecondClearance) {
		System.out.println(SecondClearance.toString());
		return secondClearanceService.create(SecondClearance);
	}

	// Get a Single SecondClearance
	@GetMapping("/SecondClearance/{referenceNumber}")
	public SecondClearance getSecondClearanceByReferenceNumber(@PathVariable(value = "referenceNumber") String referenceNumber) {
		// it will return a 404 Not Found error to the client if emirateId doesn't exist
		return secondClearanceService.getSecondClearanceByemirateId(referenceNumber);
	}

	// Update a SecondClearance
	@PutMapping("/updateSecondClearance/{referenceNumber}")
	public SecondClearance updateSecondClearance(@PathVariable(value = "referenceNumber") String referenceNumber, @Valid @RequestBody SecondClearance SecondClearanceDetails) {

		return secondClearanceService.update(referenceNumber, SecondClearanceDetails);
	}

	// Delete a SecondClearance
	@DeleteMapping("/deleteSecondClearance/{referenceNumber}")
	public ResponseEntity<?> deleteSecondClearance(@PathVariable(value = "referenceNumber") String referenceNumber) {
		secondClearanceService.delete(referenceNumber);

		return ResponseEntity.ok().build();
	}

}
