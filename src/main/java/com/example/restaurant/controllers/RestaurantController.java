package com.example.restaurant.controllers;

import com.example.restaurant.Models.Restaurant;
import com.example.restaurant.repositories.RestaurantRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class RestaurantController {

    private final RestaurantRepository restaurantRepository;

    public RestaurantController(RestaurantRepository restaurantRepository) {
        super();
        this.restaurantRepository = restaurantRepository;
    }

    @GetMapping("/restaurants")
    public List<Restaurant> restaurants() {
        return this.restaurantRepository.findAll();
    }

    @PostMapping("/restaurants")
    public void createRestaurants(@RequestBody Restaurant restaurant) {
        this.restaurantRepository.save(restaurant);
    }

}
