package hn.unah.examen.services;

import java.util.List;

import hn.unah.examen.entities.Cliente;
import hn.unah.examen.json.ClienteJSON;

public interface ClienteService {
	public Cliente crearCliente(Cliente cliente);
    public List<ClienteJSON> obtenerClientes();
}
