package com.stmark.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.stmark.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

	
}
