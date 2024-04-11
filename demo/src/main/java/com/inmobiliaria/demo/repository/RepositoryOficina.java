/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inmobiliaria.demo.repository;

import com.inmobiliaria.demo.entity.Oficina;
import com.inmobiliaria.demo.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author camper
 */
@Repository
public interface RepositoryOficina extends JpaRepository<Oficina,Long> {
    
}
