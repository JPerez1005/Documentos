/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * entidad,repositorio,dto,service,serviceImpl,controller
 * @author camper
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="inmueble")
public class Inmueble {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String estado;
    
    private String precio;
    
    private String numero_referencia;
    
    private String superficie;
    
    private String Direccion;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Propietario propietario;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Oficina oficina;
    
    @OneToOne(mappedBy = "inmueble")
    private Visita visita;
}
