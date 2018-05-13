package com.awews.palabras;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FourLetterWordRepository extends MongoRepository<FourLetterWord, String> {

}
