package com.tugrankenger.mongodbget.repository;

import com.tugrankenger.mongodbget.model.Lost;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LostRepository extends MongoRepository <Lost, String> {
    
}
