/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

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
String Apellido[];
Scanner sc= new Scanner (System.in);

System.out.println("Ingrese el numero de edades");
//er el numero de elementos del elementos
int numElemento=sc.nextInt();
edades= new int[numElemento];
        for (int i = 0; i < edades.length; i++) {
                      System.out.println("Ingrese el elemento "+i+" :");
                     edades[i]=sc.nextInt();

        }
   System.out.println("Los elementos de los arreglos son:");
           for (int i = 0; i < edades.length; i++) {
   System.out.println(edades[i]);
           }

           System.out.println("Ingrese el numero de Apellidos");
//er el numero de elementos del elementos
int numApellidos=sc.nextInt();
Apellido= new String[numApellidos];
        for (int i = 0; i < Apellido.length; i++) {
                      System.out.println("Ingrese el elemento "+i+" :");
                     Apellido[i]=sc.next();

        }
   System.out.println("Los elementos de los arreglos son:");
           for (int i = 0; i < Apellido.length; i++) {
   System.out.println(Apellido[i]);
           
           
/*for (int b = 0; b<edades.length; b++) { 
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
    }*/
    
}
    }
}

