/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.mapper;

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
import org.springframework.stereotype.Component;

/**
 *
 * @author camper
 */

@Component
public class MapperInmueble {
    public DtoInmueble toDto(Inmueble i){
        DtoInmueble di=new DtoInmueble();
        di.setId(i.getId());
        di.setEstado(i.getEstado());
        di.setPrecio(i.getPrecio());
        di.setCiudad(i.getCiudad());
        di.setNumero_referencia(i.getNumero_referencia());
        
        if(i.getOficina()!=null){
            Oficina o=i.getOficina();
            DtoOficina dto=new DtoOficina();
            
            dto.setId(o.getId());
            dto.setZona(o.getZona());
            
            di.setOficina(dto);
        }
        
        if(i.getPropietario()!=null){
            Propietario p=i.getPropietario();
            DtoPropietario dp=new DtoPropietario();
            
            dp.setId(p.getId());
            dp.setNombre(p.getNombre());
            
            di.setPropietario(dp);
        }
        
        if(i.getVilla()!=null){
            Villa v=i.getVilla();
            DtoVilla dv=new DtoVilla();
            
            dv.setId(v.getId());
            dv.setAseos(v.getAseos());
            dv.setBaños(v.getBaños());
            dv.setCocinas(v.getCocinas());
            dv.setGas_ciudad(v.getGas_ciudad());
            dv.setHabitaciones(v.getHabitaciones());
            dv.setParquet(v.getParquet());
            dv.setPuerta_blindada(v.getPuerta_blindada());
            dv.setTamaño_parcela(v.getTamaño_parcela());
            dv.setUrbanizacion(v.getUrbanizacion());
            
            di.setVilla(dv);
        }
        
        if(i.getPisos()!=null){
            Pisos p=i.getPisos();
            DtoPisos dp=new DtoPisos();
            
            dp.setId(p.getId());
            dp.setAseos(p.getAseos());
            dp.setBaños(p.getBaños());
            dp.setCocinas(p.getCocinas());
            dp.setGas_ciudad(p.getGas_ciudad());
            dp.setHabitaciones(p.getHabitaciones());
            dp.setParquet(p.getParquet());
            dp.setPuerta_blindada(p.getPuerta_blindada());
            dp.setNuevo(p.getNuevo());
            
            di.setPisos(dp);
        }
        
        if(i.getCasas()!=null){
            Casas c=i.getCasas();
            DtoCasas dc=new DtoCasas();
            
            dc.setId(c.getId());
            dc.setAseos(c.getAseos());
            dc.setBaños(c.getBaños());
            dc.setCocinas(c.getCocinas());
            dc.setGas_ciudad(c.getGas_ciudad());
            dc.setHabitaciones(c.getHabitaciones());
            dc.setParquet(c.getParquet());
            dc.setPuerta_blindada(c.getPuerta_blindada());
            
            di.setCasas(dc);
        }
        
        if(i.getLocal()!=null){
            Local l=i.getLocal();
            DtoLocal dl=new DtoLocal();
            
            dl.setId(l.getId());
            dl.setDiafono(l.getDiafono());
            dl.setAcondicionado(l.getAcondicionado());
            dl.setNumero_puertas_entrada(l.getNumero_puertas_entrada());
            
            di.setLocal(dl);
        }
        
        
        return di;
    }
    
    public Inmueble toEntity(DtoInmueble di){
        Inmueble i=new Inmueble();
        
        i.setId(di.getId());
        i.setEstado(di.getEstado());
        i.setPrecio(di.getPrecio());
        i.setCiudad(di.getCiudad());
        i.setNumero_referencia(di.getNumero_referencia());
        
        if(di.getOficina()!=null){
            DtoOficina dto=di.getOficina();
            Oficina o=new Oficina();
            
            o.setId(dto.getId());
            i.setOficina(o);
        }
        
        if(di.getPropietario()!=null){
            DtoPropietario dp=di.getPropietario();
            Propietario p=new Propietario();
            
            p.setId(dp.getId());
            i.setPropietario(p);
        }
        
        if(di.getVilla()!=null){
            DtoVilla dv=di.getVilla();
            Villa v=new Villa();
            
            v.setId(dv.getId());
            i.setVilla(v);
        }
        
        if(di.getPisos()!=null){
            DtoPisos dp=di.getPisos();
            Pisos p=new Pisos();
            
            p.setId(dp.getId());
            i.setPisos(p);
        }
        
        if(di.getCasas()!=null){
            DtoCasas dc=di.getCasas();
            Casas c=new Casas();
            
            c.setId(dc.getId());
            i.setCasas(c);
        }
        
        if(di.getLocal()!=null){
            DtoLocal dl=di.getLocal();
            Local l=new Local();
            
            l.setId(dl.getId());
            i.setLocal(l);
        }
        
        
        return i;
    }
}
