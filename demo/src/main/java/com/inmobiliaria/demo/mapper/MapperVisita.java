/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.mapper;

import com.inmobiliaria.demo.dto.DtoCliente;
import com.inmobiliaria.demo.dto.DtoInmueble;
import com.inmobiliaria.demo.dto.DtoOficina;
import com.inmobiliaria.demo.dto.DtoVisita;
import com.inmobiliaria.demo.entity.Cliente;
import com.inmobiliaria.demo.entity.Inmueble;
import com.inmobiliaria.demo.entity.Oficina;
import com.inmobiliaria.demo.entity.Visita;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Component;

/**
 *
 * @author camper
 */
@Component
public class MapperVisita {
    
    public String convertidorFechaString(Date fecha){
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String formatedFecha=sdf.format(fecha);
        return formatedFecha;
    }
    
    public Date convertidorFechaDate(String fecha) throws ParseException{
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date formatedFecha=sdf.parse(fecha);
        return formatedFecha;
    }
    
    public DtoVisita toDto(Visita v){
        DtoVisita dv=new DtoVisita();
        dv.setId(v.getId());
        dv.setComentarios(v.getComentarios());
        //dv.setFecha(convertidorFechaString(v.getFecha()));
        if(v.getCliente()!=null){
            Cliente c=v.getCliente();
            DtoCliente dc=new DtoCliente();
            
            dc.setId(c.getId());
            dc.setNombre(c.getNombre());
            dc.setTelefono(c.getTelefono());
            
            dv.setCliente(dc);
        }
        
        if(v.getInmueble()!=null){
            Inmueble i=v.getInmueble();
            DtoInmueble di=new DtoInmueble();
            
            di.setId(i.getId());
            di.setEstado(i.getEstado());
            di.setPrecio(i.getPrecio());
            di.setCiudad(i.getCiudad());
            di.setNumero_referencia(i.getNumero_referencia());
            
            dv.setInmueble(di);
        }
        return dv;
    }
    
    public Visita toEntity(DtoVisita dv){
        Visita v=new Visita();
        
        v.setId(dv.getId());
        v.setComentarios(dv.getComentarios());
        
        if(dv.getCliente()!=null){
            DtoCliente dc=dv.getCliente();
            Cliente c=new Cliente();
            
            c.setId(dc.getId());
            v.setCliente(c);
        }
        
        if(dv.getInmueble()!=null){
            DtoInmueble dc=dv.getInmueble();
            Inmueble c=new Inmueble();
            
            c.setId(dc.getId());
            v.setInmueble(c);
        }
        return null;
    }
}
