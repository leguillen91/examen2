package hn.unah.examen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.examen.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String>{
 
}
