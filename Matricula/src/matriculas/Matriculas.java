/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriculas;

import Nrc_Espe.Matricula;
import Nrc_Espe.Nrc;

/**
 *
 * @author DELL
 */
public class Matriculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nrc p1=new Nrc("Alex", 30.3);
        Nrc p2=new Nrc("Juan", 6000);
        Nrc p3=new Nrc("Katty", 8000);
        Nrc p4=new Nrc("Cecibel", 4000);
Matricula matricula1=new Matricula();
matricula1.agregarNrc(p1);
matricula1.agregarNrc(p2);
matricula1.agregarNrc(p3);
matricula1.agregarNrc(p4);

matricula1.imprimirNrc();

  }
    
}
