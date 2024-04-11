/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.controllers;

import com.inmobiliaria.demo.dto.DtoLocal;
import com.inmobiliaria.demo.dto.DtoPropietario;
import com.inmobiliaria.demo.entity.Local;
import com.inmobiliaria.demo.entity.Propietario;
import com.inmobiliaria.demo.mapper.MapperLocal;
import com.inmobiliaria.demo.mapper.MapperPropietario;
import com.inmobiliaria.demo.service.ServiceLocal;
import com.inmobiliaria.demo.service.ServicePropietario;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camper
 */

@RestController
@RequestMapping("/local")
public class ControllerLocal {
    
    @Autowired
    private ServiceLocal sl;
    
    @Autowired
    private MapperLocal ml;
    
    @PostMapping("/agregar_local")
    public ResponseEntity<DtoLocal> guardarLocal
        (@RequestBody DtoLocal dl) throws ParseException{
        Local l=sl.createLocal(dl);
        
        if(l==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(dl,HttpStatus.CREATED);
    }
    
}
