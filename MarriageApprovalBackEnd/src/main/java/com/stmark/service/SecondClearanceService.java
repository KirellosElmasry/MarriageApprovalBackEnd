package com.stmark.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stmark.model.SecondClearance;
import com.stmark.repository.SecondClearanceRepository;

@Service
public class SecondClearanceService {

	@Autowired
	private SecondClearanceRepository clearanceRepository;

	public List<SecondClearance> getAllSecondClearances() {
		return clearanceRepository.findAll();
	}

	public SecondClearance create(SecondClearance secondClearance) {
		secondClearance.setCreatedDate(new Date());
		secondClearance.setLastModified(new Date());

		return clearanceRepository.save(secondClearance);
	}

	public SecondClearance getSecondClearanceByemirateId(String referenceNumber) {
		return clearanceRepository.findByReferenceNumber(referenceNumber);
	}

	public SecondClearance update(String referenceNumber, SecondClearance secondClearance) {
		SecondClearance p = clearanceRepository.findByReferenceNumber(referenceNumber);

		if (p != null) {
			if (p.getEngageDocNumber() != null)
				p.setEngageDocNumber(secondClearance.getEngageDocNumber());
			if (p.getSecondClearanceDate() != null)
				p.setSecondClearanceDate(secondClearance.getSecondClearanceDate());

			// must set all values in SecondClearance class

			return clearanceRepository.save(p);
		}
		return null;
	}

	public void delete(String referenceNumber) {
		SecondClearance SecondClearance = clearanceRepository.findByReferenceNumber(referenceNumber);
		clearanceRepository.delete(SecondClearance);
	}
}
