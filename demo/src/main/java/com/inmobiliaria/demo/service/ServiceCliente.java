package com.inmobiliaria.demo.service;

import com.inmobiliaria.demo.dto.DtoCliente;
import com.inmobiliaria.demo.dto.DtoPropietario;
import com.inmobiliaria.demo.entity.Cliente;
import com.inmobiliaria.demo.entity.Propietario;
import java.text.ParseException;

/**
 *
 * @author camper
 */
public interface ServiceCliente {
    Cliente createCliente(DtoCliente dc);
}
