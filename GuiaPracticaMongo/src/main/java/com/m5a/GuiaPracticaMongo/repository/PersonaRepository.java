/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.GuiaPracticaMongo.repository;

import com.m5a.GuiaPracticaMongo.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author User
 */
public interface PersonaRepository extends MongoRepository<Persona, Long>{
    
}
