package com.contatos.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceContato {

    @Autowired
    RepositoryContato repository;

    public Contato save(Contato contato){
        return repository.save(contato);

    }

    public List<Contato> findAll(){
        return repository.findAll();
    }

    public Contato findById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public Contato updateContato(DTOContato contato, Integer id){
        Contato contato1 = repository.findById(id).orElse(null);
        if(contato.getNome() != null){
            contato1.setNome(contato.getNome());
        }
        if(contato.getEmail() != null){
            contato1.setEmail(contato.getEmail());
        }
        if(contato.getTelefone() != null){
            contato1.setTelefone(contato.getTelefone());
        }
        return repository.save(contato1);
    }

    public List<Contato> listaContatosFavoritos(){
        return repository.findByFavorito(true);
    }

}
