/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inmobiliaria.demo.service;

import com.inmobiliaria.demo.dto.DtoVisita;

/**
 *
 * @author camper
 */
public interface ServiceVisita{
    DtoVisita createVisita(Long clienteId, Long inmuebleId,DtoVisita dv);
}
