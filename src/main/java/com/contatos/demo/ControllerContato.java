package com.contatos.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("contatos")
public class ControllerContato {

    @Autowired
    ServiceContato service;

    @PostMapping
    public Contato save(@RequestBody Contato contato){
        return service.save(contato);
    }

    @GetMapping
    public List<Contato> findAll(){
        return  service.findAll();
    }

    @GetMapping("/{id}")
    public Contato findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @GetMapping("/favoritos")
    public List<Contato> findAllFavoritos(){
        return  service.listaContatosFavoritos();
    }

    @PutMapping("/{id}")
    public Contato updateContato(@RequestBody DTOContato dtoContato, @PathVariable Integer id){
        return service.updateContato(dtoContato, id);
    }

}
