/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.controllers;

import com.inmobiliaria.demo.dto.DtoCliente;
import com.inmobiliaria.demo.dto.DtoOficina;
import com.inmobiliaria.demo.entity.Cliente;
import com.inmobiliaria.demo.entity.Oficina;
import com.inmobiliaria.demo.mapper.MapperCliente;
import com.inmobiliaria.demo.service.ServiceCliente;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camper
 */
@RestController
@RequestMapping("/cliente")
public class ControllerCliente {
    
    @Autowired
    private ServiceCliente sc;
    
    @Autowired 
    private MapperCliente mc;
    
    @PostMapping("/agregar_cliente")
    public ResponseEntity<DtoCliente> guardarCliente
        (@RequestBody DtoCliente dc) throws ParseException{
        Cliente c=sc.createCliente(dc);
        
        if(c==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        
        //DtoOficina dp2=mo.toDto(o);//Aquí lo convertimos a Dto
        return new ResponseEntity<>(dc,HttpStatus.CREATED);
    }
        
    @PutMapping("editar_cliente/{id}")
    public ResponseEntity<DtoCliente> actualizarCliente
        (@PathVariable Long id,@RequestBody DtoCliente dc){
        
            DtoCliente updateCliente=sc.updateCliente(id, dc);
            
            if (updateCliente!=null) {
                return new ResponseEntity<>(updateCliente,HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
    }
    
}
