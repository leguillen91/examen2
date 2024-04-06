package hn.unah.examen.services.impl;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.entities.Cliente;
import hn.unah.examen.entities.Cuentas;
import hn.unah.examen.entities.Movimientos;
import hn.unah.examen.repositories.ClienteRepository;
import hn.unah.examen.repositories.CuentasRepository;
import hn.unah.examen.services.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService {
	@Autowired
	private CuentasRepository cuentaRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Cuentas crearCuenta(String dni, String numerocuenta) {
		Cliente cliente = clienteRepository.findByDni(dni);
		Cuentas cuenta = cuentaRepository.findById(numerocuenta).orElse(null);
		
		if(cliente != null && cuenta == null) {
			Cuentas cuentaCrear = new Cuentas();
			cuentaCrear.setCliente(cliente);
			cuentaCrear.setNumeroCuenta(numerocuenta);
			cuentaCrear.setFechaApertura(new Date());
			cuentaCrear.setSaldo(0);
			cuentaCrear.setEstado(true);
			cuentaCrear.setSobregiro(false);
			cuentaCrear.setMovimientos(new ArrayList<>());
			return cuentaRepository.save(cuentaCrear);
		}
		return null;
	}


}
