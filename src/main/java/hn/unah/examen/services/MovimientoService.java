package hn.unah.examen.services;

import hn.unah.examen.entities.Movimientos;
import hn.unah.examen.entities.MovimientosJSON;

public interface MovimientoService {
	public Movimientos crearMovimientos(MovimientosJSON movimientos);
}
