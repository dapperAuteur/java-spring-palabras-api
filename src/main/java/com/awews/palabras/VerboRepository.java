package com.awews.palabras;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerboRepository extends MongoRepository<Verbo, String> {

}
