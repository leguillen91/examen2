package hn.unah.examen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import hn.unah.examen.entities.Movimientos;

@Repository
public interface MovimientoRepository extends CrudRepository<Movimientos, Integer>{
    
}
