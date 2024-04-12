/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.controllers;

import com.inmobiliaria.demo.dto.DtoCliente;
import com.inmobiliaria.demo.dto.DtoInmueble;
import com.inmobiliaria.demo.service.ServiceInmobiliaria;
import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/inmueble")
public class ControllerInmueble {
    
    @Autowired
    private ServiceInmobiliaria si;
    
    @PostMapping("guardar_inmueble")
    public ResponseEntity<DtoInmueble> guardarDirector(@RequestParam Long oficinaId,
            @RequestParam Long propietarioId,
            @RequestParam Long villaId,
            @RequestParam Long pisosId,
            @RequestParam Long casasId,
            @RequestParam Long localId,
            @RequestBody DtoInmueble di) throws ParseException{
        DtoInmueble createdInmueble=si.createInmueble
        (oficinaId,
        propietarioId, 
        villaId, 
        pisosId, 
        casasId, 
        localId,
        di);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdInmueble);
    }
    
    @GetMapping("listar_inmuebles")
    public ResponseEntity<List<DtoInmueble>> listarInmuebles(){
        List<DtoInmueble> inmuebles=si.getAllInmuebles();
        return new ResponseEntity<>(inmuebles,HttpStatus.OK);
    }
    
    @GetMapping("listar_inmuebles_alquiler")
    public ResponseEntity<List<DtoInmueble>> listarInmueblesByAlquiler(){
        List<DtoInmueble> inmuebles=si.getAllInmueblesByAlquiler();
        return new ResponseEntity<>(inmuebles,HttpStatus.OK);
    }
    
    @GetMapping("listar_inmuebles_venta")
    public ResponseEntity<List<DtoInmueble>> listarInmueblesByVenta(){
        List<DtoInmueble> inmuebles=si.getAllInmueblesByVenta();
        return new ResponseEntity<>(inmuebles,HttpStatus.OK);
    }
    
}
