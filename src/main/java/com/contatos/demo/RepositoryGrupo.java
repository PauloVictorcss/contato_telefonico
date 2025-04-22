package com.contatos.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGrupo extends JpaRepository<Grupo, Integer> {
}
