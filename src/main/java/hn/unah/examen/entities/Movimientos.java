package hn.unah.examen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "movimientos")
@Data
public class Movimientos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idmovimiento")
	private int idMovimiento;

	@Column(name = "tipomovimiento")
	private char tipoMovimiento;

	@Column(name = "monto")
	private double monto;

	@Column(name = "fechamovimiento")
	private Date fechaMovimiento;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "numerocuenta")
	private Cuentas cuenta; 
}
