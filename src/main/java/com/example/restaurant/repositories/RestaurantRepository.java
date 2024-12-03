package com.example.restaurant.repositories;
import com.example.restaurant.Models.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
}
