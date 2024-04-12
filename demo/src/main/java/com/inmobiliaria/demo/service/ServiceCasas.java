/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inmobiliaria.demo.service;

import com.inmobiliaria.demo.dto.DtoCasas;
import com.inmobiliaria.demo.dto.DtoPisos;
import com.inmobiliaria.demo.entity.Casas;
import com.inmobiliaria.demo.entity.Pisos;

/**
 *
 * @author camper
 */
public interface ServiceCasas {
    Casas createCasas(DtoCasas dc);
}
