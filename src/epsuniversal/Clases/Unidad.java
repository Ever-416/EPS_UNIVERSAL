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
public class Unidad {
private String Nombre;
private String ID;
private String Centro;
private Doctor DocResp;

    public Unidad() {
    }

    public Unidad(String Nombre, String ID, String Centro, Doctor DocResp) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Centro = Centro;
        this.DocResp = DocResp;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCentro() {
        return Centro;
    }

    public void setCentro(String Centro) {
        this.Centro = Centro;
    }

    public Doctor getDocResp() {
        return DocResp;
    }

    public void setDocResp(Doctor DocResp) {
        this.DocResp = DocResp;
    }    
}
