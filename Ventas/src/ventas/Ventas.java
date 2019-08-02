/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import Espe.X.Orden;
import Espe.X.Producto;


/**
 *
 * @author DELL
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p1=new Producto("Camiseta", 30.00);
        Producto p2=new Producto("Pantalon", 60.00);
        Producto p3=new Producto("Zapatos", 80.00);
        Producto p4=new Producto("Camisa", 40.00);
Orden orden1=new Orden();
orden1.agregarProducto(p1);
orden1.agregarProducto(p2);
orden1.agregarProducto(p3);
orden1.agregarProducto(p4);

Orden orden2=new Orden();
orden2.agregarProducto(p1);
orden2.agregarProducto(p2);
orden2.agregarProducto(p3);
orden2.agregarProducto(p4);
//imprimir orden
orden1.imprimirOrden();

orden2.imprimirOrden();

    }
    
}
