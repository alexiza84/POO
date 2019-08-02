/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaiza_alex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pruebaiza_Alex2 {
    
    public static void main(String[] args) {
Scanner sc= new Scanner (System.in);
       boolean entradaValida=true;
       int numVendedores = 0;
        do{
          try  {
  System.out.println("Ingrese la cantidad de vendedores");
   numVendedores=sc.nextInt();
               entradaValida=false;
                }
        catch (InputMismatchException ex) {
            System.out.println("Error;Ingrese numeros enteros");
            sc.nextLine();
       }        
         } while (entradaValida);
      
     sc.nextLine();
       
       ArrayList<String>Vendedores = new ArrayList<String>();
        float[] ventas=new float [numVendedores];
        float total=0;
        for (int i = 0; i < numVendedores; i++) {
              System.out.println("Trabajando con el empleado "+(i+1));
       System.out.println("Ingrese el nombre");
     String nombre = sc.nextLine();
     Vendedores.add(nombre);


     System.out.println("Ingrese la cantidad vendida "+(i+1));
                float  venta=sc.nextFloat();

    ventas[i]=venta;
    total+=venta;
    
                    sc.nextLine();

        }
       //imprimir datos
        System.out.println("Vendedor\tVenta");
        for (int i = 0; i < numVendedores; i++) {
        System.out.println(Vendedores.get(i)+"\t\t"+ventas[i]);
 System.out.println();
        }
           
       System.out.println("____________________________________");
     float promedio=total/numVendedores;
    System.out.println("\t\tTotal "+total);
        System.out.println("\t\tPromedio "+promedio);


    
    }
}   