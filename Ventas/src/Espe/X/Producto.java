/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Espe.X;

/**
 *
 * @author DELL
 */
public class
        Producto {
    
private int idProducto;
    private String nombre;
    private double precio;
    private static int contarProducto;

    public Producto() {
            this.idProducto=++contarProducto;

    }     
    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public static int getContarProducto() {
        return contarProducto;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void setContarProducto(int contarProducto) {
        Producto.contarProducto = contarProducto;
    }

       @Override
    public String toString(){
return "producto: "+idProducto+" , Nombre: "+nombre+" , precio: "+precio;
        }
}
