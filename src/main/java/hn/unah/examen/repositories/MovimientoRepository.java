package hn.unah.examen.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.examen.entities.Cuentas;
import hn.unah.examen.entities.Movimientos;

@Repository
public interface MovimientoRepository extends CrudRepository<Movimientos, Integer>{
	public List<Movimientos> findByCuenta(Cuentas cuenta);
}
