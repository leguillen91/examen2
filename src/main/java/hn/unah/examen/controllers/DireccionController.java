package hn.unah.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen.entities.Cliente;
import hn.unah.examen.entities.Direccion;
import hn.unah.examen.services.impl.ClienteServiceImpl;
import hn.unah.examen.services.impl.DireccionServiceImpl;

@RestController
@RequestMapping("/api")
public class DireccionController {
	
	@Autowired
	private DireccionServiceImpl direccionImpl;

	@PostMapping("/direccion/crear/{dni}")
	public Direccion crearCliente(@PathVariable String dni, @RequestBody Direccion direccion) {
		return this.direccionImpl.crearDireccion(dni,direccion);
	}
}
