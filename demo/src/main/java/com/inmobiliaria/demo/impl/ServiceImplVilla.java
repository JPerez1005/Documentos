/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.impl;

import com.inmobiliaria.demo.dto.DtoVilla;
import com.inmobiliaria.demo.entity.Local;
import com.inmobiliaria.demo.entity.Villa;
import com.inmobiliaria.demo.mapper.MapperLocal;
import com.inmobiliaria.demo.mapper.MapperVilla;
import com.inmobiliaria.demo.repository.RepositoryLocal;
import com.inmobiliaria.demo.repository.RepositoryVilla;
import com.inmobiliaria.demo.service.ServiceVilla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camper
 */
@Service
public class ServiceImplVilla implements ServiceVilla{

    @Autowired
    private MapperVilla mv;
    
    @Autowired
    private RepositoryVilla rv;
    
    @Override
    public Villa createVilla(DtoVilla dv) {
        Villa v=mv.toEntity(dv);
        /*Guardamos los datos*/
        return rv.save(v);
    }
    
}
