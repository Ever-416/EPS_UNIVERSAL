/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsuniversal.Clases;

/**
 *
 * @author Familia Salgado
 */
public class Doctor extends Persona{
 private String Especialidad;
    private String Jornada;
    private String Contraseña;

    public Doctor() {
    }

    public Doctor(String Especialidad, String Jornada, String Contraseña, String Nombre, String Apellido, String Fecha_nacimiento, String Identificacion, String Genero, String Direccion, String Celular) {
        super(Nombre, Apellido, Fecha_nacimiento, Identificacion, Genero, Direccion, Celular);
        this.Especialidad = Especialidad;
        this.Jornada = Jornada;
        this.Contraseña = Contraseña;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }   
}
