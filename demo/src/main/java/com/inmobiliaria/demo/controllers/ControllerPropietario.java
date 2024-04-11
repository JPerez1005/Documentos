/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.controllers;

import com.inmobiliaria.demo.dto.DtoPropietario;
import com.inmobiliaria.demo.entity.Propietario;
import com.inmobiliaria.demo.mapper.MapperPropietario;
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
@RequestMapping("/propietario")
public class ControllerPropietario {
    
    @Autowired
    private ServicePropietario sp;
    
    @Autowired
    private MapperPropietario mp;
    
    @PostMapping("/agregar_propietario")
    public ResponseEntity<DtoPropietario> guardarUsuario
        (@RequestBody DtoPropietario dp) throws ParseException{
        Propietario p=sp.createUser(dp);
        
        if(p==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        
        DtoPropietario dp2=mp.toDto(p);//Aquí lo convertimos a Dto
        return new ResponseEntity<>(dp,HttpStatus.CREATED);
    }
    
}
