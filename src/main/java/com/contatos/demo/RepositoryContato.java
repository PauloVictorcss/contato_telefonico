package com.contatos.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryContato extends JpaRepository<Contato, Integer> {

    List<Contato> findByFavorito(boolean favorito);


}
