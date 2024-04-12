/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.impl;

import com.inmobiliaria.demo.dto.DtoPropietario;
import com.inmobiliaria.demo.entity.Propietario;
import com.inmobiliaria.demo.mapper.MapperPropietario;
import com.inmobiliaria.demo.repository.RepositoryPropietario;
import com.inmobiliaria.demo.service.ServicePropietario;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camper
 */

@Service
public class ServiceImplPropietario implements ServicePropietario{

    /*Datos Propietario*/
    @Autowired
    private MapperPropietario mp;
    
    @Autowired
    private RepositoryPropietario rp;
    
    @Override
    public Propietario createUser(DtoPropietario dp) throws ParseException {
        //cambiamos datos de dto a entidad
        Propietario p=mp.toEntity(dp);
        /*Guardamos los datos*/
        return rp.save(p);
    }
    
}
