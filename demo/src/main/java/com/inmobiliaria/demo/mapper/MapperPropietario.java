package com.inmobiliaria.demo.mapper;

import com.inmobiliaria.demo.dto.DtoPropietario;
import com.inmobiliaria.demo.entity.Propietario;
import org.springframework.stereotype.Component;

/**
 *
 * @author camper
 */
@Component
public class MapperPropietario {
    
    public DtoPropietario toDto(Propietario p){
        DtoPropietario dp=new DtoPropietario();
        
        dp.setId(p.getId());
        dp.setNombre(p.getNombre());
        
        return dp;
    }
    
    public Propietario toEntity(DtoPropietario dp){
        Propietario p=new Propietario();
        
        p.setId(dp.getId());
        p.setNombre(dp.getNombre());
        
        return p;
    }
    
}
