/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsuniversal.Clases;

import java.util.ArrayList;

/**
 *
 * @author Familia Salgado
 */
public class HistoriaClin {
 private ArrayList<Cita>historial=new ArrayList();  

public void addCita(String fecha, String intervencion, String sintoma, String tratamiento){
    historial.add(new Cita(fecha, intervencion, sintoma, tratamiento));
    }
public ArrayList<Cita> getHisIMC(){  
   return historial;     
}   
}
