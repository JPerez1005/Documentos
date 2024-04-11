/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.mapper;

import com.inmobiliaria.demo.dto.DtoLocal;
import com.inmobiliaria.demo.dto.DtoVilla;
import com.inmobiliaria.demo.entity.Local;
import com.inmobiliaria.demo.entity.Villa;
import org.springframework.stereotype.Component;

/**
 *
 * @author camper
 */
@Component
public class MapperVilla {
    public DtoVilla toDto(Villa v){
        DtoVilla dv=new DtoVilla();
        
        dv.setId(v.getId());
        dv.setAseos(v.getAseos());
        dv.setBaños(v.getBaños());
        dv.setCocinas(v.getCocinas());
        dv.setGas_ciudad(v.getGas_ciudad());
        dv.setHabitaciones(v.getHabitaciones());
        dv.setParquet(v.getParquet());
        dv.setPuerta_blindada(v.getPuerta_blindada());
        dv.setTamaño_parcela(v.getTamaño_parcela());
        dv.setUrbanizacion(v.getUrbanizacion());
        
        return dv;
    }
    
    public Villa toEntity(DtoVilla dv){
        Villa v=new Villa();
        
        v.setId(dv.getId());
        v.setAseos(dv.getAseos());
        v.setBaños(dv.getBaños());
        v.setCocinas(dv.getCocinas());
        v.setGas_ciudad(dv.getGas_ciudad());
        v.setHabitaciones(dv.getHabitaciones());
        v.setParquet(dv.getParquet());
        v.setPuerta_blindada(dv.getPuerta_blindada());
        v.setTamaño_parcela(dv.getTamaño_parcela());
        v.setUrbanizacion(dv.getUrbanizacion());
        
        return v;
    }
}
