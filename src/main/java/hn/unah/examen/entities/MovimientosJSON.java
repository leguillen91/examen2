package hn.unah.examen.entities;

import lombok.Data;

@Data
public class MovimientosJSON {
	private String numeroCuenta;
	private char tipoMovimiento;
	private double monto;
}
