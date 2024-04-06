package hn.unah.examen.json;

import hn.unah.examen.entities.Cuentas;
import lombok.Data;

@Data
public class MovimientosJSON {
	private String numeroCuenta;
	private char tipoMovimiento;
	private double monto;
}
