/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.mapper;

import com.inmobiliaria.demo.dto.DtoCasas;
import com.inmobiliaria.demo.dto.DtoVilla;
import com.inmobiliaria.demo.entity.Casas;
import com.inmobiliaria.demo.entity.Villa;
import org.springframework.stereotype.Component;

/**
 *
 * @author camper
 */
@Component
public class MapperCasas {
    public DtoCasas toDto(Casas c){
        DtoCasas dc=new DtoCasas();
        
        dc.setId(c.getId());
        dc.setAseos(c.getAseos());
        dc.setBaños(c.getBaños());
        dc.setCocinas(c.getCocinas());
        dc.setGas_ciudad(c.getGas_ciudad());
        dc.setHabitaciones(c.getHabitaciones());
        dc.setParquet(c.getParquet());
        dc.setPuerta_blindada(c.getPuerta_blindada());
        
        return dc;
    }
    
    public Casas toEntity(DtoCasas dc){
        Casas c=new Casas();
        
        c.setId(dc.getId());
        c.setAseos(dc.getAseos());
        c.setBaños(dc.getBaños());
        c.setCocinas(dc.getCocinas());
        c.setGas_ciudad(dc.getGas_ciudad());
        c.setHabitaciones(dc.getHabitaciones());
        c.setParquet(dc.getParquet());
        c.setPuerta_blindada(dc.getPuerta_blindada());
        
        return c;
    }
}
