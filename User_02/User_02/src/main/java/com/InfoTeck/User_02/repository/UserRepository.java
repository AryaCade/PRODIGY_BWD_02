package com.InfoTeck.User_02.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.InfoTeck.User_02.User.User;

public interface UserRepository extends MongoRepository<User, String> {

}
