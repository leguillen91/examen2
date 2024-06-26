package hn.unah.examen.services;

import hn.unah.examen.entities.Movimientos;
import hn.unah.examen.json.MovimientoPorCuenta;
import hn.unah.examen.json.MovimientosJSON;

public interface MovimientoService {
	public Movimientos crearMovimientos(MovimientosJSON movimientos);
	public MovimientoPorCuenta obtenerCuenta(String numeroCuenta);
}
