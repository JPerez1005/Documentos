/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inmobiliaria.demo.service;

import com.inmobiliaria.demo.dto.DtoPisos;
import com.inmobiliaria.demo.dto.DtoVilla;
import com.inmobiliaria.demo.entity.Pisos;
import com.inmobiliaria.demo.entity.Villa;

/**
 *
 * @author camper
 */
public interface ServicePisos {
    Pisos createPisos(DtoPisos dp);
}
