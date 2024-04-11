/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.mapper;

import com.inmobiliaria.demo.dto.DtoOficina;
import com.inmobiliaria.demo.entity.Oficina;
import org.springframework.stereotype.Component;

/**
 *
 * @author camper
 */
@Component
public class MapperOficina {
    
    public DtoOficina toDto(Oficina o){
        DtoOficina dto=new DtoOficina();
        
        dto.setId(o.getId());
        dto.setZona(o.getZona());
        return dto;
    }
    
    public Oficina toEntity(DtoOficina dto){
        Oficina o=new Oficina();
        o.setId(dto.getId());
        o.setZona(dto.getZona());
        return o;
    }
    
}
