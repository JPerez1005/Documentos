package com.inmobiliaria.demo.service;

import com.inmobiliaria.demo.dto.DtoPropietario;
import com.inmobiliaria.demo.entity.Propietario;
import java.text.ParseException;

/**
 *
 * @author camper
 */
public interface ServicePropietario {
    Propietario createUser(DtoPropietario dp) throws ParseException;
}
