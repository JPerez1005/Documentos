/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inmobiliaria.demo.service;

import com.inmobiliaria.demo.dto.DtoInmueble;
import java.util.List;

/**
 *entidad,repositorio,dto,service,serviceImpl,controller
 * @author camper
 */
public interface ServiceInmobiliaria {
    DtoInmueble createInmueble
        (Long oficinaId,
        Long propietarioId,
        Long villaId,
        Long pisosId,
        Long casasId,
        Long localId,
        DtoInmueble di);
        
        List<DtoInmueble> getAllInmuebles();
        
        public List<DtoInmueble> getAllInmueblesByVenta();
        
        public List<DtoInmueble> getAllInmueblesByAlquiler();
}
