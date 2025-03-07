package com.example.service;

import com.example.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // Simulamos la búsqueda de usuarios en memoria
    public User findByUsername(String username) {
        if ("user".equals(username)) {
            User user = new User();
            user.setUsername("user");
            user.setPassword("password"); // Contraseña codificada (en un caso real, usaríamos un PasswordEncoder)
            return user;
        }
        return null; // Si no se encuentra el usuario
    }
}