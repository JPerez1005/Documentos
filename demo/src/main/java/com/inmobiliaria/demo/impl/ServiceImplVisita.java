/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.impl;

import com.inmobiliaria.demo.dto.DtoCliente;
import com.inmobiliaria.demo.dto.DtoInmueble;
import com.inmobiliaria.demo.dto.DtoOficina;
import com.inmobiliaria.demo.dto.DtoVisita;
import com.inmobiliaria.demo.entity.Cliente;
import com.inmobiliaria.demo.entity.Inmueble;
import com.inmobiliaria.demo.entity.Oficina;
import com.inmobiliaria.demo.entity.Visita;
import com.inmobiliaria.demo.mapper.MapperCliente;
import com.inmobiliaria.demo.mapper.MapperInmueble;
import com.inmobiliaria.demo.mapper.MapperVisita;
import com.inmobiliaria.demo.repository.RepositoryCliente;
import com.inmobiliaria.demo.repository.RepositoryInmueble;
import com.inmobiliaria.demo.repository.RepositoryVisita;
import com.inmobiliaria.demo.service.ServiceVisita;
import jakarta.persistence.EntityNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author camper
 */
public class ServiceImplVisita implements ServiceVisita{

    /*Repositories de todos*/
    @Autowired
    private RepositoryInmueble ri;
    
    @Autowired
    private RepositoryCliente rc;
    
    @Autowired
    private RepositoryVisita rv;
    
    /*Mapper de Todos*/
    
    @Autowired
    private MapperInmueble mi;
    
    @Autowired
    private MapperCliente mc;
    
    @Autowired
    private MapperVisita mv;
    
    @Override
    public DtoVisita createVisita(Long clienteId, Long inmuebleId, DtoVisita dv) {
        
        DtoInmueble di=convertidorInmueble(inmuebleId)
            .orElseThrow(()->new EntityNotFoundException
            ("Inmueble no encontrada"));
        
        DtoCliente dc=convertidorCliente(clienteId)
            .orElseThrow(()->new EntityNotFoundException
            ("Cliente no encontrada"));
        
        /*datos del entity*/
        Inmueble i=ri.findById(dv.getId())
            .orElseThrow(()->new EntityNotFoundException
            ("Inmueble no encontrada"));
        
        Cliente c=rc.findById(dv.getId())
            .orElseThrow(()->new EntityNotFoundException
            ("Cliente no encontrada"));
        
        /*creamos el Visita para mandarlo*/
            Visita v=new Visita();
        
        /*mandamos datos al cliente ya creado*/
        v.setId(dv.getId());
        v.setComentarios(dv.getComentarios());
        v.setCliente(c);
        v.setInmueble(i);
        
        Visita visitaCreada=rv.save(v);
        
        /*mandamos los datos*/
        return mv.toDto(visitaCreada);
    }

    private Optional<DtoInmueble> convertidorInmueble(Long id) {
        Optional<Inmueble> oi=ri.findById(id);
        return oi.map(mi::toDto);
    }

    private Optional<DtoCliente> convertidorCliente(Long id) {
        Optional<Cliente> oc=rc.findById(id);
        return oc.map(mc::toDto);
    }
    
}
