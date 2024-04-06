package hn.unah.examen.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.examen.entities.Cliente;
import hn.unah.examen.entities.Cuentas;

@Repository
public interface CuentasRepository extends CrudRepository<Cuentas, String>{
	public Cuentas findByNumeroCuenta(String numeroCuenta);
	public List<Cuentas> findByCliente(Cliente cliente);
}

