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
public class Paciente extends Persona{
 private String Tipo_afl;
  private String fecha_ing;
  private String Contraseña;

    public Paciente() {
    }

    public Paciente(String Tipo_afl, String fecha_ing, String contraseña, String Nombre, String Apellido, String Fecha_nacimiento, String Identificacion, String Genero, String Direccion, String Celular) {
        super(Nombre, Apellido, Fecha_nacimiento, Identificacion, Genero, Direccion, Celular);
        this.Tipo_afl = Tipo_afl;
        this.fecha_ing = fecha_ing;
        this.Contraseña = contraseña;
    }

    public String getTipo_afl() {
        return Tipo_afl;
    }

    public void setTipo_afl(String Tipo_afl) {
        this.Tipo_afl = Tipo_afl;
    }

    public String getFecha_ing() {
        return fecha_ing;
    }

    public void setFecha_ing(String fecha_ing) {
        this.fecha_ing = fecha_ing;
    }
  
    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }   
}
