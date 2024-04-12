/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.dto;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author camper
 */
@Data
public class DtoVisita {
    private Long id;
    
    //private Date fecha;
    
    private String comentarios;
    
    private DtoCliente cliente;
    
    private DtoInmueble inmueble;
}
