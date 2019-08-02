
package pruebaizaalex;

public class PruebaIzaAlex {

 
    public static void main(String[] args) {
    
        Caja caja1 = new Caja();
       int resultadoVolumen=caja1.calculeVolumen();
       caja1.getAlto();
        caja1.getAncho();
         caja1.getProfundo();
      
        System.out.println("El volumen  es: " +resultadoVolumen);
    System.out.println("El valor de la Altura es: " +caja1.getAlto());
        System.out.println("El valor de Ancho es: " +caja1.getAncho());
                System.out.println("El valor de la Profundidad es: " +caja1.getProfundo());


        
}
}