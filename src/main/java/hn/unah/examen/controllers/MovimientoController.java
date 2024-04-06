package hn.unah.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen.entities.Direccion;
import hn.unah.examen.entities.Movimientos;
import hn.unah.examen.entities.MovimientosJSON;
import hn.unah.examen.services.impl.DireccionServiceImpl;
import hn.unah.examen.services.impl.MovimientoServiceImpl;

@RestController
@RequestMapping("/api")
public class MovimientoController {
	@Autowired
	private MovimientoServiceImpl movimientoImpl;

	@PostMapping("/movimiento/crear")
	public Movimientos crearCliente(@RequestBody MovimientosJSON movimiento) {
		return this.movimientoImpl.crearMovimientos(movimiento);
	}
}
