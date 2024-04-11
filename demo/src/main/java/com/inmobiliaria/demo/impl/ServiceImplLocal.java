/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.impl;

import com.inmobiliaria.demo.dto.DtoLocal;
import com.inmobiliaria.demo.dto.DtoPropietario;
import com.inmobiliaria.demo.entity.Local;
import com.inmobiliaria.demo.entity.Propietario;
import com.inmobiliaria.demo.mapper.MapperLocal;
import com.inmobiliaria.demo.mapper.MapperPropietario;
import com.inmobiliaria.demo.repository.RepositoryLocal;
import com.inmobiliaria.demo.repository.RepositoryPropietario;
import com.inmobiliaria.demo.service.ServiceLocal;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camper
 */

@Service
public class ServiceImplLocal implements ServiceLocal{
    /*Datos Propietario*/
    @Autowired
    private MapperLocal ml;
    
    @Autowired
    private RepositoryLocal rl;
    
    @Override
    public Local createLocal(DtoLocal dl){
        //cambiamos datos de dto a entidad
        Local l=ml.toEntity(dl);
        /*Guardamos los datos*/
        return rl.save(l);
    }
}
