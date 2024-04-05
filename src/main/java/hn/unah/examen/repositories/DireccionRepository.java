package hn.unah.examen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.examen.entities.Direccion;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Integer>{
    
}
