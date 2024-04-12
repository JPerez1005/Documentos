package com.inmobiliaria.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="visita")
public class Visita {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private Date fecha;
    
    private String comentarios;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Cliente cliente;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Inmueble inmueble;
}
