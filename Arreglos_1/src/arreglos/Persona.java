/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author DELL
 */
public class Persona {
    private String nombre;
public Persona (String nombre){
    this.nombre=nombre;
}
public String getnombre(){
    return nombre;
}
public void setNombre(String nombre){
       this.nombre=nombre;
 }


    @Override
 public String toString(){
    return "Persona{"+getnombre()+"}";
    
}
            
            }
