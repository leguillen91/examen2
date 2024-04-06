package hn.unah.examen.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.entities.Cliente;
import hn.unah.examen.repositories.ClienteRepository;
import hn.unah.examen.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente crearCliente(Cliente cliente) {
		// Se valida si existe el DNI en la Base de datos
		if (clienteRepository.findByDni(cliente.getDni()) == null) {
			return this.clienteRepository.save(cliente);
		} else {
			return null;
		}
	}

	@Override
	public List<Cliente> obtenerClientes() {
		return (List<Cliente>) this.clienteRepository.findAll();
	}

}
