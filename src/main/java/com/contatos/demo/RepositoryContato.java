package com.contatos.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryContato extends JpaRepository<Contato, Integer> {
}
