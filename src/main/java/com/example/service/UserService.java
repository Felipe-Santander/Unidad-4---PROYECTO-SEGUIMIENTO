package com.example.service;

import com.example.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UserService {

    public Flux<User> getUsers() {
        return Flux.just(
                new User("Alice", "alice@example.com"),
                new User("Bob", "bob@example.com"));
    }

    public Mono<User> getUserById(String id) {
        return Mono.just(new User("Charlie", "charlie@example.com"));
    }
}