package org.example.guilhermezuriel.camadasaplicacao.service;


import org.example.guilhermezuriel.camadasaplicacao.dtos.UserDTO;
import org.example.guilhermezuriel.camadasaplicacao.entities.User;
import org.example.guilhermezuriel.camadasaplicacao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    public User findById(Long id){
        User entity = repository.findById(id).get();
        return entity;
    }

}
