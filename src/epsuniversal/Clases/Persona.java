/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsuniversal.Clases;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Familia Salgado
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private String Fecha_nacimiento;
    private String Identificacion;
    private String Genero;
    private String Direccion;
    private String Celular;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, String Fecha_nacimiento, String Identificacion, String Genero, String Direccion, String Celular) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.Identificacion = Identificacion;
        this.Genero = Genero;
        this.Direccion = Direccion;
        this.Celular = Celular;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
    public String getFullnombre() {      
      
        return this.Nombre+" "+this.Apellido;
    }
   
    public int getedad() {
        int ed=0;
        try {
         LocalDate hoy = LocalDate.now();
     DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDate fn = LocalDate.parse(this.Fecha_nacimiento, fmt);
     Period periodo = Period.between(fn, hoy);
        ed=periodo.getYears();   
        } catch (Exception e) {
        }
     return ed;
    }   
}
