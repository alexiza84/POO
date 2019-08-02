/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nrc_Espe;

/**
 *
 * @author DELL
 */
public class Nrc {
    private int id;
    private String nombre;
    private double numHoras;
    private static int contarNrc;
 
     public Nrc() {
            this.id=++contarNrc;

    } 
    
    public Nrc(String nombre, double numHoras) {
        this();
        this.nombre = nombre;
        this.numHoras = numHoras;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public static int getContarNrc() {
        return contarNrc;
    }

    public static void setContarNrc(int contarNrc) {
        Nrc.contarNrc = contarNrc;
    }
 @Override
    public String toString(){
return "Id: "+id+" , Nombre: "+nombre+" , Numero de Horas: "+numHoras;
        }
}
