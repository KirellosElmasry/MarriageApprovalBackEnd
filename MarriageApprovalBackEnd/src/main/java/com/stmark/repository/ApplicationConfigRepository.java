package com.stmark.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stmark.model.ApplicationConfig;


@Repository
public interface ApplicationConfigRepository extends MongoRepository<ApplicationConfig, String>{

}