/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Espe.X;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Orden {
    private final int idOrden;
    private ArrayList<Producto> productos; //debe ser array list
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int maxProductos=10;//ya no va

    public Orden() {
        this.idOrden=++contadorOrdenes;
        productos=new ArrayList<>();//creo el array list
    }
public void agregarProducto(Producto producto){
   productos.add(producto);
}
//    else{
//        System.out.println("Se ha superado el maximo de productos"+maxProductos);
//        }
//}
public double calcularTotal(){
    double total=0;
    for(int i=0; i<productos.size();i++){
        total+=productos.get(i).getPrecio();
}
    return total;
}
public void imprimirOrden(){
    System.out.println("Orden: "+idOrden);
    System.out.println("Total de la orden "+calcularTotal());
    System.out.println("Productos de la Orden");
    for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));

    }


}
}
