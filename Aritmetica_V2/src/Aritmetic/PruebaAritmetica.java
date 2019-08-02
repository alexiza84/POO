package Aritmetic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Aritmetica.Aritmetica;

public class PruebaAritmetica {

    /**
0989068929     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aritmetica a=new Aritmetica(1,2);
     System.out.println("Operacion sin argumentos");

        int resultadosuma=a.Sumar(3,4);
      System.out.println("La Suma es: "+resultadosuma);
        int resultadoresta=a.Restar(3,4);
      System.out.println("La resta es: "+resultadoresta);
      int resultadomultiplicacion=a.Multiplicar(3,4);
      System.out.println("La multilpicacion es: "+resultadomultiplicacion);
       float resultadodivision=a.Dividir(3,4);
      System.out.println("La division es: "+resultadodivision);
      
      System.out.println("Operacion con argumentos");
        int resultadosuma1=a.Sumar();
      System.out.println("La Suma es: "+resultadosuma1);
        int resultadoresta1=a.Restar();
      System.out.println("La resta es: "+resultadoresta1);
      int resultadomultiplicacion1=a.Multiplicar();
      System.out.println("La multilpicacion es: "+resultadomultiplicacion1);
       float resultadodivision1=a.Dividir();
      System.out.println("La division es: "+resultadodivision1);  

    }
      
}
