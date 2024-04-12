/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.impl;

import com.inmobiliaria.demo.dto.DtoInmueble;
import com.inmobiliaria.demo.repository.RepositoryOficina;
import com.inmobiliaria.demo.service.ServiceCasas;
import com.inmobiliaria.demo.service.ServiceInmobiliaria;
import com.inmobiliaria.demo.service.ServiceLocal;
import com.inmobiliaria.demo.service.ServiceOficina;
import com.inmobiliaria.demo.service.ServicePisos;
import com.inmobiliaria.demo.service.ServicePropietario;
import com.inmobiliaria.demo.service.ServiceVilla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camper
 */
@Service
public class ServiceImplInmueble implements ServiceInmobiliaria{

    /*Services de todos*/
    @Autowired
    private RepositoryOficina ro;
    
    @Autowired
    private ServicePropietario sp1;
    
    @Autowired
    private ServiceVilla sv;
    
    @Autowired
    private ServicePisos sp2;
    
    @Autowired
    private ServiceCasas sc;
    
    @Autowired
    private ServiceLocal sl;
    
    
    @Override
    public DtoInmueble createInmueble
        (Long oficinaId,
        Long propietarioId,
        Long villaId, 
        Long pisosId, 
        Long casasId, 
        Long localId, 
        DtoInmueble di) {
            
//            DtoOficina dto=ro.getReferenceById(oficinaId);
            
            return null;
    }
    
}
