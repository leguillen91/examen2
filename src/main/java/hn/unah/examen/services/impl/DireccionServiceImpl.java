package hn.unah.examen.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.entities.Cliente;
import hn.unah.examen.entities.Direccion;
import hn.unah.examen.repositories.ClienteRepository;
import hn.unah.examen.repositories.DireccionRepository;
import hn.unah.examen.services.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService {
	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private DireccionRepository direccionRepository;

	@Override
	public Direccion crearDireccion(String dni, Direccion direccion) {
		Cliente cliente = this.clienteRepository.findById(dni).orElse(null);
	
		if (cliente != null) {
			direccion.setCliente(cliente);
			return direccionRepository.save(direccion);
		}
		return null;
	}

}
