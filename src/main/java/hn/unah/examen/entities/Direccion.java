package hn.unah.examen.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="direccion")
@Data
public class Direccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddireccion")
    private int idDireccion;
    
    @Column(name="estado",length = 30) 
    private String estado;

    @Column(name="ciudad",length = 20) 
    private String ciudad; 
 
    @Column(name="calle",length = 20) 
    private String calle;

    @ManyToOne
    @JoinColumn(name="dni")
    private Cliente cliente;

}