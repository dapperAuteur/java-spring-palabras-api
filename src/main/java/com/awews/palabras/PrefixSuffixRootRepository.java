package com.awews.palabras;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrefixSuffixRootRepository extends MongoRepository<PrefixSuffixRoot, String> {

}
