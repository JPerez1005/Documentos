/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inmobiliaria.demo.service;

import com.inmobiliaria.demo.dto.DtoLocal;
import com.inmobiliaria.demo.dto.DtoVilla;
import com.inmobiliaria.demo.entity.Local;
import com.inmobiliaria.demo.entity.Villa;

/**
 *
 * @author camper
 */
public interface ServiceVilla {
    Villa createVilla(DtoVilla dv);
}
