package com.yuricjardim.sbmongodb.repository;

import com.yuricjardim.sbmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User, String> {
}
