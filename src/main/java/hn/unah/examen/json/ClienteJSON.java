package hn.unah.examen.json;

import java.util.List;

import hn.unah.examen.entities.Cliente;
import hn.unah.examen.entities.Cuentas;
import lombok.Data;

@Data
public class ClienteJSON {
	Cliente cliente;
	List<Cuentas> cuentas;
}
