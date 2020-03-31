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
public class Cita {
 private String Fecha;
private String Intervencion;
private String Sintoma;
private String Tratamiento;

    public Cita() {
    }

    public Cita(String Fecha, String Intervenciones, String Sintoma, String Tratamiento) {
        this.Fecha = Fecha;
        this.Intervencion = Intervenciones;
        this.Sintoma = Sintoma;
        this.Tratamiento = Tratamiento;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getIntervenciones() {
        return Intervencion;
    }

    public void setIntervenciones(String Intervenciones) {
        this.Intervencion = Intervenciones;
    }

    public String getSintoma() {
        return Sintoma;
    }

    public void setSintoma(String Sintoma) {
        this.Sintoma = Sintoma;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }   
}
