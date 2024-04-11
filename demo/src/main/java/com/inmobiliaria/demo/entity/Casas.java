/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.entity;

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
 *
 * @author camper
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="casas")
public class Casas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String habitaciones;
    
    private String baños;
    
    private String aseos;
    
    private String cocinas;
    
    private String gas_ciudad;
    
    private String puerta_blindada;
    
    private String parquet;
    
    @OneToOne(mappedBy = "casas")
    private Inmueble inmueble;
}
