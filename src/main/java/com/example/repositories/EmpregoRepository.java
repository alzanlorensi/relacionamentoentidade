package com.example.repositories;

import com.example.entities.Emprego;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class EmpregoRepository implements PanacheRepository<Emprego> {

    public List<Emprego>listAll(){
        return listAll();
    }


}
