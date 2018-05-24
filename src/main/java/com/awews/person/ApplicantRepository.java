package com.awews.person;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends MongoRepository<Applicant, String> {

}
