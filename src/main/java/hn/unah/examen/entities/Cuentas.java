package hn.unah.examen.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Entity
@Table(name="cuentas")
@Data
public class Cuentas {
  
    @Id
    @Column(name="numerocuenta",length = 10)
    private String numeroCuenta;
  
    private double saldo;
  
    @Column(name="fechaapertura")
    private Date fechaApertura;
  
    @Column(name="estado")
    private boolean estado;
  
    @Column(name="sobregiro")
    private boolean sobregiro;
  
    @ManyToOne 
    @JoinColumn(name="dni")
    private Cliente cliente;
    
    @OneToMany(mappedBy="cuenta", cascade = CascadeType.ALL)
    private List<Movimientos> movimientos;
}