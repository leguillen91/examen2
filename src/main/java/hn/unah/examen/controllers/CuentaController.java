package hn.unah.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen.entities.Cliente;
import hn.unah.examen.entities.Cuentas;
import hn.unah.examen.services.impl.ClienteServiceImpl;
import hn.unah.examen.services.impl.CuentaServiceImpl;

@RestController
@RequestMapping("/api")
public class CuentaController {
	
	@Autowired
	private CuentaServiceImpl cuentaServiceImpl;

	@PostMapping("/cuenta/crear/{dni}")
	public Cuentas crearCuentas(@PathVariable("dni") String dni ,
			@RequestParam("numerocuenta") String numerocuenta) {
		
		return this.cuentaServiceImpl.crearCuenta(dni, numerocuenta);
	}
}
