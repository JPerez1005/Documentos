/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.impl;

import com.inmobiliaria.demo.dto.DtoOficina;
import com.inmobiliaria.demo.entity.Oficina;
import com.inmobiliaria.demo.mapper.MapperOficina;
import com.inmobiliaria.demo.repository.RepositoryOficina;
import com.inmobiliaria.demo.service.ServiceOficina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camper
 */

@Service
public class ServiceImplOficina implements ServiceOficina{

    @Autowired
    private MapperOficina mo;
    
    @Autowired
    private RepositoryOficina ro;
    
    @Override
    public Oficina createOficina(DtoOficina dto) {
        Oficina o=mo.toEntity(dto);
        
        return ro.save(o);
    }
    
}
