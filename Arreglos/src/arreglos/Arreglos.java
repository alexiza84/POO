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
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int edades[]={1,2,3,3};

for (int b = 0; b<edades.length; b++) { 
          System.out.println("Persona del indice "+b+" : "+edades[b]);

}
Persona personas[]={new Persona("Pepe"),new Persona("Diana"),new Persona("Luis")};


for (int a = 0; a<personas.length; a++) {
          System.out.println("Persona del indice "+a+" : "+personas[a]);

}
String Apellidos[]={"Suarez", "Iza", "Perez", "Ramon"};

        for (int i = 0; i<Apellidos.length; i++) {
          System.out.println("Apellido indice "+i+" : "+Apellidos[i]);
             
        }
    }
    
}
