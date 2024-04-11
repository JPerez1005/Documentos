package com.inmobiliaria.demo.repository;

import com.inmobiliaria.demo.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author camper
 */
@Repository
public interface RepositoryPropietario extends JpaRepository<Propietario,Long> {
    
}
