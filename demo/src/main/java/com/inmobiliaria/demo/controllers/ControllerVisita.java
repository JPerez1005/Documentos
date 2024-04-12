/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.controllers;

import com.inmobiliaria.demo.dto.DtoInmueble;
import com.inmobiliaria.demo.dto.DtoVisita;
import com.inmobiliaria.demo.service.ServiceInmobiliaria;
import com.inmobiliaria.demo.service.ServiceVisita;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camper
 */

@RestController
@RequestMapping("/visita")
public class ControllerVisita {
    @Autowired
    private ServiceVisita sv;
    
    @PostMapping("enviar_visita")
    public ResponseEntity<DtoVisita> guardarDirector(
            @RequestParam Long inmuebleId,
            @RequestParam Long clienteId,
            @RequestBody DtoVisita di) throws ParseException{
        DtoVisita createdVisita=sv.createVisita(clienteId, inmuebleId, di);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(createdVisita);
    }
}
