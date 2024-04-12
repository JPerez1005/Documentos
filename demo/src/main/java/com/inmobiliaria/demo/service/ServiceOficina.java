/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inmobiliaria.demo.service;

import com.inmobiliaria.demo.dto.DtoOficina;
import com.inmobiliaria.demo.entity.Oficina;

/**
 *
 * @author camper
 */
public interface ServiceOficina {
    Oficina createOficina(DtoOficina dto);
}
