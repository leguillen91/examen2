package hn.unah.examen.json;

import java.util.List;

import hn.unah.examen.entities.Cuentas;
import hn.unah.examen.entities.Movimientos;
import lombok.Data;

@Data
public class MovimientoPorCuenta {
	private Cuentas cuenta;
	// private List<Movimientos> movimientos;
	
}
