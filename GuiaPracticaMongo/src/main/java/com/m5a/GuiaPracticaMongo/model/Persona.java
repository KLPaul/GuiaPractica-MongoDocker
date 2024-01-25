/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.GuiaPracticaMongo.model;

import java.util.List;
import org.springframework.data.annotation.Id;

public class Persona {

    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private Contactos contactos;
    private List<Telefonia> listTelefonia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Contactos getContactos() {
        return contactos;
    }

    public void setContactos(Contactos contactos) {
        this.contactos = contactos;
    }

    public List<Telefonia> getListTelefonia() {
        return listTelefonia;
    }

    public void setListTelefonia(List<Telefonia> listTelefonia) {
        this.listTelefonia = listTelefonia;
    }
                    
    
}
