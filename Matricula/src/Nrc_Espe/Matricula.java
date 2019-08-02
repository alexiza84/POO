/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nrc_Espe;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Matricula {
    private final int idMatricula;
    private ArrayList<Nrc> nrc; //debe ser array list
    private static int contadorNrc;

    public Matricula() {
        this.idMatricula=++contadorNrc;
        nrc=new ArrayList<>();//creo el array list
    }
public void agregarNrc(Nrc nrcs){
   nrc.add(nrcs);
}
//    else{
//        System.out.println("Se ha superado el maximo de productos"+maxProductos);
//        }
//}
public double calcularTotal(){
    double total=0;
    for(int i=0; i<nrc.size();i++){
        total+=nrc.get(i).getNumHoras();
}
    return total;
}
public void imprimirNrc(){
    System.out.println("Matricula: "+idMatricula);
    System.out.println("Total de las Horas "+calcularTotal());
    System.out.println("Nombres de los matriculados");
    for (int i = 0; i < nrc.size(); i++) {
            System.out.println(nrc.get(i));

    }


}
}
