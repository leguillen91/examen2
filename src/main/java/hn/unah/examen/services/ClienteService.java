package hn.unah.examen.services;

import java.util.List;

import hn.unah.examen.entities.Cliente;

public interface ClienteService {
	public Cliente crearCliente(Cliente cliente);
    public List<Cliente> obtenerClientes();
}
