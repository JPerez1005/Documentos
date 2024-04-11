/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.controllers;

import com.inmobiliaria.demo.dto.DtoCasas;
import com.inmobiliaria.demo.dto.DtoVilla;
import com.inmobiliaria.demo.entity.Casas;
import com.inmobiliaria.demo.entity.Villa;
import com.inmobiliaria.demo.mapper.MapperCasas;
import com.inmobiliaria.demo.mapper.MapperVilla;
import com.inmobiliaria.demo.service.ServiceCasas;
import com.inmobiliaria.demo.service.ServiceVilla;
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
@RequestMapping("/casas")
public class ControllerCasas {
    @Autowired
    private ServiceCasas sc;
    
    @Autowired
    private MapperCasas mc;
    
    @PostMapping("/agregar_casas")
    public ResponseEntity<DtoCasas> guardarCasa
        (@RequestBody DtoCasas dc) throws ParseException{
        Casas c=sc.createCasas(dc);
        
        if(c==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(dc,HttpStatus.CREATED);
    }
}
