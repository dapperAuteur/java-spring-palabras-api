package com.awews.language;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface TranslationRepository extends MongoRepository<Translation, String> {
	

}
