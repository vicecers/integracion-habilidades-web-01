/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cersocode.integrador_web.model;

/**
 *
 * @author vicec
 */
public class Solicitud {
    private String nombre;
    private String apellido;
    private String correo;
    private char sexo;
    private String lenguajes;
    private String idiomas;
    private String comentarios;

    public Solicitud() {
    }

    public Solicitud(String nombre, String apellido, String correo, char sexo, String lenguajes, String idiomas, String comentarios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.sexo = sexo;
        this.lenguajes = lenguajes;
        this.idiomas = idiomas;
        this.comentarios = comentarios;
    }

   

 
   

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", sexo=" + sexo + ", lenguajes=" + lenguajes + ", idiomas=" + idiomas + ", comentarios=" + comentarios + '}';
    }      
    
}
