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

Scanner sc= new Scanner (System.in);
System.out.println("Ingrese el numero de personas: ");

int nPersonas=sc.nextInt();
sc.nextLine();


Persona[] persona=new Persona[nPersonas];
int sumatoria = 0;
        for (int i = 0; i < persona.length; i++) {
            System.out.println("Persona "+(i+1)+" de "+nPersonas);
System.out.println("\nNombre: ");
String nombre=sc.nextLine();

System.out.println("Apellido: ");
String apellido=sc.nextLine();

System.out.println("Calificacion: ");
int calificacion=sc.nextInt();
sc.nextLine();

persona[i]=new Persona(nombre,apellido,calificacion);
sumatoria=sumatoria+calificacion;
        }
System.out.println("\nNombre\t\tApellido\tCalificacion ");
        for (int i = 0; i < persona.length; i++) {
            System.out.println(persona[i].getNombre()+"\t\t"+persona[i].getApellido()+"\t\t"+persona[i].getCalificacion());

        }    
    }
}

