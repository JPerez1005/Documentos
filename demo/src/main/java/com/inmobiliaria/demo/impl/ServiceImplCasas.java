/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.impl;

import com.inmobiliaria.demo.dto.DtoCasas;
import com.inmobiliaria.demo.entity.Casas;
import com.inmobiliaria.demo.entity.Villa;
import com.inmobiliaria.demo.mapper.MapperCasas;
import com.inmobiliaria.demo.mapper.MapperVilla;
import com.inmobiliaria.demo.repository.RepositoryCasas;
import com.inmobiliaria.demo.repository.RepositoryVilla;
import com.inmobiliaria.demo.service.ServiceCasas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camper
 */
@Service
public class ServiceImplCasas implements ServiceCasas{

    @Autowired
    private MapperCasas mc;
    
    @Autowired
    private RepositoryCasas rc;
    
    @Override
    public Casas createCasas(DtoCasas dc) {
        Casas c=mc.toEntity(dc);
        /*Guardamos los datos*/
        return rc.save(c);
    }
    
}
