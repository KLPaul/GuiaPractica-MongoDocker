/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.GuiaPracticaMongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Contactos")
@Data
public class Contactos {
    private String correo;
    private String celular;
    
}
