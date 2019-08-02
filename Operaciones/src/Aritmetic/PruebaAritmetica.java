package Aritmetic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Aritmetica.Aritmetica;

public class PruebaAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aritmetica a=new Aritmetica();
        int resultadosuma=a.Sumar(3,4,5);
      System.out.println("La Suma es: "+resultadosuma);
        int resultadoresta=a.Restar(3,4);
      System.out.println("La resta es: "+resultadoresta);
      int resultadomultiplicacion=a.Multiplicar(3,4);
      System.out.println("La multilpicacion es: "+resultadomultiplicacion);
       float resultadodivision=a.Dividir(3,4);
      System.out.println("La division es: "+resultadodivision);
    }
      
}
