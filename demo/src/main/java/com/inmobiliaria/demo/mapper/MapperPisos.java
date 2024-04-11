/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.mapper;

import com.inmobiliaria.demo.dto.DtoCasas;
import com.inmobiliaria.demo.dto.DtoPisos;
import com.inmobiliaria.demo.entity.Casas;
import com.inmobiliaria.demo.entity.Pisos;
import org.springframework.stereotype.Component;

/**
 *
 * @author camper
 */
@Component
public class MapperPisos {
    public DtoPisos toDto(Pisos p){
        DtoPisos dp=new DtoPisos();
        
        dp.setId(p.getId());
        dp.setAseos(p.getAseos());
        dp.setBaños(p.getBaños());
        dp.setCocinas(p.getCocinas());
        dp.setGas_ciudad(p.getGas_ciudad());
        dp.setHabitaciones(p.getHabitaciones());
        dp.setParquet(p.getParquet());
        dp.setPuerta_blindada(p.getPuerta_blindada());
        dp.setNuevo(p.getNuevo());
        
        return dp;
    }
    
    public Pisos toEntity(DtoPisos dc){
        Pisos c=new Pisos();
        
        c.setId(dc.getId());
        c.setAseos(dc.getAseos());
        c.setBaños(dc.getBaños());
        c.setCocinas(dc.getCocinas());
        c.setGas_ciudad(dc.getGas_ciudad());
        c.setHabitaciones(dc.getHabitaciones());
        c.setParquet(dc.getParquet());
        c.setPuerta_blindada(dc.getPuerta_blindada());
        c.setNuevo(dc.getNuevo());
        return c;
    }
}
