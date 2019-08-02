
package Aritmetica;
public class Aritmetica {
    int a,b;
    //creo un constructor vacio
    public Aritmetica(){
    
}
    public Aritmetica(int arg1,int arg2){
     
        a=arg1;
        b=arg2;      
    }
    
    public int Sumar(int op1, int op2){
    return op1+op2;
    }   
    public int Restar(int op1, int op2){
    return op1-op2;
    }   
    public int Multiplicar(int op1, int op2){
    return op1*op2;
    }   
    public float Dividir(float op1, float op2){
    return op1/op2;
    }   
        public int Sumar(){
    return a+b;
    }   
    public int Restar(){
    return a-b;
    }   
    public int Multiplicar(){
    return a*b;
    }   
    public float Dividir(){
    return a/b;
    }   
}
