package com.example.restaurant.repositories;

import com.example.restaurant.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
