/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.mapper;

import com.inmobiliaria.demo.dto.DtoCliente;
import com.inmobiliaria.demo.dto.DtoPropietario;
import com.inmobiliaria.demo.entity.Cliente;
import com.inmobiliaria.demo.entity.Propietario;
import org.springframework.stereotype.Component;

/**
 *
 * @author camper
 */
@Component
public class MapperCliente {
    public DtoCliente toDto(Cliente c){
        DtoCliente dc=new DtoCliente();
        
        dc.setId(c.getId());
        dc.setNombre(c.getNombre());
        dc.setTelefono(c.getTelefono());
        
        return dc;
    }
    
    public Cliente toEntity(DtoCliente dc){
        Cliente c=new Cliente();
        
        c.setId(dc.getId());
        c.setNombre(dc.getNombre());
        c.setTelefono(dc.getTelefono());
        
        return c;
    }
}
