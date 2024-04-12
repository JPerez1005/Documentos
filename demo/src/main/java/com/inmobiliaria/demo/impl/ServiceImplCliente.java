/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.impl;

import com.inmobiliaria.demo.dto.DtoCliente;
import com.inmobiliaria.demo.entity.Cliente;
import com.inmobiliaria.demo.mapper.MapperCliente;
import com.inmobiliaria.demo.repository.RepositoryCliente;
import com.inmobiliaria.demo.service.ServiceCliente;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camper
 */
@Service
public class ServiceImplCliente implements ServiceCliente{
    
    @Autowired
    private MapperCliente mc;
    
    @Autowired
    private RepositoryCliente rc;

    @Override
    public Cliente createCliente(DtoCliente dc) {
        Cliente c=mc.toEntity(dc);
        
        return rc.save(c);
    }

    @Override
    public DtoCliente updateCliente(Long id, DtoCliente dc) {
        Optional<Cliente> oc=rc.findById(id);
        if(oc.isPresent()){
            Cliente c=oc.get();
            c.setNombre(dc.getNombre());
            c.setTelefono(c.getTelefono());
            
            c=rc.save(c);
            return mc.toDto(c);
        }
        return null;
    }
    
}
