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
int edades[];
edades=new int[3];
edades[0]=12;
edades[1]=11;
edades[2]=10;

//imprimir arreglo
System.out.println("El elemento 0 es: "+edades[0]);
System.out.println("El elemento 1 es: "+edades[1]);
System.out.println("El elemento 2 es: "+edades[2]);

Persona personas[];
personas=new Persona [3];
personas[0]=new Persona("Pepe");
personas[1]=new Persona("Diana");
personas[2]=new Persona("Luis");

System.out.println("El elemento 0 es: "+personas[0]);
System.out.println("El elemento 1 es: "+personas[1]);
System.out.println("El elemento 2 es: "+personas[2]);

String Apellidos[]={"Suarez", "Iza", "Perez", "Ramon"};

        for (int i = 0; i<Apellidos.length; i++) {
          System.out.println("Apellido indice "+i+" : "+Apellidos[i]);
  
            
        }
    }
    
}
