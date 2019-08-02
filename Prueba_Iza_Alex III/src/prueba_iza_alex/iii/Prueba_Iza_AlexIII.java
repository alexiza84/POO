/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_iza_alex.iii;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Prueba_Iza_AlexIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("Lista de empleados");

        Scanner sc= new Scanner (System.in);
System.out.println("Ingrese el numero de empleados: ");

int nEmpleados=sc.nextInt();
sc.nextLine();

Empleado[] persona1=new Empleado[nEmpleados];
int sumatoria = 0;
        for (int i = 0; i < persona1.length; i++) {
            System.out.println("Persona "+(i+1)+" de "+nEmpleados);
System.out.println("\nNombre: ");
String nombre=sc.nextLine();

System.out.println("email: ");
String email=sc.nextLine();

System.out.println("Puesto: ");
String ocupacion=sc.nextLine();

System.out.println("Horas trabajadas: ");
int numhorastrabaj=sc.nextInt();
sc.nextLine();

 System.out.println("Valor x Hora : ");
int valorhora=sc.nextInt();
sc.nextLine(); 

 System.out.println("Descuento : ");
int descuento=sc.nextInt();
sc.nextLine();
  persona1[i]=new Empleado(nombre,email,ocupacion, numhorastrabaj, valorhora, descuento) ;
        }
System.out.println("\nNombre\t\tEmail\t\tPuesto\t\t#Horas trabajadas\tSalario\t\tValorxHora\t\tDescuento\tValor a Recibir ");
        for (int i = 0; i < persona1.length; i++) {
            System.out.println(persona1[i].getNombre()+"\t\t"+persona1[i].getEmail()+"\t\t"+persona1[i].getOcupacion()+"\t\t"+persona1[i].getNumhorastrabaj()+"\t\t\t"+persona1[i].calcularSalario()+"\t\t\t"+persona1[i].getValorhora()+"\t\t"+persona1[i].getDescuento()+"\t\t"+persona1[i].valorRecibir());
        }    
    }
    
}
