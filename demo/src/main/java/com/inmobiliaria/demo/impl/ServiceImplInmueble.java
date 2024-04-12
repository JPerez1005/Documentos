/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.impl;

import com.inmobiliaria.demo.dto.DtoCasas;
import com.inmobiliaria.demo.dto.DtoInmueble;
import com.inmobiliaria.demo.dto.DtoLocal;
import com.inmobiliaria.demo.dto.DtoOficina;
import com.inmobiliaria.demo.dto.DtoPisos;
import com.inmobiliaria.demo.dto.DtoPropietario;
import com.inmobiliaria.demo.dto.DtoVilla;
import com.inmobiliaria.demo.entity.Casas;
import com.inmobiliaria.demo.entity.Inmueble;
import com.inmobiliaria.demo.entity.Local;
import com.inmobiliaria.demo.entity.Oficina;
import com.inmobiliaria.demo.entity.Pisos;
import com.inmobiliaria.demo.entity.Propietario;
import com.inmobiliaria.demo.entity.Villa;
import com.inmobiliaria.demo.mapper.MapperCasas;
import com.inmobiliaria.demo.mapper.MapperInmueble;
import com.inmobiliaria.demo.mapper.MapperLocal;
import com.inmobiliaria.demo.mapper.MapperOficina;
import com.inmobiliaria.demo.mapper.MapperPisos;
import com.inmobiliaria.demo.mapper.MapperPropietario;
import com.inmobiliaria.demo.mapper.MapperVilla;
import com.inmobiliaria.demo.repository.RepositoryCasas;
import com.inmobiliaria.demo.repository.RepositoryInmueble;
import com.inmobiliaria.demo.repository.RepositoryLocal;
import com.inmobiliaria.demo.repository.RepositoryOficina;
import com.inmobiliaria.demo.repository.RepositoryPisos;
import com.inmobiliaria.demo.repository.RepositoryPropietario;
import com.inmobiliaria.demo.repository.RepositoryVilla;
import com.inmobiliaria.demo.service.ServiceCasas;
import com.inmobiliaria.demo.service.ServiceInmobiliaria;
import com.inmobiliaria.demo.service.ServiceLocal;
import com.inmobiliaria.demo.service.ServiceOficina;
import com.inmobiliaria.demo.service.ServicePisos;
import com.inmobiliaria.demo.service.ServicePropietario;
import com.inmobiliaria.demo.service.ServiceVilla;
import jakarta.persistence.EntityNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camper
 */
@Service
public class ServiceImplInmueble implements ServiceInmobiliaria{

    /*Repositories de todos*/
    @Autowired
    private RepositoryOficina ro;
    
    @Autowired
    private RepositoryPropietario rp1;
    
    @Autowired
    private RepositoryVilla rv;
    
    @Autowired
    private RepositoryPisos rp2;
    
    @Autowired
    private RepositoryCasas rc;
    
    @Autowired
    private RepositoryLocal rl;
    
    @Autowired
    private RepositoryInmueble ri;
    
    /*Mappers de todos*/
    @Autowired
    private MapperOficina mo;
    
    @Autowired
    private MapperPropietario mp1;
    
    @Autowired
    private MapperVilla mv;
    
    @Autowired
    private MapperPisos mp2;
    
    @Autowired
    private MapperCasas mc;
    
    @Autowired
    private MapperLocal ml;
    
    @Autowired
    private MapperInmueble mi;
    
    
    @Override
    public DtoInmueble createInmueble
        (Long oficinaId,
        Long propietarioId,
        Long villaId, 
        Long pisosId, 
        Long casasId, 
        Long localId, 
        DtoInmueble di) {
            
            /*datos del dto*/
            DtoOficina dto=convertidorOficina(oficinaId)
            .orElseThrow(()->new EntityNotFoundException
            ("Oficina no encontrada"));
            
            DtoPropietario dp1=convertidorPropietario(propietarioId)
            .orElseThrow(()->new EntityNotFoundException
            ("Propietario no encontrado"));
            
            DtoVilla dv=convertidorVillas(villaId)
            .orElseThrow(()->new EntityNotFoundException
            ("villa no encontrada"));
            
            DtoPisos dp2=convertidorPisos(pisosId)
            .orElseThrow(()->new EntityNotFoundException
            ("piso no encontrado"));
            
            DtoCasas dc=convertidorCasas(casasId)
            .orElseThrow(()->new EntityNotFoundException
            ("casa no encontrada"));
            
            DtoLocal dl=convertidorLocal(localId)
            .orElseThrow(()->new EntityNotFoundException
            ("Local no encontrada"));
            
            /*datos del entity*/
            Oficina o=ro.findById(dto.getId())
            .orElseThrow(()->new EntityNotFoundException
            ("Oficina no encontrada"));
            
            Propietario p1=rp1.findById(dp1.getId())
            .orElseThrow(()->new EntityNotFoundException
            ("Propietario no encontrada"));
            
            Villa v=rv.findById(dv.getId())
            .orElseThrow(()->new EntityNotFoundException
            ("villa no encontrada"));
            
            Pisos p2=rp2.findById(dp2.getId())
            .orElseThrow(()->new EntityNotFoundException
            ("Piso no encontrada"));
            
            Casas c=rc.findById(dv.getId())
            .orElseThrow(()->new EntityNotFoundException
            ("casa no encontrada"));
            
            Local l=rl.findById(dv.getId())
            .orElseThrow(()->new EntityNotFoundException
            ("Local no encontrado"));
            
            /*creamos el inmueble para mandarlo*/
            Inmueble i=new Inmueble();
            
            /*mandamos datos al inmueble ya creado*/
            i.setOficina(o);
            i.setPropietario(p1);
            i.setVilla(v);
            i.setPisos(p2);
            i.setCasas(c);
            i.setLocal(l);
            /*nuevos datos implementados*/
            i.setId(di.getId());
            i.setEstado(di.getEstado());
            i.setPrecio(di.getPrecio());
            i.setCiudad(di.getCiudad());
            i.setNumero_referencia(di.getNumero_referencia());
            
            /*Guardamos esos datos*/
            Inmueble inmuebleCreado=ri.save(i);
            
            /*mandamos los datos*/
            return mi.toDto(inmuebleCreado);
    }
        
    public Optional<DtoOficina> convertidorOficina(Long id){
        Optional<Oficina> oo=ro.findById(id);
        return oo.map(mo::toDto);
    }
    
    public Optional<DtoPropietario> convertidorPropietario(Long id){
        Optional<Propietario> op=rp1.findById(id);
        return op.map(mp1::toDto);
    }
    
    public Optional<DtoVilla> convertidorVillas(Long id){
        Optional<Villa> op=rv.findById(id);
        return op.map(mv::toDto);
    }
    
    public Optional<DtoPisos> convertidorPisos(Long id){
        Optional<Pisos> op=rp2.findById(id);
        return op.map(mp2::toDto);
    }
    
    public Optional<DtoCasas> convertidorCasas(Long id){
        Optional<Casas> oc=rc.findById(id);
        return oc.map(mc::toDto);
    }
    
    public Optional<DtoLocal> convertidorLocal(Long id){
        Optional<Local> ol=rl.findById(id);
        return ol.map(ml::toDto);
    }
    
}
