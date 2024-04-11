/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.controllers;

import com.inmobiliaria.demo.dto.DtoLocal;
import com.inmobiliaria.demo.dto.DtoVilla;
import com.inmobiliaria.demo.entity.Local;
import com.inmobiliaria.demo.entity.Villa;
import com.inmobiliaria.demo.mapper.MapperLocal;
import com.inmobiliaria.demo.mapper.MapperVilla;
import com.inmobiliaria.demo.service.ServiceLocal;
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
@RequestMapping("/villa")
public class ControllerVilla {
    @Autowired
    private ServiceVilla sv;
    
    @Autowired
    private MapperVilla mv;
    
    @PostMapping("/agregar_villa")
    public ResponseEntity<DtoVilla> guardarLocal
        (@RequestBody DtoVilla dv) throws ParseException{
        Villa v=sv.createVilla(dv);
        
        if(v==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(dv,HttpStatus.CREATED);
    }
}
