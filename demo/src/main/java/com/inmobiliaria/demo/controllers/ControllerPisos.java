/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.controllers;

import com.inmobiliaria.demo.dto.DtoCasas;
import com.inmobiliaria.demo.dto.DtoPisos;
import com.inmobiliaria.demo.entity.Casas;
import com.inmobiliaria.demo.entity.Pisos;
import com.inmobiliaria.demo.mapper.MapperCasas;
import com.inmobiliaria.demo.mapper.MapperPisos;
import com.inmobiliaria.demo.service.ServiceCasas;
import com.inmobiliaria.demo.service.ServicePisos;
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
@RequestMapping("/pisos")
public class ControllerPisos {
    @Autowired
    private ServicePisos sc;
    
    @Autowired
    private MapperPisos mc;
    
    @PostMapping("/agregar_pisos")
    public ResponseEntity<DtoPisos> guardarCasa
        (@RequestBody DtoPisos dc) throws ParseException{
        Pisos c=sc.createPisos(dc);
        
        if(c==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(dc,HttpStatus.CREATED);
    }
}
