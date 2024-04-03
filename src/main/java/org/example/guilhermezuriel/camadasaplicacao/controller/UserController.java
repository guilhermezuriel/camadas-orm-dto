package org.example.guilhermezuriel.camadasaplicacao.controller;

import org.example.guilhermezuriel.camadasaplicacao.dtos.UserDTO;
import org.example.guilhermezuriel.camadasaplicacao.entities.User;
import org.example.guilhermezuriel.camadasaplicacao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id){
        User user = service.findById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
    }

}
