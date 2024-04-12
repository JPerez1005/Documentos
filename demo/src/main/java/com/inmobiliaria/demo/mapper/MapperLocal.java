/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.mapper;

import com.inmobiliaria.demo.dto.DtoCliente;
import com.inmobiliaria.demo.dto.DtoLocal;
import com.inmobiliaria.demo.entity.Cliente;
import com.inmobiliaria.demo.entity.Local;
import org.springframework.stereotype.Component;

/**
 *
 * @author camper
 */
@Component
public class MapperLocal {
    public DtoLocal toDto(Local l){
        DtoLocal dl=new DtoLocal();
        
        dl.setId(l.getId());
        dl.setDiafono(l.getDiafono());
        dl.setAcondicionado(l.getAcondicionado());
        dl.setNumero_puertas_entrada(l.getNumero_puertas_entrada());
        
        return dl;
    }
    
    public Local toEntity(DtoLocal dl){
        Local l=new Local();
        
        l.setId(dl.getId());
        l.setDiafono(dl.getDiafono());
        l.setAcondicionado(dl.getAcondicionado());
        l.setNumero_puertas_entrada(dl.getNumero_puertas_entrada());
        
        return l;
    }
}
