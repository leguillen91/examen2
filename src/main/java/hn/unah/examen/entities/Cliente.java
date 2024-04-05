package hn.unah.examen.entities;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cliente")
@Data
public class Cliente {
	@Id
    @Column(name="dni" , length = 20)
    private String dni;

    @Column(name="nombre", length = 20)
    private String nombre;

    @Column(name="apellido", length = 20)
    private String apellido;

    @Column(name="correo", length = 20)
    private String correo;

    @Column(name="telefono", length = 15)
    private String telefono;
    
    @OneToMany(mappedBy="cliente", cascade = CascadeType.ALL)
    private List<Direccion> direcciones;
    
    @OneToMany(mappedBy="cliente", cascade = CascadeType.ALL)
    private List<Cuentas> cuentas;
}
