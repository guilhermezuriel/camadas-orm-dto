package org.example.guilhermezuriel.camadasaplicacao.repositories;


import org.example.guilhermezuriel.camadasaplicacao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Objeto responsável por acessar os dados no banco de dados, relacionados ao usuário
public interface UserRepository extends JpaRepository<User, Long> {
}
