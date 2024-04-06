package hn.unah.examen.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.entities.Cuentas;
import hn.unah.examen.entities.Movimientos;
import hn.unah.examen.entities.MovimientosJSON;
import hn.unah.examen.repositories.CuentasRepository;
import hn.unah.examen.repositories.MovimientoRepository;
import hn.unah.examen.services.MovimientoService;

@Service
public class MovimientoServiceImpl implements MovimientoService {
	@Autowired
	private MovimientoRepository movimientoRepository;
	
	@Autowired
	private CuentasRepository cuentaRepository;
	
	@Override
	public Movimientos crearMovimientos(MovimientosJSON movimientos) {
		Cuentas cuenta = cuentaRepository.findByNumeroCuenta(movimientos.getNumeroCuenta());
		
		if(cuenta != null) {
			if(cuenta.isEstado() == true) {
				boolean guardoCuenta = false;

				if(movimientos.getTipoMovimiento() == 'C') {
					cuenta.setSaldo(cuenta.getSaldo() + movimientos.getMonto());
					guardoCuenta = cuentaRepository.save(cuenta) != null;
				
				}else if(movimientos.getTipoMovimiento() == 'D') {
					if((cuenta.getSaldo() - movimientos.getMonto()) >= 0) {
						cuenta.setSaldo(cuenta.getSaldo() - movimientos.getMonto());
						guardoCuenta = cuentaRepository.save(cuenta) != null;
					}else {
						if(cuenta.isSobregiro() == true) {
							cuenta.setSaldo(cuenta.getSaldo() - movimientos.getMonto());
							guardoCuenta = cuentaRepository.save(cuenta) != null;
						}
					}
				}
				
				// Validamos que se haya guardado cuenta solo de TIPO MOVIMIENTO C o D
				if(guardoCuenta == true) {
					Movimientos objMovimientos = new Movimientos();
					objMovimientos.setCuenta(cuenta);
					objMovimientos.setTipoMovimiento(movimientos.getTipoMovimiento());
					objMovimientos.setFechaMovimiento(new Date());
					objMovimientos.setMonto(movimientos.getMonto());
					return movimientoRepository.save(objMovimientos);
				}
				
			}
			
		}
		return null;
	}

}
