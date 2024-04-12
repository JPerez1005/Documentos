/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.impl;

import com.inmobiliaria.demo.dto.DtoPisos;
import com.inmobiliaria.demo.entity.Casas;
import com.inmobiliaria.demo.entity.Pisos;
import com.inmobiliaria.demo.mapper.MapperPisos;
import com.inmobiliaria.demo.mapper.MapperVilla;
import com.inmobiliaria.demo.repository.RepositoryPisos;
import com.inmobiliaria.demo.repository.RepositoryVilla;
import com.inmobiliaria.demo.service.ServicePisos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camper
 */
@Service
public class ServiceImplPisos implements ServicePisos{

    @Autowired
    private MapperPisos mp;
    
    @Autowired
    private RepositoryPisos rp;
    
    @Override
    public Pisos createPisos(DtoPisos dp) {
        Pisos p=mp.toEntity(dp);
        /*Guardamos los datos*/
        return rp.save(p);
    }
    
}
