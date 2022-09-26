package com.yuricjardim.sbmongdb.repository;

import com.yuricjardim.sbmongdb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User, String> {
}
