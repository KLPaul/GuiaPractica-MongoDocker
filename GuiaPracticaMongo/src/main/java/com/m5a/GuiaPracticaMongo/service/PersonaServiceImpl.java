/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.GuiaPracticaMongo.service;

import com.m5a.GuiaPracticaMongo.model.Persona;
import com.m5a.GuiaPracticaMongo.repository.PersonaRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    PersonaRepository personaRepository;
    @Override
    public CrudRepository<Persona, Long> getDao() {
        
    return personaRepository;
    }
        
    
}
