/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.controllers;

import com.inmobiliaria.demo.dto.DtoOficina;
import com.inmobiliaria.demo.dto.DtoPropietario;
import com.inmobiliaria.demo.entity.Oficina;
import com.inmobiliaria.demo.entity.Propietario;
import com.inmobiliaria.demo.mapper.MapperOficina;
import com.inmobiliaria.demo.service.ServiceOficina;
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
@RequestMapping("/oficina")
public class ControllerOficina {
    
    @Autowired
    private ServiceOficina so;
    
    @Autowired
    private MapperOficina mo;
    
    @PostMapping("/agregar_oficina")
    public ResponseEntity<DtoOficina> guardarUsuario
        (@RequestBody DtoOficina dto) throws ParseException{
        Oficina o=so.createOficina(dto);
        
        if(o==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        
        DtoOficina dp2=mo.toDto(o);//Aquí lo convertimos a Dto
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }
    
}
