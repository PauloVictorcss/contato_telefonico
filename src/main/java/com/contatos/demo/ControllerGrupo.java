package com.contatos.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/grupo")
public class ControllerGrupo {

    @Autowired
    ServiceGrupo service;

    @PostMapping
    public Grupo save(@RequestBody Grupo grupo){
        return service.save(grupo);
    }

    @GetMapping
    public List<Grupo> findAll(){
        return  service.findAll();
    }

    @GetMapping("/{id}")
    public Grupo findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Grupo update(@RequestBody Grupo grupo, @PathVariable Integer id) {
        return service.updateGrupo(grupo, id);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.deleteById(id);
    }

}
