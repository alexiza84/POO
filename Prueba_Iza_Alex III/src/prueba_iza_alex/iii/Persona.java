/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_iza_alex.iii;

/**
 *
 * @author DELL
 */
public class Persona {
  
    private String nombre, email;
     public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
public void imprimirdatos(){
        System.out.println("Nombre: "+this.nombre+" Email: "+this.email);
       
    }
   

}
