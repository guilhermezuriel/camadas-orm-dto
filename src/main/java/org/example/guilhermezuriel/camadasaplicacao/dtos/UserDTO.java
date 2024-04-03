package org.example.guilhermezuriel.camadasaplicacao.dtos;


import org.example.guilhermezuriel.camadasaplicacao.entities.User;

import java.util.Optional;

public class UserDTO {
    private Long id;
    private String name;

    public UserDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
    }
}
