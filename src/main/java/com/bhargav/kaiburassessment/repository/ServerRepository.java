package com.bhargav.kaiburassessment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhargav.kaiburassessment.model.Server;



public interface ServerRepository extends MongoRepository<Server, Integer> {


}
