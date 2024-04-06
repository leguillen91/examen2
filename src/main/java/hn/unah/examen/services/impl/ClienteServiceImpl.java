package hn.unah.examen.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.entities.Cliente;
import hn.unah.examen.entities.Cuentas;
import hn.unah.examen.json.ClienteJSON;
import hn.unah.examen.repositories.ClienteRepository;
import hn.unah.examen.repositories.CuentasRepository;
import hn.unah.examen.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private CuentasRepository cuentaRepository;
	
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
	public List<ClienteJSON> obtenerClientes() {
		List<ClienteJSON> listaClientes = new ArrayList<>();
		List<Cliente> clientes = (List<Cliente>) this.clienteRepository.findAll();
		
		for(Cliente obj: clientes) {
			ClienteJSON clienteSalida = new ClienteJSON();
			clienteSalida.setCuentas(cuentaRepository.findByCliente(obj));
			clienteSalida.setCliente(obj);
			listaClientes.add(clienteSalida);
		}
		
		return listaClientes;
	}

}
