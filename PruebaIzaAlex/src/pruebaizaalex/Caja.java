/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaizaalex;

/**
 *
 * @author CORE i5
 */
class Caja {
    int ancho=3;
    int alto=2;
    int profundo=6;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    public Caja() {
        
    }

       public Caja(int ancho,int alto,int profundo){
     
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;    
    }
    
    
    int calculeVolumen(int ancho,int alto,int profundo){
    return alto*ancho*profundo;
}
     int calculeVolumen(){
    return alto*ancho*profundo;
}
}
