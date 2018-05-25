package com.awews.form;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionTypeRepository extends MongoRepository<QuestionType, String> {

}
